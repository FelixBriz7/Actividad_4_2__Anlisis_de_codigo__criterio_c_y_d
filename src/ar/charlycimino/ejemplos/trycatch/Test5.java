package ar.charlycimino.ejemplos.trycatch;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public final class Test5 {

    /** Valor máximo de un entero. */
    private static final int MAX_INT = 2147483647;

    private Test5() {
    }

    /*
      ¿Dónde se lanza la excepción?
    */
    /**
     * Prueba dónde se lanza la excepción.
     * @param args argumentos de línea de comandos
     */
    public static void main(final String[] args) {
        int x = Math.incrementExact(MAX_INT);
        System.out.println(x);
    }

}
