
package Cardapio;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private String nomePizzaria;
    private List<Pizza> pizzas;
    private List<Bebida> bebidas;

    public Cardapio(String nomePizzaria) {
        this.nomePizzaria = nomePizzaria;
        this.pizzas = new ArrayList<>();
        this.bebidas = new ArrayList<>();
    }

    public String getNomePizzaria() {
        return nomePizzaria;
    }

    public List<Pizza> getPizzas() {
        return new ArrayList<>(pizzas);
    }

    public List<Bebida> getBebidas() {
        return new ArrayList<>(bebidas);
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void adicionarBebida(Bebida bebida) {
        bebidas.add(bebida);
    }

  public void listarCardapio() {
    System.out.println("----- Cardápio da " + nomePizzaria + " -----");
    System.out.println("----- Pizzas -----");
    for (Pizza pizza : pizzas) {
        pizza.imprimirDados();
        System.out.println();
    }
    System.out.println("----- Bebidas -----");
    for (Bebida bebida : bebidas) {
        bebida.imprimirDados();
        System.out.println();
    }
 }
    public void listarPizzas() {
        System.out.println("----- Pizzas -----");
        for (int i = 0; i < pizzas.size(); i++) {
        System.out.println((i + 1) + ". " + pizzas.get(i).getNome());
        System.out.println();
        }
    }

    public void listarBebidas() {
        System.out.println("----- Bebidas -----");
        for (int i = 0; i < bebidas.size(); i++) {
            System.out.println((i + 1) + ". " + bebidas.get(i).getNome());
        }
    }

    public Pizza obterPizza(int i) {
        if (i >= 0 && i < pizzas.size()) {
            return pizzas.get(i);
        } else {
            return null;
        }
    }

    public Bebida obterBebida(int i) {
        if (i >= 0 && i < bebidas.size()) {
            return bebidas.get(i);
        } else {
            return null;
        }
    }
}