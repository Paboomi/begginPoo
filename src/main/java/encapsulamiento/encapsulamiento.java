/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulamiento;

/**
 *
 * @author saien
 */
public class encapsulamiento {
  
    public static void main(String[] args){
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(15, "Alicia", "Martin");
        
        
        System.out.println("ID: " + alu2.getId());
        System.out.println("Nombre: " + alu2.getNombre());
        System.out.println("Apellido: " + alu2.getApellido());
        
    }
    
    
    
    
}
