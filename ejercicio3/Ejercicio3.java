package com.cice;


import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {


        System.out.print("¿Qué hora es?:");
        Scanner sc =new Scanner(System.in);
        int hora =sc.nextInt();


        if ((hora<=24)) {


            switch (hora) {


                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    System.out.println("BUENOS DIAS!!!!");
                    break;
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    System.out.println("BUENAS TARDES!!!");
                    break;
                default:
                    System.out.println("BUENAS NOCHES");


            }
        }
         else{
                System.out.println("El número introducido no es válido.");
            }












    }

}
