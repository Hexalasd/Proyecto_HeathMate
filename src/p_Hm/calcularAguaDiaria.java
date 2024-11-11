package p_Hm;

import java.util.Scanner;

class CalculadoraAgua {
    public void calcularAguaDiaria() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su peso en kg: ");
        double peso = input.nextDouble();

        double aguaRecomendada = peso * 0.035; 
        System.out.printf("Debe beber aproximadamente %.2f litros de agua al día.\n", aguaRecomendada);
    }
}
