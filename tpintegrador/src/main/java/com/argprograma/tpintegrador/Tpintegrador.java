/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.argprograma.tpintegrador;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author francobalsamo
 */
public class Tpintegrador {

    public static void main(String[] args) throws FileNotFoundException {        
        archivos();
    }
    
    public static void archivos() throws FileNotFoundException{
        Scanner entrada = new Scanner(new FileReader("C:\\Users\\francobalsamo\\Downloads\\resultados.csv"));
        while(entrada.hasNext()){
            String lineas = entrada.nextLine();
            System.out.println(lineas);
        }
    }
}