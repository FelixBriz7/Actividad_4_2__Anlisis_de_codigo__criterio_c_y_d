
package ar.charlycimino.ejemplos.excepcionespropias;

import java.io.Serial;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class IntegerOverflowException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public IntegerOverflowException() {
    }

    public IntegerOverflowException(String message) {
        super(message);
    }

    public IntegerOverflowException(String message, Throwable cause) {
        super(message, cause);
    }

    public IntegerOverflowException(Throwable cause) {
        super(cause);
    }
    
}
