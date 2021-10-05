package com.ucreativa.oop.presupuesto;

import com.ucreativa.oop.presupuesto.entidades.Gasto;
import com.ucreativa.oop.presupuesto.entidades.Ingreso;
import com.ucreativa.oop.presupuesto.entidades.Movimiento;
import com.ucreativa.oop.presupuesto.entidades.RegistroMovimientos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema Registro de Movimientos");
        Scanner consola = new Scanner(System.in);
        boolean siga = true;
        RegistroMovimientos registo = new RegistroMovimientos();

        while (siga) {
            System.out.println("Digite el nombre de su Movimiento:");
            String nombre = consola.nextLine();

            System.out.println("Digite la Moneda:");
            String moneda = consola.nextLine();

            System.out.println("Digite la categoria de su Moviento:");
            String categoria = consola.nextLine();

            System.out.println("Digite el monto de su Movimiento:");
            String montoStr = consola.nextLine();
            int monto = Integer.parseInt(montoStr);

            Movimiento nuevoMovimiento;

            System.out.println("Indique si es un Gasto (S)");
            if (consola.nextLine().equals("S")){
                nuevoMovimiento = new Gasto(nombre,
                        moneda,
                        categoria,
                        monto);
            } else {
                System.out.println("Especifique la Periodicidad:");
                String periodicidad = consola.nextLine();

                nuevoMovimiento = new Ingreso(nombre,
                        moneda,
                        categoria,
                        monto,
                        periodicidad);
            }
            registo.addMovimiento(nuevoMovimiento);

            System.out.println("Todos los movientos:");
            for (Movimiento movimientos : registo.getMovimientos()) {
                System.out.println(movimientos.getNombre());
            }

            System.out.println("Solo Gastos:");
            for (Movimiento gastico : registo.getGastos()) {
                System.out.println(gastico.getNombre());
            }

            System.out.println("Quiere Seguir?(`S`)");
            siga = consola.nextLine().equals("S");
        }



    }

}
