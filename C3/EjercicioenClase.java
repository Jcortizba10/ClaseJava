package co.com.ps.C3;

import java.util.Scanner;

public class EjercicioenClase {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Esta es mi super calculadora");
    System.out.print("Ingresa el primer número : ");//escribir
    int num1 = scanner.nextInt();//Leer
    System.out.print("Ingresa el primer número : ");//escribir
    int num2 = scanner.nextInt();//Leer
    int suma= num1+num2;

    int resta= num1-num2;

    int multiplicion= num1*num2;

    int divi= num1/num2;

        System.out.println("La suma de mis Constantes es, "+suma);
        System.out.println("La resta de mis Constantes es, "+resta);
        System.out.println("La multiplicacion de mis Constantes es, "+multiplicion);
        System.out.println("La division de mis Constantes es, "+divi);
    }
}
