package co.com.ps.c12;

public enum arreglo {

        EXITO("resultado");


        private final String mensaje;

        arreglo
        private final boolean laborable;
}
    public static void main(String[] args) {
        int[] numerosDesordenados = {5, 2, 9, 1, 8, 3, 7, 6, 10, 4};

        // Ordenar el arreglo utilizando streams
        Arrays.sort(numerosDesordenados);
