import java.util.Scanner;

public class MiniTienda {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("BIENVENIDO A LA TIENDA\n----------------\n" +
                "LOS ARTICULOS SOLO SE VENDEN SI ESTAN DISPONIBLES\n" +
                "El CLIENTE PUEDE:\n" +
                "\t Comprar productos en existencia.\n" +
                "\t Añadir nuevos productos a la canasta.\n" +
                "\t Consultar importe a pagar.");

        boolean continuar = true;
        int lectProduto, lectCantidad;
        int opc;

        // Instanciamiento de Productos
        Producto bebida = new Bebida("California", 18.50, 5, true, "Fresa");
        Producto galleta = new Galleta("Oreo", 10.50, 2, true, "Chocolate");

        // Array catalogo para guardar los productos

        Producto catalogo[] = new Producto[Producto.dimesionArray];

        // Objeto Gestion para mostrar todo
        Gestion gestion = new Gestion();

        // Se rellena el arreglo
        catalogo[0] = bebida;
        catalogo[1] = galleta;

        do {
            System.out.println("\n\tMENU");
            System.out.println("1. Mostrar Producto");
            System.out.println("2. Vender Producto ");
            System.out.println("3. Mostrar Caja ");
            System.out.println("4. salir ");
            System.out.print("Digite una opcion: ");
            opc = lector.nextInt();

            switch (opc) {
                case 1:
                    gestion.mostrarProductos(catalogo);
                    break;
                case 2:
                    System.out.println("Que producto desea comprar");
                    gestion.mostrarNombreProductos(catalogo);
                    lectProduto = lector.nextInt();
                    System.out.println("Que cantidad desea comprar");
                    lectCantidad = lector.nextInt();
                    // Cargamos el producto y la cantidad
                    gestion.comprarProducto(catalogo, lectProduto, lectCantidad);
                    break;

                case 3:
                    System.out.println(gestion.mostrarCaja() + " $");
                    break;

                default:
                    // Saliendo de la app
                    continuar = false;
            }
        } while (opc != 4);
    }
}
