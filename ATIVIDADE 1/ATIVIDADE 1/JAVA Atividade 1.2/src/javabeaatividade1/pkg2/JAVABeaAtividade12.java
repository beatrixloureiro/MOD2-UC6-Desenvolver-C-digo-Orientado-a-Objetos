package javabeaatividade1.pkg2;

import java.util.Scanner;

class Cliente {
    String nome;
    int idade;
    double desconto;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        // Desconto de 40% se o cliente tem 60 anos ou mais
        this.desconto = (idade >= 60) ? 0.4 : 0.0;
    }
}

public class JAVABeaAtividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    // Solicitação dados do cliente 1
        System.out.println("Digite o nome do primeiro cliente:");
        String nome1 = scanner.nextLine();
        System.out.println("Digite a idade do primeiro cliente:");
        int idade1 = scanner.nextInt();
        // Consumir a quebra de linha 
        scanner.nextLine(); 
        Cliente cliente1 = new Cliente(nome1, idade1);
        
    // Solicitação dados do cliente 2
        System.out.println("Digite o nome do segundo cliente:");
        String nome2 = scanner.nextLine();
        System.out.println("Digite a idade do segundo cliente:");
        int idade2 = scanner.nextInt();
        scanner.nextLine();
        Cliente cliente2 = new Cliente(nome2, idade2);
    
    // Verificação e troca de quartos
    Cliente clienteQuartoA, clienteQuartoB;

        if (cliente1.idade > cliente2.idade) {
            clienteQuartoA = cliente1;
            clienteQuartoB = cliente2;
        } else {
            clienteQuartoA = cliente2;
            clienteQuartoB = cliente1;
        }

        System.out.println("Quarto A: " + clienteQuartoA.nome + (clienteQuartoA.desconto > 0 ? " com desconto de 40%" : ""));
        System.out.println("Quarto B: " + clienteQuartoB.nome);
    }
}
