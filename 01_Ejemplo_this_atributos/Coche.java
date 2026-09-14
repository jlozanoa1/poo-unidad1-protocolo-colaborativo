package ejemplo01;

public class Coche {
    private String marca;

    public Coche(String marca) {
        this.marca = marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void mostrarMarca() {
        System.out.println("Marca: " + this.marca);
    }
}
