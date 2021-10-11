package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code
        /*Pedir un año al usuario por consola, y determinar si el
            año es bisiesto.

*/
        Scanner sc = new Scanner(System.in); //scanner permite leer datos desde consola
        System.out.println("Ingrese año:");
        int anio = sc.nextInt();
        sc.nextLine();
        //(&&(||))
        if (((anio%4==0)&&(anio%100 !=0))||((anio % 400 ==0)&&(anio % 100 ==0))){
            System.out.println("El año " + anio + " es bisiesto");

        }else{
            System.out.println("El año " + anio + " NO es bisiesto");
        }
        sc.close();

    }
}
