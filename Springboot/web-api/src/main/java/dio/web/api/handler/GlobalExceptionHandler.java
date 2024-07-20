package dio.web.api.handler;

import org.springframework.cglib.proxy.UndeclaredThrowableException;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jakarta.annotation.Resource;

//Todos os exceptions handlers são focados nessa única classe.
public class GlobalExceptionHandler  extends ResponseEntityExceptionHandler{

    @Resource
    //pega mensagens das exceptions executadas nas requisições http.
    private MessageSource messageSource;
    //Método com configurações relacionadas ao cabeçalho da resposta.
    private HttpHeaders headers(){
        HttpHeaders headers = new HttpHeaders();
        //informa que o contéudo será um json
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

    //instancia o ResponseError
    private ResponseError responseError(String message,HttpStatus statusCode){
        ResponseError responseError = new ResponseError();
        responseError.setStatus("error");
        responseError.setError(message);
        responseError.setStatusCode(statusCode.value());
        return responseError;
    }

    //Ao captar excepções na aplicação faz uma verificação se é do tipo "BusinessException"
    //(exceção customizada)
    @ExceptionHandler(Exception.class)
    private ResponseEntity<Object> handleGeneral(Exception e, WebRequest request) {
        if (e.getClass().isAssignableFrom(UndeclaredThrowableException.class)) {
            UndeclaredThrowableException exception = (UndeclaredThrowableException) e;
            return handleBusinessException((BusinessException) exception.getUndeclaredThrowable(), request);
        
        //Se não for uma BusinessException gera uma exception genérica.
        } else {
            String message = messageSource.getMessage("error.server", new Object[]{e.getMessage()}, null);
            ResponseError error = responseError(message,HttpStatus.INTERNAL_SERVER_ERROR);
            return handleExceptionInternal(e, error, headers(), HttpStatus.INTERNAL_SERVER_ERROR, request);
        }
    }

    //é chamada quando uma exception do tipo BusinessException ocorre
    // e monta uma responseError com essa estrutura.
    @ExceptionHandler({BusinessException.class})
    //a mensagem é baseado na mensagem do exception gerado na aplicação.
    private ResponseEntity<Object> handleBusinessException(BusinessException e, WebRequest request) {
                                                            //status de conflito quer dizer que o resultado obtido
                                                            //não foi o esperado nas requisições.
        ResponseError error = responseError(e.getMessage(),HttpStatus.CONFLICT);


        return handleExceptionInternal(e, error, headers(), HttpStatus.CONFLICT, request);
    }
}
