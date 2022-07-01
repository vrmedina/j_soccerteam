/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipofutbol;

import java.util.ArrayList;
import java.util.Scanner;
//Abstraccion, Encapsulamiento, Herencia, Polimorfismo
//Los 4 pilares de la Programacion Orientada a Objetos
/**
 *
 * @author Victor Medina
 */
public class Main {
    static Scanner in = new Scanner(System.in);
    static ArrayList<Persona> persona = new ArrayList<Persona>();
    static Persona navas = new Futbolista(1,"Portero", "Keylor", "Navas", 35);
    static Persona hakimi = new Futbolista(2,"Defensa", "Achraf", "Hakimi", 23);
    static Persona kimpembe = new Futbolista(3,"Defensa", "Presnel", "Kimpembe", 26);
    static Persona pereira = new Futbolista(15,"Medio", "Danilo", "Pereira", 30);
    static Persona marquinhos = new Futbolista(5,"Defensa", "Marcos", "Marquinhos", 28);
    static Persona ramos = new Futbolista(4,"Defensa", "Sergio", "Ramos", 23);
    static Persona dimaria = new Futbolista(11,"Medio", "Angel", "Di Maria", 34);
    static Persona verratti = new Futbolista(6,"Medio", "Marco", "Verratti", 29);
    static Persona mbappe = new Futbolista(7,"Delantero", "Kylian", "Mbappe", 23);
    static Persona messi = new Futbolista(30,"Delantero", "Lionel", "Messi", 35);
    static Persona neymar = new Futbolista(10,"Delantero", "Neymar", "da Silva", 30);

    static Persona entrenador = new Entrenador("Ofensiva", "Mauricio", "Pochettino", 50);
    static Persona doctor = new Doctor("Fisioterapeuta", 20, "Christophe", "Baudot", 55);

    public static void main(String[] args) {
        persona.add(navas);
        persona.add(hakimi);
        persona.add(kimpembe);
        persona.add(pereira);
        persona.add(marquinhos);
        persona.add(ramos);
        persona.add(dimaria);
        persona.add(verratti);
        persona.add(mbappe);
        persona.add(messi);
        persona.add(neymar);
        persona.add(entrenador);
        persona.add(doctor);
        
        menu();
    }
    
    public static void menu() {
        int op;
        do {
            System.out.println("\t ***MENU***");
            System.out.println("1. Viaje de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de futbol");
            System.out.println("4. Planificar entrenamiento");
            System.out.println("5. Entrevista");
            System.out.println("6. Curar lesion");
            System.out.println("7. Salir");
            System.out.print("Opcion: ");
            op = in.nextInt();
            
            switch (op) {
                case 1://Viaje de equipo
                    System.out.println("");
                    viajar();
                    break;
                case 2://Entrenamiento
                    System.out.println("");
                    entrenar();
                    break;
                case 3://Partido de futbol
                    System.out.println("");
                    partido();
                    break;
                case 4://Planificar entrenamiento
                    System.out.println("");
                    planificar();
                    break;
                case 5://Entrevista
                    System.out.println("");
                    entrevista();
                    break;
                case 6://Curar lesion
                    System.out.println("");
                    curar();
                    break; 
                case 7://Salir
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion incorrecta, intente de nuevo");
            }
            
        } while (op != 7);
        
    }
    
    public static void viajar() {
        for (Persona equipo: persona) {
            System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
            equipo.viajar();
        }
    }
    
    public static void entrenar() {
        for (Persona equipo: persona) {
            System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
            equipo.entrenamiento();
        }
    }
    
    public static void partido() {
        for (Persona equipo: persona) {
            System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
            equipo.partido();
        }
    }
    
    public static void planificar() {
        System.out.print(entrenador.getNombre()+" "+entrenador.getApellido()+" -> ");
        ((Entrenador)entrenador).planificar();
    }
    
    public static void entrevista() {
        System.out.print(messi.getNombre()+" "+messi.getApellido()+" -> ");
        ((Futbolista)messi).entrevista();
        System.out.print(neymar.getNombre()+" "+neymar.getApellido()+" -> ");
        ((Futbolista)neymar).entrevista();
        System.out.print(mbappe.getNombre()+" "+mbappe.getApellido()+" -> ");
        ((Futbolista)mbappe).entrevista();
    }
    
    public static void curar() {
        System.out.print(doctor.getNombre()+" "+doctor.getApellido()+" -> ");
        ((Doctor)doctor).curar();
    }
    
}
