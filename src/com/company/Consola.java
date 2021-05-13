package com.company;

public class Consola implements DatosDeSalida {
    private String mensaje;

    public Consola() {
    }

    public Consola(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void visualizar(){
        System.out.println("Sale por consola"+mensaje);
    }

}
