public class ErrorAccesoEstatico {
    private static int contadorObjetos = 0;
    private int id;

    public ErrorAccesoEstatico() {
        this.id = contadorObjetos + 1;
        contadorObjetos++;
    }

    public static void cambiarId() {
        id = 100;
    }
}
