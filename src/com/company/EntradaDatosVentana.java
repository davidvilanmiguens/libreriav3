package com.company;

import javax.swing.*;

public class EntradaDatosVentana implements DatosDeEntrada{
    @Override
    public void introducirDatos(){

        String datos = JOptionPane.showInputDialog(null,"Introduce datos de entrada");
    }
}
