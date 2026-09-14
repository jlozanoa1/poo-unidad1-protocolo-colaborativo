import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ejecutarMatematicas(teclado);

        // ejecutarCoches(teclado);
    }

    private static void ejecutarMatematicas(Scanner teclado) {
        System.out.println("Prueba de ejecución de la clase Matematicas.");

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

    public static void ejecutarCoches(Scanner teclado) {
        System.out.println("Prueba de ejecución de la clase Coche.");

        // Instanciar coche A
        System.out.print("Ingrese la marca del coche A: ");
        String marcaA = teclado.nextLine();
        System.out.print("Ingrese el modelo del coche A: ");
        String modeloA = teclado.nextLine();
        Coche cocheA = new Coche(marcaA, modeloA);

        // Instanciar coche B
        System.out.print("Ingrese la marca del coche B: ");
        String marcaB = teclado.nextLine();
        System.out.print("Ingrese el modelo del coche B: ");
        String modeloB = teclado.nextLine();
        Coche cocheB = new Coche(marcaB, modeloB);

        // Mostrar cantidad de instancias y atributos de
        // cada instancia
        System.out.println("Total de coches instanciados: " + Coche.getContadorCoches());

        System.out.println("Coche A.");
        System.out.println(cocheA.toString());

        System.out.println("Coche B.");
        System.out.println(cocheB.toString());
    }
}
