
package inventario;
import java.util.ArrayList;
public class InventarioTienda {
   
    private ArrayList<Producto> inventario;

    // Constructor
    public InventarioTienda() {
        this.inventario = new ArrayList<>();
    }

    // Método para agregar productos
   public void agregarProducto(String nombre, double precio, int cantidad) {
        if (precio < 0 || cantidad < 0) {
            System.out.println("Error: El precio y la cantidad no pueden ser negativos.");
            return;
        }
        Producto producto = new Producto(nombre, precio, cantidad);
        inventario.add(producto);
        System.out.println("Producto agregado correctamente.");
    }

    // Método para mostrar el listado de productos
    public void mostrarProductos() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario esta vacio.");
        } else {
            for (Producto producto : inventario) {
                System.out.println(producto);
            }
        }
    }

    // Método para buscar un producto por nombre
    public void buscarProducto(String nombre) {
        boolean encontrado = false;
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(producto);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }

    // Método para calcular el valor total del inventario
    public void calcularValorTotal() {
        double valorTotal = 0;
        for (Producto producto : inventario) {
            valorTotal += producto.calcularValor();
        }
        System.out.println("El valor total del inventario es: " + valorTotal);
    }

    // Método para eliminar un producto por nombre
    public void eliminarProducto(String nombre) {
        boolean eliminado = false;
        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).getNombre().equalsIgnoreCase(nombre)) {
                inventario.remove(i);
                System.out.println("Producto eliminado correctamente.");
                eliminado = true;
                break;
            }
        }
        if (!eliminado) {
            System.out.println("Producto no encontrado.");
        }
    }
}
