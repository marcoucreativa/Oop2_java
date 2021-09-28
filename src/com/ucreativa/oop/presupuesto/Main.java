package com.ucreativa.oop.presupuesto;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Mi nuevo Main");

        Gasto gastoLuz = new Gasto();
        gastoLuz.nombre = "Luz";
        gastoLuz.moneda = "Colones";
        gastoLuz.monto = 22000;

        Gasto gastoInternet = new Gasto();
        gastoInternet.nombre = "Internet";
        gastoInternet.moneda = "Colones";
        gastoInternet.monto = 30000;

        RegistroGastos registo = new RegistroGastos();
        registo.gastos = new ArrayList<>();
        registo.gastos.add(gastoLuz);
        registo.gastos.add(gastoInternet);


        for (int i = 0; i < registo.gastos.size(); i++) {
            System.out.println(registo.gastos.get(i).nombre);
        }
    }

}
