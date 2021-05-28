/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_rafaelajuria;

/**
 *
 * @author rajur
 */
public class Integrantes {
    String Nombre;
    String Apellido; 
    String Nacionalidad;
    int Edad;

    public Integrantes(String Nombre, String Apellido, String Nacionalidad, int Edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Nacionalidad = Nacionalidad;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return Nombre + " " + Apellido;
    }
    
    
}
