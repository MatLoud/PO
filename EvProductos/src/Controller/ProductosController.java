
package Controller;

import Model.Productos;
import java.util.ArrayList;

public class ProductosController {
  private final ArrayList<Productos> inventario;

    public ProductosController() {
        this.inventario = new ArrayList<>();
    }
   public String agregarProducto(String nombre, double precio, int cantidad) {
        if (precio < 0 || cantidad < 0) {
        return "Error: valores no pueden ser negativos.";
        }
        Productos producto = new Productos(nombre, precio, cantidad);
        inventario.add(producto);
        return "Producto agregado correctamente.";
    }
   
     // Método para calcular el total de la factura
    public double calcularTotalFactura() {
        double total = 0;
        for (Productos producto : inventario) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }
    public Object[][] obtenerDatosTabla() {
        
        Object[][] datos = new Object[inventario.size()][3];

        for (int i = 0; i < inventario.size(); i++) {
            Productos producto = inventario.get(i);
            datos[i][0] = producto.getNombre();      // Columna 1: Nombre
            datos[i][1] = producto.getPrecio();      // Columna 2: Precio
            datos[i][2] = producto.getCantidad();    // Columna 3: Cantidad
        }

        return datos;
    }
}

