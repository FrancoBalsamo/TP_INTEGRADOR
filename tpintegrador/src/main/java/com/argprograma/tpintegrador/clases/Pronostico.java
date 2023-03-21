/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprograma.tpintegrador.clases;

/**
 *
 * @author francobalsamo
 */
public class Pronostico {
    private Partido partido;
    private Equipo equipo;
    private ResultadoEnum resultado;
    private ResultadoEnum.resultadoPartido resEnum;

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public ResultadoEnum getResultado() {
        return resultado;
    }

    public void setResultado(ResultadoEnum resultado) {
        this.resultado = resultado;
    }

    public Pronostico() {
    }

    public Pronostico(Partido partido, Equipo equipo, ResultadoEnum resultado) {
        this.partido = partido;
        this.equipo = equipo;
        this.resultado = resultado;
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
