
package inventario;
import java.util.Scanner;
public class Inventario {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        InventarioTienda tienda = new InventarioTienda();

        int opcion;

        do {
            System.out.println("\n--- Gestiin de Inventario ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Buscar producto por nombre");
            System.out.println("4. Calcular valor total del inventario");
            System.out.println("5. Eliminar producto");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese la cantidad del producto: ");
                    int cantidad = scanner.nextInt();
                    tienda.agregarProducto(nombre, precio, cantidad);
                    break;
                case 2:
                    tienda.mostrarProductos();
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    tienda.buscarProducto(nombreBuscar);
                    break;
                case 4:
                    tienda.calcularValorTotal();
                    break;
                case 5:
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    tienda.eliminarProducto(nombreEliminar);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no valida.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}

