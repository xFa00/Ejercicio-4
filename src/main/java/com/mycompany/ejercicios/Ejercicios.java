/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Ejercicios {

    public static void main(String[] args){
       int edadJuan,edadAlberto,edadAna,edadMama;
        Scanner leerporteclado = new Scanner(System.in);
        
         System.out.println("Ingrese la edad de Juan: ");
         edadJuan= leerporteclado.nextInt();
         edadAlberto= edadJuan*2/3;
         edadAna= edadJuan*4/3;
         edadMama= edadJuan+edadAlberto+edadAna;
         
          System.out.println(" La edad de Juan es: "+edadJuan);
          System.out.println(" La edad de Alberto es: "+edadAlberto);
          System.out.println(" La edad de Ana es:  "+edadAna);
          System.out.println(" La edad de la Mamá es:  "+edadMama);
    }
}
