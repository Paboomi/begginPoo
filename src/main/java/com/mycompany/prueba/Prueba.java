/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba;

/**
 *
 * @author saien
 */
public class Prueba {

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno(5, "Jorge", "Gutierrez");
        
        System.out.println("el id del alumno 2 es: " + alumno2.getId());
        System.out.println("el nombre del alumno 2 es: " + alumno2.getNombre());
        System.out.println("el apellido del alumno 2 es: " + alumno2.getApellido());
        
        alumno1.setId(4);
        alumno1.setNombre("FEDERICO");
        alumno1.setApellido("LOPEZ");
        
        System.out.println("\n-------------------------------------\n");
        
        System.out.println("el id del alumno 1 es: " + alumno1.getId());
        System.out.println("el nombre del alumno 1 es: " + alumno1.getNombre());
        System.out.println("el apellido del alumno 1 es: " + alumno1.getApellido());
        
        System.out.println("\n-------------------------------------\n");
        alumno2.setId(25);
        System.out.println("el id del alumno 2 es: " + alumno2.getId());
    }
}
