
package inventario;


// Clase Producto
class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    // Método para calcular el valor total del producto
    public double calcularValor() {
        return precio * cantidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio + ", Cantidad: " + cantidad + ", Valor total: " + calcularValor();
    }
}
