package ejemplo02;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Coche coche2 = new Coche("Toyota", 180);

        coche1.mostrarInformacion();
        coche2.mostrarInformacion();
    }
}
