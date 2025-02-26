
package model;

public class Paciente {
  public String nombre, cedula;
  public int edad;
  public boolean sexo;

    public Paciente(String nombre, String cedula, int edad, boolean sexo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    public String getSexo(){
    return sexo? "Hombre":"Mujer";}
}
