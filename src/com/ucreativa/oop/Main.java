package com.ucreativa.oop;

public class Main {

    static String metodo(String variable){
        variable = variable + " Mundo";
        return variable;
    }

    static String metodo(int variable){
        variable = variable + 2;
        return String.valueOf(variable);
    }

    public static void main(String[] args) {
        String variable;

        variable = "Hola";

        variable = "lo que sea";

        metodo(2);
        variable = metodo(variable);

        System.out.println(variable);

        // #1 Comentarios
        /*
        Texto que ponga yo
        y que la maquina
        ignora.
         */
        // TODO: Falta por terminar

        // #2 Variables
        // type nombre = valor;
        int entero = 1;
        entero = entero + 1;
        float flotante = 2.5f;
        String cadenaCaracteres = "2";
        Boolean siONo = true;
        Integer entero2 = 2;

        // #3 Condicionales
        if (entero == 2){
            System.out.println("No entro");
        }else if (entero == 3) {
            System.out.println("Si entro");
        } else {
            System.out.println("OK");
        }

        switch (entero){
            case 1:
                System.out.println("Si es uno");
                System.out.println("Que Si es uno");
                break;
            default:
                System.out.println("Default");
        }

        // Loops
        int i = 0;
        while (i < 10){
            System.out.println("Por aqui voy: " + i);
            i = i + 1;
        }

        for (int j = 0; j < 10; j++) {
            System.out.println("Por aqui va el otro: " + j);
        }

        // Arrays
        String[] objetos = {"Un Objeto", "Dos Objetos"};
        System.out.println("Que tiene el 0: " + objetos[0]);

        System.out.println( Integer.parseInt(cadenaCaracteres) + entero);

    }
}
