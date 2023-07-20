package co.com.ps.c7;

public class ejercicioclass {

    public static void main(String[] args) {
        int arreglo[] = {4, 2, 6, 2, 3, 5};

        System.out.println("Arreglo original");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }

            }
        System.out.println("Arreglo ordenado de menor a mayor:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
    }

}

