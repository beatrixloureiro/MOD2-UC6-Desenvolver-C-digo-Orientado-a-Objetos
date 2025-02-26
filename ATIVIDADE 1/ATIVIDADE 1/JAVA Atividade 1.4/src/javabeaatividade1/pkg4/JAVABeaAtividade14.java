package javabeaatividade1.pkg4;

import java.util.Scanner;

public class JAVABeaAtividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_CADASTROS = 15;
        String[] cadastros = new String[MAX_CADASTROS];
        int indice = 0;

        int opcao;
        do {
            // Exibir menu
            System.out.println("Digite: \n 1- CADASTRAR  \n 2- PESQUISAR \n 3- SAIR \n");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer de entrada
            
            // MENU
            switch (opcao) {
                // Cadastrar hóspede
                case 1:
                    if (indice < MAX_CADASTROS) {
                        System.out.println("Digite o nome do hóspede:");
                        String nome = scanner.nextLine();
                        cadastros[indice++] = nome;
                        System.out.println("Hóspede cadastrado com sucesso.");
                    } else {
                        System.out.println("Máximo de cadastros atingido.");
                    }
                    break;
                // Pesquisar hóspede
                case 2:
                    System.out.println("Digite o nome do hóspede:");
                    String nomePesquisa = scanner.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < indice; i++) {
                        if (cadastros[i].equals(nomePesquisa)) {
                            System.out.println("Hóspede " + nomePesquisa + " foi encontrado no índice " + i);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Hóspede não encontrado.");
                    }
                    break;
                //Encerra programa
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
