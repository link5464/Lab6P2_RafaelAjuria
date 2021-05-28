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
public class Jugador extends Integrantes {
    int Numero;
    int PartidosJugados;
    int CopasGanadas;
    int TarjetasAmarillas;
    int TarjetasRojas;
    int DuracionContrato;

    public Jugador(int Numero, int PartidosJugados, int CopasGanadas, int TarjetasAmarillas, int TarjetasRojas, int DuracionContrato, String Nombre, String Apellido, String Nacionalidad, int Edad) {
        super(Nombre, Apellido, Nacionalidad, Edad);
        this.Numero = Numero;
        this.PartidosJugados = PartidosJugados;
        this.CopasGanadas = CopasGanadas;
        this.TarjetasAmarillas = TarjetasAmarillas;
        this.TarjetasRojas = TarjetasRojas;
        this.DuracionContrato = DuracionContrato;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getPartidosJugados() {
        return PartidosJugados;
    }

    public void setPartidosJugados(int PartidosJugados) {
        this.PartidosJugados = PartidosJugados;
    }

    public int getCopasGanadas() {
        return CopasGanadas;
    }

    public void setCopasGanadas(int CopasGanadas) {
        this.CopasGanadas = CopasGanadas;
    }

    public int getTarjetasAmarillas() {
        return TarjetasAmarillas;
    }

    public void setTarjetasAmarillas(int TarjetasAmarillas) {
        this.TarjetasAmarillas = TarjetasAmarillas;
    }

    public int getTarjetasRojas() {
        return TarjetasRojas;
    }

    public void setTarjetasRojas(int TarjetasRojas) {
        this.TarjetasRojas = TarjetasRojas;
    }

    public int getDuracionContrato() {
        return DuracionContrato;
    }

    public void setDuracionContrato(int DuracionContrato) {
        this.DuracionContrato = DuracionContrato;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
