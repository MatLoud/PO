
package model;

public class Paciente {
  private String nombre;
    private int edad;
    private String identificacion;
    
    public Paciente(String nombre, int edad, String identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
    }
    
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getIdentificacion() { return identificacion; }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", ID: " + identificacion;
    }   
}
