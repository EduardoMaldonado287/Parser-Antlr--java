/*
 * Clase que se utilizó para para los errores semánticos
 */
package matrixL;

/**
 *
 * @author eduar
 */
class SemanticException extends Exception{

    private String message = null;

    public SemanticException() {
        super();
    }

    public SemanticException(String message) {
        super(message);
        this.message = message;
    }

    public SemanticException(Throwable cause) {
        cause = null;
    }

    @Override
    public String toString() {
        return message;
    }

    @Override
    public String getMessage() {
        return message;
    }
    
}
