package com.cice.fundamentos;

public class Operadores {

    //operadores de relación > < >= <= != ==
    //su finalidad es la de relacionar 2 objetos o variables para conseguir una respuesta true o false



    static boolean r1 = 1 > 2;
    static boolean r2 = 1 < 2;
    static boolean r3 = 1 >= 1;
    static boolean r4 = 1 <= 2;
    static boolean r5= 1 != 2;
    static boolean r6= 1 == 2;

    //operdores logicos &&    &    ||    |   !   ^(may + simbolo)

    public static void main (String[] args){
        //o.f. public statis void main (String... args) los ... solo en el metodo main

        System.out.println("OPERADORES DE RELACIÓN");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("OPERADORES LÓGICOS");
        System.out.println((r1 && r2));
        System.out.println((r1 || r2));
        System.out.println((r2 || r3));
        System.out.println((r2 && r3));
        System.out.println((!r4));
        System.out.println((r5 ^ r6));
        System.out.println((r5 ^ r4));

        //operadores unarios
        //complemento a 1 y -
        //hacen enl complemento de *128 a 127
        int a=127; // alt+ñ
        System.out.println(a); //devuelve  -128

        //operadores de asignacion

        System.out.println("OPERADORES DE ASIGNACIÓN");//
        int b=5;
        //b++; //b=b+1 //++b
        System.out.println(b++);// devuelve 5 xq primero muestra b y dsp incrementa b
        System.out.println(++b); //devuelve 7 xq primero incrementa b y dsp muestra b
        System.out.println(b); //7
        b--; //b=b-1 //--b
        System.out.println(b);
        b*=2; //b=b*2
        System.out.println(b);
        b/=5; //b=b/5
        System.out.println(b);
        b+=3;
        System.out.println(b);

        b%=5;//módulo de b entre 5
        System.out.println(b);

        b=3;
        b<<=1;
        System.out.println(b);
        //añade un 0 a la derecha y se convierte en 6

        b=7;
        System.out.println(b);
        b<<=1;  //añade un bit a la derecha un 0  devolveria  14
        System.out.println(b);
        b>>= 1; //quita el bit más a la derecha y le añade un 0 a la izqda devolveria  3
        System.out.println(b);


    }


}
