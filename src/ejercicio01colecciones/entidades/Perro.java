/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01colecciones.entidades;

/**
 *
 * @author Sofía Cropalati
 */
public class Perro {
    private String nombre;
    private String raza;
//constructor vacio
    public Perro() {
    }
//constructor parametrizad
    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
//getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
//toString
    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + '}';
    }
    
}
