package TALLER_1_JAVA;
import java.util.Scanner;
public class AnalisisHemoglobina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad en meses o años:");
        double edad = scanner.nextDouble();

        System.out.println("Ingrese el nivel de hemoglobina en g%:");
        double hemoglobina = scanner.nextDouble();

        System.out.println("Ingrese el sexo de la persona (M para masculino, F para femenino):");
        char sexo = scanner.next().toUpperCase().charAt(0);

        String resultado;

        if (edad <= 1) {
            if (hemoglobina < 13) {
                resultado = "Positivo (anemia)";
            } else {
                resultado = "Negativo";
            }
        } else if (edad > 1 && edad <= 6) {
            if (hemoglobina < 10) {
                resultado = "Positivo (anemia)";
            } else {
                resultado = "Negativo";
            }
        } else if (edad > 6 && edad <= 12) {
            if (hemoglobina < 11) {
                resultado = "Positivo (anemia)";
            } else {
                resultado = "Negativo";
            }
        } else if (edad > 12 && edad <= 60) { 
            if (hemoglobina < 11.5) {
                resultado = "Positivo (anemia)";
            } else {
                resultado = "Negativo";
            }
        } else if (edad > 60 && edad <= 120) { 
            if (hemoglobina < 12.6) {
                resultado = "Positivo (anemia)";
            } else {
                resultado = "Negativo";
            }
        } else if (edad > 120 && edad <= 180) { 
            if (hemoglobina < 13) {
                resultado = "Positivo (anemia)";
            } else {
                resultado = "Negativo";
            }
        } else if (edad > 180) { 
            if (sexo == 'F') {
                if (hemoglobina < 12) {
                    resultado = "Positivo (anemia)";
                } else {
                    resultado = "Negativo";
                }
            } else if (sexo == 'M') {
                if (hemoglobina < 14) {
                    resultado = "Positivo (anemia)";
                } else {
                    resultado = "Negativo";
                }
            } else {
                resultado = "Sexo no válido.";
            }
        } else {
            resultado = "Edad no válida.";
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}

