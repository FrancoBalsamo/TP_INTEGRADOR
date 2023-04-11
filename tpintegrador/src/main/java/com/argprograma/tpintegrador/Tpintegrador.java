/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.argprograma.tpintegrador;

import com.argprograma.tpintegrador.clases.Equipo;
import com.argprograma.tpintegrador.clases.Partido;
import com.argprograma.tpintegrador.clases.Pronostico;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author francobalsamo
 */
public class Tpintegrador {

    public static void main(String[] args){        
        archivos();
    }
    
    private static ArrayList<Partido> archivos(){
        BufferedReader brResultados, brPronosticos;
        
        ArrayList<Partido> arrayPartido = new ArrayList<>();
        ArrayList<Pronostico> arrayPronostico = new ArrayList<>();
        
        try{
            brResultados = new BufferedReader(new FileReader("C:\\Users\\FrancoBalsamo\\Documents\\GitHub\\TP_INTEGRADOR\\resultados.csv"));
            brPronosticos = new BufferedReader(new FileReader("C:\\Users\\FrancoBalsamo\\Documents\\GitHub\\TP_INTEGRADOR\\pronostico.csv"));
            
            brResultados.readLine();
            brPronosticos.readLine();
            
            String lineaResultados;
            String lineaPronosticos;
            
            Partido partido = new Partido();
            
            while((lineaResultados = brResultados.readLine()) != null){
                String[] arrayComas = lineaResultados.split(",");

                Equipo equipo1 = new Equipo(arrayComas[0], "descripción");
                Equipo equipo2 = new Equipo(arrayComas[3], "descripción");
                
                
                arrayPartido.add(new Partido(equipo1, equipo2, Integer.parseInt(arrayComas[1]), Integer.parseInt(arrayComas[2])));
                
                
            }
            
            
        }catch(FileNotFoundException fnfe){
            System.out.println(fnfe.getMessage());
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
        System.out.println(arrayPartido.toString());
        return arrayPartido;
    }
}