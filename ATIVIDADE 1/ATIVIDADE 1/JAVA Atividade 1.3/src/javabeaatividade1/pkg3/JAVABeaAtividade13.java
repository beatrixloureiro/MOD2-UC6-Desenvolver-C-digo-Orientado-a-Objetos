package javabeaatividade1.pkg3;

import java.util.Scanner;

class Hospede {
    String nome;
    int idade;

    public Hospede(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
class Cliente {
    String nome;
    int idade;
    double desconto;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    // Desconto de 40% se o cliente tem 60 anos ou mais
        this.desconto = (idade >= 60) ? 0.5 : 1.0;
    }

    public double calcularDiaria(double valorDiaria) {
    // Gratuidade para menores de 4 anos
        if (idade < 4) {
            System.out.println(nome + " possui gratuidade");
            return 0;
        }
    // Cálculo do valor com desconto
        double valorTotal = valorDiaria * desconto;
    // Mensagem para clientes com mais de 80 anos
        if (idade > 80) {
            System.out.println(nome + " paga meia");
        }
        return valorTotal;
    }
}

public class JAVABeaAtividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação do valor padrão da diária
        System.out.print("Digite o valor padrão da diária (R$): ");
        double valorDiaria = scanner.nextDouble();
        scanner.nextLine();

        double totalHospedagens = 0;
        int quantidadeGratuidades = 0;
        int quantidadeMeias = 0;

        // Loop para entrada de dados dos hóspedes
        while (true) {
            System.out.print("Digite o nome do hóspede ou 'PARE' para encerrar: ");
            String nomeHospede = scanner.nextLine();
            if (nomeHospede.equalsIgnoreCase("PARE")) {
                break;
            }

            System.out.print("Digite a idade do hóspede " + nomeHospede + ": ");
            int idadeHospede = scanner.nextInt();
            scanner.nextLine();

            Cliente cliente = new Cliente(nomeHospede, idadeHospede);
            totalHospedagens += cliente.calcularDiaria(valorDiaria);

            if (idadeHospede < 4) {
                quantidadeGratuidades++;
            } else if (idadeHospede > 80) {
                quantidadeMeias++;
            }
        }

        // Saída de dados
        System.out.println("Total de hospedagens: R$" + totalHospedagens +
                "; " + quantidadeGratuidades + " gratuidade(s); " +
                quantidadeMeias + " meia(s)");

        scanner.close();
    }
}
