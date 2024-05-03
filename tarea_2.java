package com.mycompany.estructura_cristian;

public class tarea_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = input.nextInt();
        if (numero>0) {
            System.out.println("El numero es mayor a 0");
        } else {
            if (numero < 0) {
                System.out.println("El numero es menor a 0");
            } else {
                System.out.println("El numero es igual a 0");
            }
        }
    }
}
