/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.argprograma.tpintegrador;

import com.argprograma.tpintegrador.clases.Equipo;
import com.argprograma.tpintegrador.clases.Partido;
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

    public static void main(String[] args) throws FileNotFoundException {        
        System.out.println(archivos().toString());
    }
    
    private static ArrayList<Partido> archivos() throws FileNotFoundException{
        //Scanner entrada = new Scanner(new FileReader("C:\\Users\\FrancoBalsamo\\Documents\\GitHub\\TP_INTEGRADOR\\resultados.csv"));
        //Scanner entrada = new Scanner(new FileReader("C:\\Users\\Franco Balsamo\\Documents\\GitHub\\TP_INTEGRADOR\\pronostico.csv"));
        BufferedReader br;
        ArrayList<Partido> arrayPartido = new ArrayList<>();
        try{
            br = new BufferedReader(new FileReader("C:\\Users\\FrancoBalsamo\\Documents\\GitHub\\TP_INTEGRADOR\\resultados.csv"));
            br.readLine();
            String linea;
            while((linea = br.readLine()) != null){
                String[] arrayComas = linea.split(",");

                Equipo equipo1 = new Equipo(arrayComas[0], "descripción");
                Equipo equipo2 = new Equipo(arrayComas[3], "descripción");

                arrayPartido.add(new Partido(equipo1, equipo2, Integer.parseInt(arrayComas[1]), Integer.parseInt(arrayComas[2])));
            }
        }catch(FileNotFoundException fnfe){
            System.out.println(fnfe.getMessage());
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
        return arrayPartido;
    }
}