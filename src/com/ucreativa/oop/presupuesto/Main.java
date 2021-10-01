package com.ucreativa.oop.presupuesto;

import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.RegistroGastos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema Registro de Gastos");
        Scanner consola = new Scanner(System.in);
        boolean siga = true;
        RegistroGastos registo = new RegistroGastos();

        while (siga) {
            System.out.println("Digite el nombre de su gasto:");
            String nombre = consola.nextLine();

            System.out.println("Digite la Moneda:");
            String moneda = consola.nextLine();

            System.out.println("Digite la categoria de su gasto:");
            String categoria = consola.nextLine();

            System.out.println("Digite el monto de su gasto:");
            String montoStr = consola.nextLine();
            int monto = Integer.parseInt(montoStr);

            Gasto nuevoGasto = new Gasto(nombre,
                    moneda,
                    categoria,
                    monto);

            registo.addGastos(nuevoGasto);

            for (Gasto gastico : registo.getGastos()) {
                System.out.println(gastico.getNombre());
            }

            System.out.println("Quiere Seguir?(`S`)");
            siga = consola.nextLine().equals("S");
        }



    }

}
