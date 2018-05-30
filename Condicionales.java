package com.cice.fundamentos;


public class Condicionales {

    public static void main(String[] args) {
        boolean condicion = false;
        //estructura de control IF//IF- ELSE
        if (condicion) {
            // si se cumple la condicion ejecuto este bloque de codigo
            System.out.println("condicion cumplida");
        } else {
            // si no se cumple ejecutamos este otro bloque de codigo
            System.out.println("No se cumple la condicion");
        }


        if (condicion) {

        } else if (!condicion) {

        } else if (1 == 2) {

        } else {// no es necesario q haya else

        }


        String nombre = "gustavo";
        //SWITCH

        switch (nombre) {
            case "antonio":
                System.out.println("el nombre introducido es antonio");
                break;
            case "pedro":
                System.out.println("el nombre introducido es pedro");
                break;
            case "manuel":
                System.out.println("el nombre introducido es manuel");
                break;
            case "gustavo":
                System.out.println("el nombre introducido es gustavo");
                break;
            default:
                System.out.println("el nombre introducido no es ninguno de los contemplados");
        }


    }

}
