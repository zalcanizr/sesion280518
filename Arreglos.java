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


        //arrays de varias dimensiones

        int [][] arrayBidimensional = new int[2][4];
        //o.f declaracion
        int [] array2[] = new int [2][4];

        int array2b[][] = {{0,1,2,3},{2,1,5,4},{5,4,7,8},{6,5,4,1}};
        // o.f. int array2b [][]=new int [4][4];

        System.out.println(array2b[1][2]);

        //array tridimensional= array de arraybidimnensionales
        //rray tridimensional= array que contiene array que contiene posiciones
        int [][][] array3d ={ {{1,2},{2,4}} , {{5,4}, {8,4}} };
        //las llaves de fuera son el contenido de las tres dimensiones
        int [][][] array3d2= new int [2][2][2];


        System.out.println(array3d [1][0][0]);
        //pos del array bidimensional,
        // pos del array dimensional dentro del array bidimensional,
        // pos dentro del dimensional dentro del bidimensional
    }

}
