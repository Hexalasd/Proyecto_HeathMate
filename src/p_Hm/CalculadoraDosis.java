package p_Hm;

import java.util.Scanner;

class CalculadoraDosis {
    public void calcularDosis() {
        Scanner input = new Scanner(System.in);

        System.out.println("Seleccione el medicamento para calcular la dosis:");
        System.out.println("1. Paracetamol");
        System.out.println("2. Ibuprofeno");
        System.out.println("3. Amoxicilina");
        System.out.println("4. Ácido Acetilsalicílico (Aspirina)");
        System.out.println("5. Loratadina");

        int opcion = input.nextInt();
        System.out.print("Ingrese su peso en kg: ");
        double peso = input.nextDouble();

        switch (opcion) {
            case 1:
                calcularDosisParacetamol(peso);
                break;
            case 2:
                calcularDosisIbuprofeno(peso);
                break;
            case 3:
                calcularDosisAmoxicilina(peso);
                break;
            case 4:
                calcularDosisAspirina(peso);
                break;
            case 5:
                calcularDosisLoratadina(peso);
                break;
            default:
                System.out.println("ERROR. seleccione otra opcion");
        }

  
        System.out.println("esto es solo una guía y no sustituye el consejo de un profesional de la salud.");
        System.out.println("Siempre consulte a un profesional de la salud antes de tomar un medicamento.");
    }

    private void calcularDosisParacetamol(double peso) {
        double dosisMinima = 10; 
        double dosisMaxima = 15; 
        double maximoDiario = 4000;

        double dosisMinimaRecomendada = peso * dosisMinima;
        double dosisMaximaRecomendada = peso * dosisMaxima;

        System.out.printf("Paracetamol: La dosis recomendada es entre %.2f mg y %.2f mg por toma.\n", 
                          dosisMinimaRecomendada, dosisMaximaRecomendada);
        System.out.printf("Dosis máxima diaria: %.2f mg.\n", maximoDiario);
    }

    private void calcularDosisIbuprofeno(double peso) {
     
    	double dosisMinima = 5;
      
    	double dosisMaxima = 10; 
        double maximoDiario = 3200; 
        
        double dosisMinimaRecomendada = peso * dosisMinima;
        double dosisMaximaRecomendada = peso * dosisMaxima;

        System.out.printf("Ibuprofeno: La dosis recomendada es entre %.2f mg y %.2f mg por toma.\n", dosisMinimaRecomendada, dosisMaximaRecomendada);
        System.out.printf("Dosis máxima diaria: %.2f mg.\n", maximoDiario);
    }

    private void calcularDosisAmoxicilina(double peso) {
        double dosisMinima = 20; 
        double dosisMaxima = 50; 

        double dosisMinimaDiaria = peso * dosisMinima;
        double dosisMaximaDiaria = peso * dosisMaxima;

        System.out.printf("Amoxicilina: La dosis diaria recomendada es entre %.2f mg y %.2f mg, dividida en varias tomas.\n", 
                          dosisMinimaDiaria, dosisMaximaDiaria);
    }

    private void calcularDosisAspirina(double peso) {
        double dosisMinima = 3; 
        double dosisMaxima = 5;  
        double maximoDiario = 4000; 

        double dosisMinimaRecomendada = peso * dosisMinima;
        double dosisMaximaRecomendada = peso * dosisMaxima;

        System.out.printf("Ácido Acetilsalicílico (Aspirina): La dosis recomendada es entre %.2f mg y %.2f mg por toma.\n", 
                          dosisMinimaRecomendada, dosisMaximaRecomendada);
        System.out.printf("Dosis máxima diaria: %.2f mg.\n", maximoDiario);
    }

    private void calcularDosisLoratadina(double peso) {
        double dosisEstándar = 10; 

        System.out.printf("Loratadina: La dosis estándar recomendada es de %.2f mg por día para adultos.\n", 
                          dosisEstándar);
        System.out.println("Nota: No se recomienda ajustar la dosis por peso.");
    }
}
