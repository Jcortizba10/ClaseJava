package co.com.ps.C3;

import javax.swing.*;
import java.util.Scanner;

public class EjercicioenClase1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Esta es mi super calculadora");

        // Mostrar un mensaje de diálogo con el nombre ingresado
        JOptionPane.showMessageDialog(null, "Hola, ");

        // Obtener el primer número
        String num1Str = JOptionPane.showInputDialog("Ingresa el primer número:");
        int num1 = Integer.parseInt(num1Str);

        // Obtener el segundo número
        String num2Str = JOptionPane.showInputDialog("Ingresa el segundo número:");
        int num2 = Integer.parseInt(num2Str);

        // Realizar las operaciones matemáticas
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;

        // Mostrar el resultado de la suma
        System.out.println("El resultado de la suma es: " + suma);

        // Mostrar el resultado de la resta
        System.out.println("El resultado de la resta es: " + resta);

        // Mostrar el resultado de la multiplicación
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);

        // Mostrar el resultado de la división
        System.out.println("El resultado de la división es: " + division);
    }
}
