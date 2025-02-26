
package controller;

import java.util.ArrayList;
import model.Paciente;

public class GestionPaciente {
    public ArrayList<Paciente> pacienteList=new ArrayList<>();
    
    public void AggPaaciente(String nombre,String cedula,int edad, boolean sexo){
    Paciente p=new Paciente(cedula, nombre, edad, sexo);
    pacienteList.add(p);}
    
    public void listado(){
    for (Paciente p:pacienteList){System.out.println(p.getNombres()+" "+p.getEdad());}
    }
            
}
