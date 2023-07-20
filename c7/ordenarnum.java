package co.com.ps.c7;

import java.util.Arrays;

public class ordenarnum {
    public static void main(String[]args){
        int numeros[]= {1,5,6,7,2,3,4};
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length ; i++) {
            System.out.print("["+ numeros[i] + "]");

        }
        }
    }
