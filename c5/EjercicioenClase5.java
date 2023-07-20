package co.com.ps.c5;

import javax.swing.*;

public class EjercicioenClase5 {
    public static void main(String[] args) {
        String edadStr = JOptionPane.showInputDialog("Ingresa tu edad:");
        int edad = Integer.parseInt(edadStr);
        int nacimiento = 2023 - edad;

        // Realizar una verificación utilizando el valor ingresado
        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Eres mayor de edad.");
        } else {
            JOptionPane.showMessageDialog(null, "Eres menor de edad.");
        }
        JOptionPane.showMessageDialog(null, "Nacimiento"+ nacimiento);

    }
}
