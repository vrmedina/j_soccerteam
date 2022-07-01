/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipofutbol;

/**
 *
 * @author Victor Medina
 */
public class Doctor extends Persona{
    private String titulacion;
    private int yearsExp;

    public Doctor(String titulacion, int yearsExp, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.yearsExp = yearsExp;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getYearsExp() {
        return yearsExp;
    }
    
    @Override
    public void partido() {
        System.out.println("Da asistencia en un partido de futbol");
    }
    
    @Override
    public void entrenamiento() {
        System.out.println("Da asistencia en un entrenamiento");
    }
    
    public void curar() {
        System.out.println("Cura una lesion");
    }
}
