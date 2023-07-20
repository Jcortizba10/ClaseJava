package co.com.ps.c6;

public class Arreglos {

    public static void main(String[] args) {

        double[] notas = new double[3];
        notas[0]= 3.5;
        notas[1]= 4.0;
        notas[2]= 3.0;

        System.out.println("El promedio del estudiante : "+ calcularnota(notas));
    }
        public static double calcularnota(double[] notas){
                double acumulador=0;
                for (double nota:notas){
                    acumulador = acumulador+nota;
                }
                return acumulador/notas.length;
            }
 }
