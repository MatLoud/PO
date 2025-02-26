
package Model;

public class Factura extends Productos{

    public Factura(String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
    }
    
    public double calcularValor() {
        return precio * cantidad;
    }  
}
