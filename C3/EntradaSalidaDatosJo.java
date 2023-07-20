package co.com.ps.c3;

import java.util.Scanner;
public class EntradaSalidaDatosJo {

    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);


        // Leer un número entero desde el teclado
        System.out.print("Ingresa un número entero: ");//escribir
        int numero = scanner.nextInt();//Leer

        // Leer una cadena de caracteres desde el teclado
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.next();

        // Mostrar la salida en la consola
        System.out.println("El número ingresado es: " + numero);
        System.out.println("Hola, " + nombre + "!");

        // Cerrar el objeto Scanner

    }
}