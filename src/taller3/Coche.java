public class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0;

    public Coche(String marca, String modelo) {
        String marcaNormalizado = marca.strip();
        String modeloNormalizado = modelo.strip();

        if (marcaNormalizado == null || marcaNormalizado.isEmpty()) {
            throw new IllegalArgumentException("La marca no puede estar vacía.");
        }

        if (modeloNormalizado == null || modeloNormalizado.isEmpty()) {
            throw new IllegalArgumentException("El modelo no puede estar vacío.");
        }

        this.marca = marcaNormalizado;
        this.modelo = modeloNormalizado;
        contadorCoches++;
    }

    // ----------------- GETTERS -----------------
    @Override
    public String toString() {
        return String.format("Marca: %s | Modelo: %s", this.marca, this.modelo);
    }

    public static int getContadorCoches() {
        return contadorCoches;
    }
}
