package ejercicio2;

public class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante() {
        this("Estudiante sin nombre", 0);
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarEstudiante() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }
}
