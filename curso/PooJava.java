/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poojava;

import java.util.Scanner;

/**
 *
 * @author Clemente
 */
public class PooJava {
    //int x = 5;
    String color = "";
    String marca = "";
    
    public void myMetodo(){
    
    }

    public static void main(String[] args) {
        
        
        PooJava coche1 = new PooJava();
        PooJava coche2 = new PooJava();
        
        coche1.color="Negro";
        coche1.marca="Audi";
        
        coche1.myMetodo();
        
        System.out.println("Coche 1 Color: "+coche1.color);
        
        
        Persona persona1 = new Persona();
        persona1.caminar();
        
        //persona1.
        
        /*PooJava myObj = new PooJava();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hello World!"+ myObj.x);*/
    }
    
}
