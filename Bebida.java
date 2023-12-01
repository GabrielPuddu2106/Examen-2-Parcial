public class Bebida extends Producto {
    // Atributos

    private String sabor;

    // Constructor
    public Bebida() {
    }

    public Bebida(String nombre, double precioUnitario, int cantStock, boolean disponible, String sabor) {
        super(nombre, precioUnitario, cantStock, disponible);
        this.sabor = sabor;
    }

    // Metodos

    @Override
    public String toString() {
        return "Articulo Bebida\n" +
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