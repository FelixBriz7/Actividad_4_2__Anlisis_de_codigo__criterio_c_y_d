
package ar.charlycimino.ejemplos.excepcionespropias;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Test9 {

    private static final Logger LOGGER = Logger.getLogger(Test9.class.getName());

    @SuppressWarnings("java:S1172")
    public static void main(String[] args) {
        int y;
        int z;
        LOGGER.info("Ingrese y: ");
        y = new Scanner(System.in).nextInt();
        z = new Calculadora().factorial(y);
        LOGGER.log(Level.INFO, "Resultado: {0}", z);
        LOGGER.info("Adiós!");
    }
}
