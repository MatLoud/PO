
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

    // Getters y setters
  public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; // ✅ Ahora sí modifica el atributo
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad; // ✅ Ahora sí modifica el atributo
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula; // ✅ Ahora sí modifica el atributo
    }

    @Override
    public String toString() {
        return "La persona de nombre " + nombre + ", tiene la edad de " + edad + " años y su numero de cedula es: " + cedula ;
    }   
}
