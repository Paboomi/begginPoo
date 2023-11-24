/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author saien
 */
public class Consultor extends Persona {
    String nombre_consultor;
    int num_consultor;

    public Consultor() {
    }

    public Consultor(String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(dni, nombre, apellido, domicilio, telefono);
    }

    public String getNombre_consultor() {
        return nombre_consultor;
    }

    public void setNombre_consultor(String nombre_consultor) {
        this.nombre_consultor = nombre_consultor;
    }

    public int getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }
    
}
