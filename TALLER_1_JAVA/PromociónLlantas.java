package TALLER_1_JAVA;
import java.util.Scanner;

public class PromociónLlantas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de llantas que desea comprar: ");
        int cantidadLlantas = scanner.nextInt();

        double precioPorLlanta;

        if (cantidadLlantas < 5) {
            precioPorLlanta = 100.0; 
        } else if (cantidadLlantas <= 10) {
            precioPorLlanta = 75.0; 
        } else {
            precioPorLlanta = 50.0; 
        }

        double totalAPagar = precioPorLlanta * cantidadLlantas;

        System.out.println("El precio por cada llanta es: $" + precioPorLlanta);
        System.out.println("El total a pagar por " + cantidadLlantas + " llantas es: $" + totalAPagar);

        scanner.close(); 
    }
}

