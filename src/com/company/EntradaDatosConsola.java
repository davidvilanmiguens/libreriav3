package com.company;

import java.util.Scanner;
public class EntradaDatosConsola implements DatosDeEntrada {
    @Override

    public void introducirDatos(){
        System.out.println("Introduce los datos de entrada");
        String datos;
        Scanner sc=new Scanner(System.in);
        datos = sc.nextLine();
    }
}
