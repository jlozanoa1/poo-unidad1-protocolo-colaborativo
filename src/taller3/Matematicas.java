public final class Matematicas {
    private Matematicas() {
        throw new UnsupportedOperationException("Esta clase no puede ser instanciada.");
    }

    public static double suma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        return resultado;
    }

    public static double resta(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        return resultado;
    }

    public static double multiplicacion(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        return resultado;
    }

    public static double division(double numerador, double denominador) throws IllegalArgumentException {
        if (denominador == 0) {
            throw new IllegalArgumentException("No es posible dividir entre 0.");
        }
        double resultado = numerador / denominador;
        return resultado;
    }
}
