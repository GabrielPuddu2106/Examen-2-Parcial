public class Gestion {

    private Producto productos[] = null;

    private double caja;

    // Constructores

    public Gestion() {
    }

    public Gestion(Producto[] productos) {
        this.productos = productos;
    }

    // Metodos

    public Producto[] agregarProductos() {
        return productos;
    }

    public void mostrarProductos(Producto[] productos) {
        for (int i = 0; i < productos.length; i++) {
            System.out.print(productos[i] + "x----------------x");
        }

    }

    public void mostrarNombreProductos(Producto[] productos) {
        for (int i = 0; i < productos.length; i++) {
            System.out.println(i + 1 + " " + productos[i].getNombre() + "x");
        }
        System.out.println("x--------------x");
    }

    public double comprarProducto(Producto[] productos, int numero, int numeroUnidades) {
        if (productos[num - 1].isDisponible()) {
            if (productos[num - 1].getCantStock() >= cantidadUnidades) {
                System.out.println("La compra se ha realizado con éxito!!n");
                productos[num - 1].setCantStock(productos[num - 1].getCantStock() - cantidadUnidades);
                return caja += cantidadUnidades * productos[num - 1].getPrecioUnit();
            } else {
                System.out.println("No hay cantidad suficiente de producto");
            }
        } else {
            System.out.println("No hay cantidad suficiente de producto");
        }
        return caja;
    }

    public double mostrarCaja() {
        System.out.print("El total de la caja es ");
        caja = Math.round(caja * 100);
        return caja / 100;
    }
}
