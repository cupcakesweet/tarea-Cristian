package com.mycompany.ciclos_cristian;

import java.io.IOException;
import java.util.Scanner;

public class tarea_4 {
     public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int i=0, e=0;
        System.out.print("Ingresar un numero: ");
        int n = input.nextInt();
        do {
            e += i++;
        } while (i<=n);
        System.out.println(e);
        i = 0;
        e = 0;
        System.out.print("Ingresar un numero: ");
        n = input.nextInt();
        while (i<=n) {
            e += i++;
        }
        System.out.println(e);
        e = 0;
        System.out.print("Ingresar un numero: ");
        n = input.nextInt();
        for (i=0;i<=n;i++) {
            e += i;
        }
        System.out.println(e);
    }
}
