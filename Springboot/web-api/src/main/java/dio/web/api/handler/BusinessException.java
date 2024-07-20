package dio.web.api.handler;


//classe que serve para centralizar todas as exceções de negócio da aplicação.
public class BusinessException extends RuntimeException{

    public BusinessException(String mensagem){
        super(mensagem);
    }

    public BusinessException(String mensagem, Object...params){
        super(String.format(mensagem, params));
    }
}
