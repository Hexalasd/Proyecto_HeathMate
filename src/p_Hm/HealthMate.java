package p_Hm;
import java.util.Scanner;
//Proyecto medico sencillo de programacion usando bucles repetitivos sencillos y corriendo en consola
public class HealthMate {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean activo = true;

        while (activo) {
        	System.out.println("");
        	System.out.println("Bienvenido a HealthMate - Calculadora de Salud Integral");
        		System.out.println("Seleccione una opción:");
        		System.out.println("1. Calcular Dosis Médica");
        		System.out.println("2. Calcular Frecuencia Cardíaca para Ejercicio");
        		System.out.println("3. Calcular Calorías Diarias");
        		System.out.println("4. Calcular Agua Diaria Recomendada");
        		System.out.println("5. Calcular Peso Ideal y Recomendación de Calorías");
        		System.out.println("0. Salir");

            int opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    CalculadoraDosis dosisCalc = new CalculadoraDosis();
                    dosisCalc.calcularDosis();
                    break;
                	case 2:
                    FrecuenciaCardiaca fcCalc = new FrecuenciaCardiaca();
                    fcCalc.calcularFrecuencia();
                    break;
                case 3:
                    TMBCalculadora tmbCalc = new TMBCalculadora();
                    tmbCalc.calcularCalorias();
                    break;
                case 4:
                    CalculadoraAgua aguaCalc = new CalculadoraAgua();
                    aguaCalc.calcularAguaDiaria();
                    break;
                		case 5:
                    CalculadoraPesoIdeal pesoIdealCalc = new CalculadoraPesoIdeal();
                    pesoIdealCalc.calcularPesoIdeal();
                    break;
                case 0:
                    activo = false;
                    System.out.println("Gracias por usar HealthMate. ¡Cuida tu salud!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    
    }
}
