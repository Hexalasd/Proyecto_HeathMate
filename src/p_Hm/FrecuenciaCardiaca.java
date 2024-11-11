package p_Hm;

import java.util.Scanner;

class FrecuenciaCardiaca {
    public void calcularFrecuencia() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();

        int frecuenciaMaxima = 220 - edad;
        int frecuenciaMinimaEjercicio = (int) (frecuenciaMaxima * 0.5);
        int frecuenciaMaximaEjercicio = (int) (frecuenciaMaxima * 0.85);

        System.out.println("Su rango de frecuencia cardíaca ideal para ejercicio es: " 
                           + frecuenciaMinimaEjercicio + " - " + frecuenciaMaximaEjercicio + " latidos por minuto.");
    }
}
