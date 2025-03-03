package TALLER_1_JAVA;
import java.util.Scanner;

public class SupermercadoTombola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el género del cliente (hombre/mujer):");
        String genero = scanner.nextLine().toLowerCase();

        System.out.println("Ingrese el número de la bolita (1-5):");
        int bolita = scanner.nextInt();

        switch (genero) {
            case "hombre":
                switch (bolita) {
                    case 1:
                        System.out.println("Premio: Desodorante");
                        break;
                    case 2:
                        System.out.println("Premio: Six-Pack de cerveza");
                        break;
                    case 3:
                        System.out.println("Premio: Camiseta");
                        break;
                    case 4:
                        System.out.println("Premio: Pantaloneta");
                        break;
                    case 5:
                        System.out.println("Premio: Sudadera");
                        break;
                    default:
                        System.out.println("Número de bolita inválido.");
                }
                break;
            case "mujer":
                switch (bolita) {
                    case 1:
                        System.out.println("Premio: Loción");
                        break;
                    case 2:
                        System.out.println("Premio: Bikini");
                        break;
                    case 3:
                        System.out.println("Premio: Crema para la cara");
                        break;
                    case 4:
                        System.out.println("Premio: Plancha para el cabello");
                        break;
                    case 5:
                        System.out.println("Premio: Esmalte de uñas");
                        break;
                    default:
                        System.out.println("Número de bolita inválido.");
                }
                break;
            default:
                System.out.println("Género inválido.");
        }

        scanner.close();
    }
}
