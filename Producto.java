public abstract class Producto {

    private String nombre;
    private double precioUnitario;
    private int cantStock;
    private boolean disponible = false;
    public static int dimesionArray;

    public Producto() {
    }

    public Producto(String nombre, double precioUnitario, int cantStock, boolean disponible) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantStock = cantStock;
        this.disponible = disponible;

        dimesionArray++;// Según número de instancias del constructor
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + "x" +
                "Precio unidad: " + this.getPrecioUnitario() + " x " +
                "En Stock: " + this.getCantStock() + "x";
    }

    // Get and Set
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return this.precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnit = precioUnitario;
    }

    public int getCantStock() {
        return this.cantStock;
    }

    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }

    public boolean isDisponible() {
        if (getCantStock() > 0)
            this.disponible = true;
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
