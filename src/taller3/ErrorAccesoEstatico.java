public class ErrorAccesoEstatico {
    private static int contadorObjetos = 0;
    private int id;

    public ErrorAccesoEstatico() {
        this.id = contadorObjetos + 1;
        contadorObjetos++;
    }

    public void cambiarId() {
        id = 100;
    }

    public String getId() {
        return String.format("ID: %s%n", this.id);
    }

    public static void main(String[] args) {
        ErrorAccesoEstatico objeto1 = new ErrorAccesoEstatico();
        ErrorAccesoEstatico objeto2 = new ErrorAccesoEstatico();

        System.out.println(objeto1.getId());
        System.out.println(objeto2.getId());

        objeto1.cambiarId();

        System.out.println(objeto1.getId());
        System.out.println(objeto2.getId());
    }
}
