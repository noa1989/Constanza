/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mientras;

import java.util.Scanner;

/**
 *
 * @author Clemente
 */
public class Mientras {

    public static void main(String[] args) {
        int i = 1;
        while(i <= 5){
          System.out.println("Valor de i: "+i);
          i++;
        }
        
        System.out.println("-------------------------------");
        
        int m = 0;
        do{
          System.out.println("Valor de m: "+m);
          m++;
        }while(m < 3);
        
        System.out.println("-------------------------------");
        System.out.println("Ejemplo 01");
        
        int x = 1;
        int tabla;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la tabla de multiplicar que desea: ");
        tabla = teclado.nextInt();
        
        while(x <= 0){ // Solo entra si cumple la condicion
            System.out.println("Tablas del "+tabla+" x "+ x + " = "+(x*tabla));
            x = x + 1;
            //x++;
        }
        
        while(x <= 10){ // Solo entra si cumple la condicion
            System.out.println("Tablas del "+tabla+" x "+ x + " = "+(x*tabla));
            x = x + 1;
            //x++;
        }
        
        System.out.println("-------------------------------");
        System.out.println("Ejemplo 02 do while");
        
        int s = 1;
        
        do{ // Entra por lo menos una vez
            System.out.println("Tablas del "+tabla+" x "+ s + " = "+(s*tabla));
            s = s + 1;
            //x++;
        }while(s <= 0);
    }
}
