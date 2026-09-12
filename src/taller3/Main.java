import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Prueba de ejecución de la clase Matematicas.");

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el valor del número A: ");
        double numeroA = teclado.nextDouble();

        System.out.print("Ingrese el valor del número B: ");
        double numeroB = teclado.nextDouble();

        System.out.print("¿Qué operación quiere realizar? ");
        char operacion = Character.toLowerCase(teclado.next().charAt(0));
    }
}
