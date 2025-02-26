
package Cardapio;

// Classe Pizza para representar uma pizza

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nome;
    private int tamanho;
    private double preco;
    private boolean isDoce;
    private List<String> ingredientes;

    public Pizza(String nome, int tamanho, double preco, boolean isDoce, List<String> ingredientes) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.preco = preco;
        this.isDoce = isDoce;
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isDoce() {
        return isDoce;
    }

    public List<String> getIngredientes() {
        return new ArrayList<>(ingredientes);
    }

    public void imprimirDados() {
        System.out.println("Pizza: " + nome);
        System.out.println("Tamanho: " + tamanho + " cm");
        System.out.println("Preço: R$" + preco);
        System.out.println("Tipo: " + (isDoce ? "Doce" : "Salgada"));
        System.out.println("Ingredientes: " + ingredientes);
    }
}