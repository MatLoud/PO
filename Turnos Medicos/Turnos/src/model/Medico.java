/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Laboratorios DCCO
 */
public class Medico extends Paciente{
    public String especialidad;

    public Medico(String especialidad, String nombre, String cedula, int edad, boolean sexo) {
        super(nombre, cedula, edad, sexo);
        this.especialidad = especialidad;
    }
    
}
