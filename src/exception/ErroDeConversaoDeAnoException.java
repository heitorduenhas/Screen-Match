package exception;

public class ErroDeConversaoDeAnoException extends RuntimeException{
    public String message;

    public ErroDeConversaoDeAnoException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
