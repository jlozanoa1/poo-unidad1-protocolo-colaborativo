package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante("Carlos", 20);

        System.out.println("Estudiante 1:");
        estudiante1.mostrarEstudiante();

        System.out.println();
        System.out.println("Estudiante 2:");
        estudiante2.mostrarEstudiante();
    }
}
