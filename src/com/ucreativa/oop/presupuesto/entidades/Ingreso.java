package com.ucreativa.oop.presupuesto.entidades;

public class Ingreso extends Movimiento {

    private String periodicidad;

    public Ingreso(){}

    public Ingreso(String nombre,
                   String moneda,
                   String categoria,
                   int monto,
                   String periodicidad){
        super(nombre, moneda, categoria, monto);
        this.periodicidad = periodicidad;
    }

    @Override
    public String getDetails() {
        return "INGRESO: " + this.getNombre() + " - " +
                this.getMoneda() + " - " +
                this.getCategoria() + " - " +
                this.getMonto() + " - " +
                this.periodicidad;
    }
}