package javabeaatividade1.pkg5;

import java.util.Scanner;

public class JAVABeaAtividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        // Inicializar matriz para armazenar a ocupação dos quartos
        boolean[][] quartos = new boolean[4][3];
        
        do {
            // Solicitar informação de ocupação
            System.out.println("Informe Andar e Quarto:");
            int andar = scanner.nextInt();
            int quarto = scanner.nextInt();
            scanner.nextLine();
            
            // Marcar o quarto como ocupado
            quartos[andar - 1][quarto - 1] = true;
            
            // Perguntar se deseja informar outra ocupação
            System.out.println("Deseja informar outra ocupação? (S/N)");
            continuar = scanner.nextLine().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        // Exibir ocupação do hotel
        System.out.println("Ocupação do hotel:");
        for (int i = 0; i < 4; i++) {
            System.out.println("\n" + (i + 1) + "º andar:");
            for (int j = 0; j < 3; j++) {
                if (quartos[i][j]) {
                    System.out.println("- Quarto " + (j + 1) + ": Ocupado");
                } else {
                    System.out.println("- Quarto " + (j + 1) + ": Desocupado");
                }
            }
        }

        scanner.close();
    }
}