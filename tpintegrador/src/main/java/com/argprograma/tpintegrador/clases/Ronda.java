/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprograma.tpintegrador.clases;

/**
 *
 * @author francobalsamo
 */
public class Ronda {
    public String nro;
    private Partido[] partidos;
    private ResultadoEnum.resultadoPartido resEnum;

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public Partido[] getPartidos() {
        return partidos;
    }

    public void setPartidos(Partido[] partidos) {
        this.partidos = partidos;
    }

    public Ronda(){}

    public Ronda(String nro, Partido[] partidos) {
        this.nro = nro;
        this.partidos = partidos;
    }
    
    public int puntos(){
        int resultadoPuntos = 0;
        if(resEnum == ResultadoEnum.resultadoPartido.GANADOR){
            resultadoPuntos = 3;
        }
        if(resEnum == ResultadoEnum.resultadoPartido.PERDEDOR){
            resultadoPuntos = 0;
        }
        if(resEnum == ResultadoEnum.resultadoPartido.EMPATE){
            resultadoPuntos = 1;
        }
        return resultadoPuntos;
    }
}