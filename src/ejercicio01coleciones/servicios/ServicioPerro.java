/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01coleciones.servicios;



import ejercicio01colecciones.entidades.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Sofía Cropalati
 */
public class ServicioPerro {
 public void crearyAgregarPerro(ArrayList<Perro>ListaPerros) {
     Scanner leer = new Scanner(System.in);
     Perro p= new Perro ();
     System.out.println("Ingrese el nombre del perro");
     p.setNombre(leer.next());
     System.out.println("Ingrese la raza del perro");
     p.setRaza(leer.next());
     
ListaPerros.add(p);

 }
 public void mostrarPerros(ArrayList<Perro>lista){
     for (int i = 0; i < lista.size(); i++) {
          System.out.println(lista.get(i).toString());
          
         
     }
 }
    public void buscarYMostrarPerro(ArrayList<Perro> lista, String nombrePerro) {
        for  (Perro perro : lista) {
            if (perro.getNombre().equals (nombrePerro)) {
                System.out.println(perro.toString());
                break;
            }
        }
        
    }
        public void buscarYEliminarPerroPorRaza(ArrayList<Perro> lista ){
            System.out.println("Ingrese la raza a eliminar");
           Scanner leer = new Scanner(System.in); 
           String raza = leer.next ();
           Iterator <Perro> it = lista.iterator();
            while (it.hasNext()) {
                Perro p = it.next();
                if (p.getRaza().equals(raza)) {
                it.remove();
            }
           
           
        }
    
        }
}