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
public class Psicologos extends Integrantes {
    String Titulo;
    int ID;
    String Especialidad;
    int CntInformes;
    int CntPacientes;

    public Psicologos(String Titulo, int ID, String Especialidad, String Nombre, String Apellido, String Nacionalidad, int Edad) {
        super(Nombre, Apellido, Nacionalidad, Edad);
        this.Titulo = Titulo;
        this.ID = ID;
        this.Especialidad = Especialidad;
        this.CntInformes = 0;
        this.CntPacientes = 0;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public int getCntInformes() {
        return CntInformes;
    }

    public void setCntInformes(int CntInformes) {
        this.CntInformes = CntInformes;
    }

    public int getCntPacientes() {
        return CntPacientes;
    }

    public void setCntPacientes(int CntPacientes) {
        this.CntPacientes = CntPacientes;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
