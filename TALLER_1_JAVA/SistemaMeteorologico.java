package TALLER_1_JAVA;
import java.util.Scanner;

public class SistemaMeteorologico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        double[] temperaturas = new double[7];

        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println("Ingrese la temperatura promedio para " + diasSemana[i] + ":");
            temperaturas[i] = scanner.nextDouble();
        }

        System.out.println("\nPercepción de la temperatura de cada día:");
      
        for (int i = 0; i < diasSemana.length; i++) {
            String mensaje;
            if (temperaturas[i] <= 0) {
                mensaje = "Congelante";
            } else if (temperaturas[i] <= 10) {
                mensaje = "Muy frío";
            } else if (temperaturas[i] <= 20) {
                mensaje = "Frío";
            } else if (temperaturas[i] <= 24) {
                mensaje = "Templado";
            } else if (temperaturas[i] <= 29) {
                mensaje = "Agradable";
            } else if (temperaturas[i] <= 35) {
                mensaje = "Caliente";
            } else {
                mensaje = "Muy caliente";
            }
            System.out.println(diasSemana[i] + ": " + mensaje);
        }

        scanner.close(); 
    }
}

