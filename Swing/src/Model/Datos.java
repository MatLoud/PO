
package Model;

/**
 *
 * @author Defolt
 */
public class Datos {
    public String nombre;
    public int edad;
    public int cedula;

    // Constructor
    public Datos(String nombre, int edad, int cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getCedula() {
        return cedula;
    }

  

    @Override
    public String toString() {
        return "Nombre: " + nombre + " que tiene la edad de " + edad + " años y cedula: " + cedula ;
    }   

    public void setNombre(String nuevoNombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setEdad(int nuevaEdad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setCedula(int nuevaCedula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
