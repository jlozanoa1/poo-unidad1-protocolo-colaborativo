import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Prueba de ejecución de la clase Matematicas.");

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el valor del número A: ");
        double numeroA = teclado.nextDouble();

        System.out.print("Ingrese el valor del número B: ");
        double numeroB = teclado.nextDouble();

        System.out.printf("%nA. Sumar%nB. Restar%nC. Multiplicar%nD. Dividir%n%n");
        System.out.print("¿Qué operación quiere realizar? ");
        char operacion = Character.toLowerCase(teclado.next().charAt(0));

        double resultado;
        switch (operacion) {
            case 'a':
                resultado = Matematicas.suma(numeroA, numeroB);
                System.out.printf("%nEl resultado es: %.2f.%n", resultado);
                break;

            case 'b':
                resultado = Matematicas.resta(numeroA, numeroB);
                System.out.printf("%nEl resultado es: %.2f.%n", resultado);
                break;

            case 'c':
                resultado = Matematicas.multiplicacion(numeroA, numeroB);
                System.out.printf("%nEl resultado es: %.2f.%n", resultado);
                break;

            case 'd':
                try {
                    resultado = Matematicas.division(numeroA, numeroB);
                    System.out.printf("%nEl resultado es: %.2f.%n", resultado);
                } catch (IllegalArgumentException e) {
                    System.out.printf("%nError: %s%n", e.getMessage());
                }
                break;

            default:
                System.out.println("Ingrese una operación válida (A, B, C, D).");
        }
    }
}
