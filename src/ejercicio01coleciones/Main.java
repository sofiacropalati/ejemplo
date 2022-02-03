/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01coleciones;

import ejercicio01colecciones.entidades.Perro;
import ejercicio01coleciones.servicios.ServicioPerro;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sofía Cropalati
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Perro>ListaPerros= new ArrayList();
        ServicioPerro sp = new ServicioPerro();
        
        String seguir;
        do{
            
  sp.crearyAgregarPerro(ListaPerros);
       
            System.out.println("Desea seguir agregando perros? s/n ");
            seguir=leer.next();
           
        }while (seguir.equals("s"));
        
        
                sp.mostrarPerros(ListaPerros);
                
                System.out.println("-------------------------------------------");
                
                sp.buscarYMostrarPerro(ListaPerros, "mia");
        sp.buscarYEliminarPerroPorRaza(ListaPerros);
        sp.mostrarPerros(ListaPerros);
        
        //Agrego una linea
    }
    
}
