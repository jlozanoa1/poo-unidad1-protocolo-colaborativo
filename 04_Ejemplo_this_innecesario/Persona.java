package ejemplo04;

public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        this.mostrarNombre();
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}
