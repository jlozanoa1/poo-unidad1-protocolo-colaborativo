package ejemplo01;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota");

        coche.mostrarMarca();

        coche.setMarca("Mazda");
        coche.mostrarMarca();
    }
}
