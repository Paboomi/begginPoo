/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author saien
 */
public class Empleado extends Persona {
    String nombre;
    String apellido;
    int num_Docuemnto ;

    public Empleado() {
    }

    public Empleado(String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(dni, nombre, apellido, domicilio, telefono);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNum_Docuemnto() {
        return num_Docuemnto;
    }

    public void setNum_Docuemnto(int num_Docuemnto) {
        this.num_Docuemnto = num_Docuemnto;
    }
    
    
}
