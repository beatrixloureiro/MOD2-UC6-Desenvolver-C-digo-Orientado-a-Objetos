
package Cardapio;

// Classe Bebida para representar uma bebida

public class Bebida {
    private String nome;
    private int quantidade;
    private double preco;

    public Bebida(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void imprimirDados() {
        System.out.println("Bebida: " + nome);
        System.out.println("Quantidade: " + quantidade + " ml");
        System.out.println("Preço: R$" + preco);
    }
}