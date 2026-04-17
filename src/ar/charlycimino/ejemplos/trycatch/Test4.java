
package ar.charlycimino.ejemplos.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public final class Test4 {

    /** Valor fijo del dividendo. */
    private static final int X_VALUE = 10;

    private Test4() {
    }

    /**
     * Prueba con manejo de excepciones (multicatch).
     * @param args argumentos de línea de comandos
     */
    public static void main(final String[] args) {
        final int x = X_VALUE;
        int y;
        int z;
        System.out.print("Ingrese y: ");
        try {
            y = new Scanner(System.in).nextInt();
            z = x / y;
            System.out.println("Resultado: " + z);
        } catch (InputMismatchException ime) {
            System.out.println("No es un entero... ¬¬");
        } catch (ArithmeticException ae) {
            System.out.println("No se puede dividir por cero");
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace(System.out);
        }
        System.out.println("Adiós");
    }
}
