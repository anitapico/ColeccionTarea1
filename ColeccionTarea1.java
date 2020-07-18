/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciontarea1;

/**
 *
 * @author Anita Pico 
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collection;

public class ColeccionTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("    UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("             INGENIERIA AUTOMOTRIZ");
        System.out.println("Nombre: Pico Solis Ana Graciela");
        System.out.println("Materia: Programación ");
        System.out.println("NRC: 7450");
        
        Collection MaterialesProyecto = new ArrayList<String>();
        MaterialesProyecto.add("Circuito integrado LM386 ");
        MaterialesProyecto.add("\n Resistencia 10 ohmios ");
        MaterialesProyecto.add("\n Condensador cerámico 0.047 uf");
        MaterialesProyecto.add("\n Condensador cerámico 0.01 uf");
        MaterialesProyecto.add("\n Condensador electrolitico 10 uf");
        MaterialesProyecto.add("\n Condensador electrolitico 100 uf");
        MaterialesProyecto.add("\n Condensador electrolitico 220 uf");
        MaterialesProyecto.add("\n Potenciometro 10 Kilo Ohmios");
        MaterialesProyecto.add("\n Jack 1/8'' ");
        MaterialesProyecto.add("\n Parlante de 8 Ohmios, 5W");
        MaterialesProyecto.add("\n Bateria 9V");
        MaterialesProyecto.add("\n Pinzas");
        MaterialesProyecto.add("\n Cinta");
                
        System.out.println(" El número de materiales para utilizar son: " +MaterialesProyecto.size()+"\n");
        System.out.println("Los materiales utilizados son: ");
        System.out.println(MaterialesProyecto.toString());
        
        MaterialesProyecto.remove("\n Pinzas");
        MaterialesProyecto.remove("\n Cinta");
        System.out.println("Elementos utilizados en el Proyecto: "+MaterialesProyecto.size());
        System.out.println("Los materiales utilizados son: ");
        System.out.println(MaterialesProyecto.toString());
            
        
    }
    
}
