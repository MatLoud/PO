
package model;

public class Paciente {
    public String cedula,nombres;
    public int edad;
    public boolean sexo;

    public Paciente(String cedula, String nombres, int edad, boolean sexo) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
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
    
    
}
