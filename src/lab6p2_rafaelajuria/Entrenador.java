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
public class Entrenador extends Integrantes {
    int Contrato;
    int CopasGanadas;

    public Entrenador(int Contrato, int CopasGanadas, String Nombre, String Apellido, String Nacionalidad, int Edad) {
        super(Nombre, Apellido, Nacionalidad, Edad);
        this.Contrato = Contrato;
        this.CopasGanadas = CopasGanadas;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

    public int getContrato() {
        return Contrato;
    }

    public void setContrato(int Contrato) {
        this.Contrato = Contrato;
    }

    public int getCopasGanadas() {
        return CopasGanadas;
    }

    public void setCopasGanadas(int CopasGanadas) {
        this.CopasGanadas = CopasGanadas;
    }
    
}
