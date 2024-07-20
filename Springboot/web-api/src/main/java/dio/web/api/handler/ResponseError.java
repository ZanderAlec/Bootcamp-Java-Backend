package dio.web.api.handler;

import java.util.Date;

//Erros também podem ser objetos.
public class ResponseError {
    //momento exato da geração da exceção
    private Date timeStamp = new Date();
    //campo customizado para direcionar melhor sobre o erro.
    private String status = "error";
    //número do erro no dicionário da erro da aplicação.
    private int statusCode = 400;
    //mensagem de erro
    private String error;

    public void setError(String error) {
        this.error = error;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getError() {
        return error;
    }

    public String getStatus() {
        return status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }


}
