package p_Hm;

import java.util.Scanner;

class TMBCalculadora {
    public void calcularCalorias() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su peso en kg: ");
        double peso = input.nextDouble();
        System.out.print("Ingrese su altura en cm: ");
        double altura = input.nextDouble();
        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();
        System.out.print("Ingrese su nivel de actividad (1: sedentario, 2: ligero, 3: moderado, 4: activo, 5: muy activo): ");
        int actividad = input.nextInt();

        double tmb = 10 * peso + 6.25 * altura - 5 * edad + 5; 
        double calorias = tmb * (1.2 + (actividad - 1) * 0.175); 

        System.out.printf("su consumo calórico diario para mantenimiento es de: %.2f calorías.\n", calorias);
    }
}
