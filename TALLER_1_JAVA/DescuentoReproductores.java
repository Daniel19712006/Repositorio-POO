package TALLER_1_JAVA;
import java.util.Scanner;

public class DescuentoReproductores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del aparato (sin IVA): ");
        double precioSinIVA = scanner.nextDouble();

        System.out.print ("Ingrese la marca del aparato: ");
        scanner.nextLine(); 
        String marca = scanner.nextLine();

        double descuento10 = 0.0;
        double descuento5 = 0.0;
        double precioConDescuentos;
        double precioFinal;

        if (precioSinIVA >= 500) {
            descuento10 = precioSinIVA * 0.10;
        }

        if (marca.equalsIgnoreCase("NOSY")) {
            descuento5 = precioSinIVA * 0.05;
        }

        precioConDescuentos = precioSinIVA - descuento10 - descuento5;

        precioFinal = precioConDescuentos * 1.19;

        System.out.println("\nResumen de la compra:");
        System.out.println("Precio sin IVA: $" + precioSinIVA);
        System.out.println("Descuento del 10%: $" + descuento10);
        System.out.println("Descuento del 5% (marca NOSY): $" + descuento5);
        System.out.println("Precio con descuentos aplicados: $" + precioConDescuentos);
        System.out.println("Precio final (con IVA incluido): $" + precioFinal);

        scanner.close();
    }
}
