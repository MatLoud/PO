
package evproductos;

import Controller.ProductosController;
import View.PantallaProductos;

public class EvProductos {
    public static void main(String[] args) {
     ProductosController datos=new ProductosController();
     PantallaProductos pantalla=new PantallaProductos(datos);
     pantalla.setVisible(true); //pantalla visible
     pantalla.setLocationRelativeTo(null); //metodo para que este centrada
    }
    
}
