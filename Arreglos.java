package com.cice.fundamentos;

public class Arreglos {

    int a=10;
    int[] numeros = new int[5];//instancio
    static int[] otrosNumeros ={1,2,3,4,5};//instancio y asigno valores a las posiciones
    int numero[] = new int[a];//menos utilizada
    // ésto no existe en JAVA int[10] otros;


    public static void main(String[] args) {


        System.out.println(otrosNumeros[4]);
        otrosNumeros[1]=3;

        int dimensionArray =otrosNumeros.length;
        //length es una variable estática de la clase. No es un método ni una función, es un campo =field
        System.out.println(dimensionArray);


    }

}
