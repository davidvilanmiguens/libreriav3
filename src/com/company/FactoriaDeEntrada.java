package com.company;

public class FactoriaDeEntrada {
    public static DatosDeEntrada get(int opcion){

        switch(opcion){

            case 1:
                return new EntradaDatosConsola();

            case 2:
                return new EntradaDatosVentana();

            default:
                return null;
        }
    }
}
