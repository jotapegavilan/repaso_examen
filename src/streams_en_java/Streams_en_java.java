/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams_en_java;

import java.io.IOException;

/**
 *
 * @author Jotape
 */
public class Streams_en_java {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Lectura_y_Escritura le = new Lectura_y_Escritura();   
        le.Escribir();
        le.Leer();
    }
    
}
