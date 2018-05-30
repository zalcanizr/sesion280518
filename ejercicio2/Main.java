package com.cice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.print("Introduzca el numero a comprobar: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();

        if ((num%2) == 0) {
            System.out.println("El número indicado es par");
        } else{
            System.out.println("El número indicado es impar");
        }



    }
}
