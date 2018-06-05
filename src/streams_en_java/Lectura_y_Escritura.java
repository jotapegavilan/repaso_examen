/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams_en_java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Jotape
 */
public class Lectura_y_Escritura {
public void Leer() throws FileNotFoundException, IOException{
    File archivo = new File("archivo.txt");
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese usuario");
    String user=sc.nextLine();
    System.out.println("Ingrese password");
    String pass=sc.next();
    BufferedReader lector = new BufferedReader(new FileReader(archivo));
    String lineadeTexto[]=new String[2];
    for (int i = 0; i < 2; i++) {
        lineadeTexto[i]=lector.readLine();
    }
    
    if((lineadeTexto[0].equals(user))&&(pass.equals(lineadeTexto[1]))){
        System.out.println("Correcto");
        
    }else{
        System.out.println("Incorrecto");
    }
    lector.close();
}
public void Escribir() throws IOException{
    PrintWriter pw= new PrintWriter(new FileWriter("archivo.txt"));
    pw.println("jotape");
    pw.println("1234");
    pw.close();
    
    
}
}
