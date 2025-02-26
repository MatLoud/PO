
package model;

public class Medico extends Paciente{
    public Especialidad esp;

    public Medico(Especialidad esp, String cedula, String nombres, int edad, boolean sexo) {
        super(cedula, nombres, edad, sexo);
        this.esp = esp;
    }

    public Especialidad getEsp() {
        return esp;
    }

    public void setEsp(Especialidad esp) {
        this.esp = esp;
    }


    
 
}
