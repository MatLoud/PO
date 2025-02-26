
package controller;

import java.util.ArrayList;
import model.Paciente;

public class GestionPaciente {
    public ArrayList<Paciente> pacientes;
    private static GestionPaciente instancia;

    public GestionPaciente() {
        this.pacientes = new ArrayList<>();
    }
    public static GestionPaciente getInstancia(){
    if(instancia==null){instancia=new GestionPaciente();}return instancia;}
    
    public Paciente añadirPaciente(String nombre, String cedula, int edad, boolean sexo){
    Paciente p=new Paciente(nombre, cedula, edad, sexo);
    pacientes.add(p);
    return p;}
    
    public ArrayList<Paciente> listado(){
    return pacientes;}
    public ArrayList<Paciente> listadoCed(String cedula){
    ArrayList<Paciente> nuevoListado= new ArrayList<>();
    for (Paciente paciente:pacientes){
    if(paciente.getCedula().contains(cedula)){nuevoListado.add(paciente);}}
    return nuevoListado;}
}
