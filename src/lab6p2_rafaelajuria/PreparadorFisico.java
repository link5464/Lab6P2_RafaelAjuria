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
public class PreparadorFisico extends Integrantes {
    int Contrato;
    int ID;
    String Especialidad;
    String Titulo;

    public PreparadorFisico(int Contrato, int ID, String Especialidad, String Titulo, String Nombre, String Apellido, String Nacionalidad, int Edad) {
        super(Nombre, Apellido, Nacionalidad, Edad);
        this.Contrato = Contrato;
        this.ID = ID;
        this.Especialidad = Especialidad;
        this.Titulo = Titulo;
    }

    public int getContrato() {
        return Contrato;
    }

    public void setContrato(int Contrato) {
        this.Contrato = Contrato;
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

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
