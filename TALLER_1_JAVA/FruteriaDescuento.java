package TALLER_1_JAVA;
import java.util.Scanner;

public class FruteriaDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio por kilo de manzanas: ");
        double precioPorKilo = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de kilos comprados: ");
        double cantidadKilos = scanner.nextDouble();

        double porcentajeDescuento = 0.0;

        if (cantidadKilos > 0 && cantidadKilos <= 2) {
            porcentajeDescuento = 0.0; 
        } else if (cantidadKilos > 2 && cantidadKilos <= 5) {
            porcentajeDescuento = 10.0; 
        } else if (cantidadKilos > 5 && cantidadKilos <= 10) {
            porcentajeDescuento = 15.0; 
        } else if (cantidadKilos > 10) {
            porcentajeDescuento = 20.0; 
        }

        double precioTotal = precioPorKilo * cantidadKilos;
        double descuento = (porcentajeDescuento / 100) * precioTotal;
        double totalAPagar = precioTotal - descuento;

        System.out.println("\nResumen de la compra:");
        System.out.println("Cantidad de kilos comprados: " + cantidadKilos);
        System.out.println("Precio por kilo: $" + precioPorKilo);
        System.out.println("Precio total sin descuento: $" + precioTotal);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalAPagar);

        scanner.close();
    }
}
