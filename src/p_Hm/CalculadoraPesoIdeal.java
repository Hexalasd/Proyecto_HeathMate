package p_Hm;

import java.util.Scanner;

class CalculadoraPesoIdeal {
    public void calcularPesoIdeal() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su altura en centímetros (sin coma) : ");
        double alturaCm = input.nextDouble();
        System.out.print("Ingrese su peso actual en kg: ");
        double pesoActual = input.nextDouble();


        double altura = alturaCm / 100.0;


        double pesoMinimo = 18.5 * altura * altura;
        double pesoMaximo = 24.9 * altura * altura;
        System.out.printf("Su peso ideal debería estar entre %.2f kg y %.2f kg.\n", pesoMinimo, pesoMaximo);

 
        	if (pesoActual < pesoMinimo) {
            System.out.println("Para alcanzar su peso ideal, deberá ganar peso.");
            sugerirSuperavitCalorico(pesoActual, pesoMinimo);
        			} else if (pesoActual > pesoMaximo) {
        				System.out.println("Para alcanzar su peso ideal, deberá perder peso.");
        					sugerirDeficitCalorico(pesoActual, pesoMaximo);
        						} else {
        							System.out.println("¡Felicidades! Su peso está dentro del rango ideal.");
        }
    }

    private void sugerirSuperavitCalorico(double pesoActual, double pesoIdeal) {
	        double diferenciaPeso = pesoIdeal - pesoActual;
	        System.out.println("Para un progreso rápido, puede elegir un superávit calórico de:");
        if (diferenciaPeso >= 10) {
            System.out.println("- 2000 calorías por día para un cambio rápido.");
        	} 
        	if (diferenciaPeso >= 5) {
            System.out.println("- 1000 calorías por día para un cambio moderado.");
        	}
        	System.out.println("- 500 calorías por día para un cambio gradual.");
    	}

    private void sugerirDeficitCalorico(double pesoActual, double pesoIdeal) {
        double diferenciaPeso = pesoActual - pesoIdeal;
        System.out.println("Para un progreso rápido, puede elegir un déficit calórico de:");
        
        	if (diferenciaPeso >= 10) {
            System.out.println("- 1000 calorías por día para una pérdida rápida de peso.");
        } 
        if (diferenciaPeso >= 5) {
            System.out.println("- 750 calorías por día para una pérdida moderada de peso.");
        }
        System.out.println("- 500 calorías por día para una pérdida gradual.");
    }
}
