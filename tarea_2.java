package com.mycompany.ciclos_cristian;
import java.util.Scanner;
import java.io.*;
public class tarea_2 {
     public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = input.nextInt(), i=0; //Se inicializan la variable n y el acomulador i//
        do { //Se inicia el ciclo//
            System.out.println(i);
            i++; //En cada interación se le suma 1 a i//
        } while (i<=n); //Se repitirá el ciclo siempre que i sea igual o menor que n//
        
        System.out.print("Ingrese el valor de n: ");
        n = input.nextInt();
        i = 0;
        while (i <= n) { //Se ejecutará el ciclo siempre que i sea menor o igual a n//
            System.out.println(i);
            i++; //se le suma 1 a i//
        }

        System.out.print("Ingrese el valor de n: ");
        n = input.nextInt();
        for (i=0;i<=n;i++) { //Al iniciar el ciclo, se define i como 0, se ejecutará el ciclo siempre que la condición sea correcta y al final se le suma 1 a i//
            System.out.println(i);
        }
    }
}
