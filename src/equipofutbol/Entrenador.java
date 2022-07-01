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
public class Entrenador extends Persona{
    private String estrategia;

    public Entrenador(String estrategia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }
    
    @Override
    public void partido() {
        System.out.println("Dirige un partido de futbol");
    }
    
    @Override
    public void entrenamiento() {
        System.out.println("Dirige un entrenamiento");
    }
    
    public void planificar() {
        System.out.println("Planifica una estrategia");
    }
}
