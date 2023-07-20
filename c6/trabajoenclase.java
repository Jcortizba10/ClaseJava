package co.com.ps.c6;

public class trabajoenclase {
    public static void main(String[] args) {

        int[] numero = new int[10];


        numero[0] = 3;
        numero[1] = 5;
        numero[2] = 4;
        numero[3] = 2;
        numero[4] = 1;
        numero[5] = 20;
        numero[6] = 30;
        numero[7] = 15;
        numero[8] = 45;
        numero[9] = 27;

        int minimo = numero[0];
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] < minimo) {
                minimo = numero[i];
            }
        }

        // Encontrar el número máximo
        int maximo = numero[0];
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] > maximo) {
                maximo = numero[i];
            }
        }

        // Mostrar el resultado
        System.out.println("El número mínimo es: " + minimo);
        System.out.println("El número máximo es: " + maximo);
    }
}
