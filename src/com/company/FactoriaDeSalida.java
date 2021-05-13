package com.company;

public class FactoriaDeSalida {
    public static final int TERMINAL =1;
    public static final int VENTANA =2;

    /**
     *
     * @param type 1 TERMINAL, 2 VENTANA
     * @param msg mensage
     * @return devuelve un objeto de tipo interface del objeto elegido
     */
    public static DatosDeSalida getProducto(int type, String msg){

        switch(type){

            case TERMINAL:
                return new Consola(msg);

            case VENTANA:
                return new Ventana(msg);

            default:
                return null;

        }


    }
}
