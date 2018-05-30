package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {


    public static void main(String[] args) {


        System.out.print("Introduzca el número: ");
        Scanner sc =new Scanner(System.in);
        int factorial =sc.nextInt();
        int auxiliar =1;
        for(int i=1;i<=factorial;i++){

            auxiliar*=i;
        }
        System.out.println("El factorial del número "+factorial+" es: " + auxiliar);
    }
}
