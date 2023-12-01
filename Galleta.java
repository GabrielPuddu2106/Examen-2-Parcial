public class Galleta extends Producto {

    // Atributos
    private String sabor;

    public Galleta() {
    }

    public Galleta(String nombre, double precioUnitario, int cantStock, boolean disponible, String sabor) {
        super(nombre, precioUnitario, cantStock, disponible);
        this.sabor = sabor;
    }

    // Metodos

    @Override
    public String toString() {
        return "Articulo Galleta\n" +
                super.toString() +
                "Sabor:" + this.sabor;
    }

    // SET AND GET
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

}
