package p_Hm;

import java.util.Scanner;

		class CalculadoraDosis {
    public void calcularDosis() 	{
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nSeleccione el medicamento para calcular la dosis:");
            String[] medicamentos = {"Paracetamol", "Ibuprofeno", "Amoxicilina", "Aspirina", "Loratadina"};
            
            for (int i = 0; i < medicamentos.length; i++) {
            	System.out.printf("%d. %s\n", i + 1, medicamentos[i]);
            }

            int opcionMedicamento = scanner.nextInt();
            	if (opcionMedicamento < 1 || opcionMedicamento > medicamentos.length) {
                System.out.println("Opción no válida. Inténtelo de nuevo.");
                continue;
            }

            System.out.print("Ingrese su peso en kg: ");
            double peso = scanner.nextDouble();

            System.out.println("Seleccione su edad");
            System.out.println("1. Niño (1-12 años)");
            System.out.println("2. Adulto (13-64 años)");
            System.out.println("3. Adulto Mayor (65+ años)");

            int categoriaEdad = scanner.nextInt();

     
            switch (opcionMedicamento) {
                case 1 -> calcularDosisParacetamol(peso, categoriaEdad);
                	case 2 -> calcularDosisIbuprofeno(peso, categoriaEdad);
                	case 3 -> calcularDosisAmoxicilina(peso, categoriaEdad);
                		case 4 -> calcularDosisAspirina(peso, categoriaEdad);
                		case 5 -> calcularDosisLoratadina(categoriaEdad);
            }

            System.out.println("¿Desea calcular otra dosis? (s/n): ");
            char respuesta = scanner.next().toLowerCase().charAt(0);
            continuar = (respuesta == 's');
        }

        System.out.println("Gracias por usar la calculadora de dosis. ¡Cuídese!");
    }

    private void calcularDosisParacetamol(double peso, int categoriaEdad) {
        double dosisMinima, dosisMaxima, maximoDiario;
        switch (categoriaEdad) {
            case 1 -> { dosisMinima = 10; dosisMaxima = 15; maximoDiario = 2000; }
            case 2 -> { dosisMinima = 10; dosisMaxima = 15; maximoDiario = 4000; }
            case 3 -> { dosisMinima = 7; dosisMaxima = 10; maximoDiario = 3000; }
            default -> { System.out.println("Categoría de edad no válida."); return; }
        }
        double dosisMinimaRecomendada = peso * dosisMinima;
        double dosisMaximaRecomendada = peso * dosisMaxima;

        System.out.printf("Paracetamol: La dosis recomendada es entre %.2f mg y %.2f mg por toma.\n", dosisMinimaRecomendada, dosisMaximaRecomendada);
        System.out.printf("Dosis máxima diaria: %.2f mg.\n", maximoDiario);
    }

    private void calcularDosisIbuprofeno(double peso, int categoriaEdad) {
        double dosisMinima, dosisMaxima, maximoDiario;
        switch (categoriaEdad) {
            case 1 -> { dosisMinima = 5; dosisMaxima = 10; maximoDiario = 1200; }
            case 2 -> { dosisMinima = 5; dosisMaxima = 10; maximoDiario = 3200; }
            case 3 -> { dosisMinima = 3; dosisMaxima = 5; maximoDiario = 1600; }
            default -> { System.out.println("Categoría de edad no válida."); return; }
        }
        double dosisMinimaRecomendada = peso * dosisMinima;
        double dosisMaximaRecomendada = peso * dosisMaxima;

        System.out.printf("Ibuprofeno: La dosis recomendada es entre %.2f mg y %.2f mg por toma.\n", dosisMinimaRecomendada, dosisMaximaRecomendada);
        System.out.printf("Dosis máxima diaria: %.2f mg.\n", maximoDiario);
    }

    private void calcularDosisAmoxicilina(double peso, int categoriaEdad) {
        double dosisMinima, dosisMaxima;
        switch (categoriaEdad) {
            case 1 -> { dosisMinima = 20; dosisMaxima = 40; }
            case 2 -> { dosisMinima = 20; dosisMaxima = 50; }
            case 3 -> { dosisMinima = 15; dosisMaxima = 30; }
            default -> { System.out.println("Categoría de edad no válida."); return; }
        }
        double dosisMinimaDiaria = peso * dosisMinima;
        double dosisMaximaDiaria = peso * dosisMaxima;

        System.out.printf("Amoxicilina: La dosis diaria recomendada es entre %.2f mg y %.2f mg, dividida en varias tomas.\n", dosisMinimaDiaria, dosisMaximaDiaria);
    }

    private void calcularDosisAspirina(double peso, int categoriaEdad) {
        double dosisMinima, dosisMaxima, maximoDiario;
        switch (categoriaEdad) {
            case 1 -> { dosisMinima = 2; dosisMaxima = 4; maximoDiario = 1000; }
            case 2 -> { dosisMinima = 3; dosisMaxima = 5; maximoDiario = 4000; }
            case 3 -> { dosisMinima = 2; dosisMaxima = 3; maximoDiario = 2000; }
            default -> { System.out.println("Categoría de edad no válida."); return; }
        }
        double dosisMinimaRecomendada = peso * dosisMinima;
        double dosisMaximaRecomendada = peso * dosisMaxima;

        System.out.printf("Ácido Acetilsalicílico (Aspirina): La dosis recomendada es entre %.2f mg y %.2f mg por toma.\n", dosisMinimaRecomendada, dosisMaximaRecomendada);
        System.out.printf("Dosis máxima diaria: %.2f mg.\n", maximoDiario);
    }

    private void calcularDosisLoratadina(int categoriaEdad) {
        double dosisEstándar;
        switch (categoriaEdad) {
            case 1 -> dosisEstándar = 5; // mg por día para niños
            case 2 -> dosisEstándar = 10; // mg por día para adultos
            case 3 -> dosisEstándar = 5; // mg por día para adultos mayores
            default -> { System.out.println("Categoría de edad no válida."); return; }
        }
        System.out.printf("Loratadina: La dosis recomendada es de %.2f mg por día.\n", dosisEstándar);
    }
}

