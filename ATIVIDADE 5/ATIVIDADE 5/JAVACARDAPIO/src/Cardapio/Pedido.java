
package Cardapio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private final int numeroMesa;
    private final List<Pizza> pizzas;
    private final List<Bebida> bebidas;

    public Pedido(int numeroMesa, List<Pizza> pizzas, List<Bebida> bebidas) {
        this.numeroMesa = numeroMesa;
        this.pizzas = new ArrayList<>(pizzas); 
        this.bebidas = new ArrayList<>(bebidas);
    }

    // Métodos getters
    public int getNumeroMesa() {
        return numeroMesa;
    }

    public List<Pizza> getPizzas() {
        return new ArrayList<>(pizzas);
    }

    public List<Bebida> getBebidas() {
        return new ArrayList<>(bebidas);
    }

   // Método para adicionar pizzas ao pedido
public void adicionarPizzas(List<Pizza> novasPizzas) {
    
    this.pizzas.addAll(novasPizzas);
}

// Método para adicionar bebidas ao pedido
public void adicionarBebidas(List<Bebida> novasBebidas) {
     
    this.bebidas.addAll(novasBebidas);
}

// Método para obter o preço total das pizzas no pedido
public double getPrecoPizzas() {
    double total = 0;
    for (Pizza pizza : pizzas) {
        // Verificar se a pizza não é nula antes de tentar acessar seu preço
        if (pizza != null) {
            total += pizza.getPreco();
        }
    }
    return total;
}

// Método para obter o preço total das bebidas no pedido
public double getPrecoBebidas() {
    double total = 0;
    for (Bebida bebida : bebidas) {
        if (bebida != null) {
            total += bebida.getPreco();
        }
    }
    return total;
}

// Método para mostrar os dados do pedido
// Método para mostrar os dados do pedido
public void mostrarDadosPedido() {
    System.out.println("----- Pedido Mesa " + numeroMesa + " -----");
    
    // Obter o total das pizzas e bebidas
    double totalPizzas = getPrecoPizzas();
    double totalBebidas = getPrecoBebidas();
    
    // Calcular o total do pedido
    double totalPedido = totalPizzas + totalBebidas;

    // Imprimir pizzas
    if (!pizzas.isEmpty()) {
        System.out.println("----- Pizzas -----");
        for (Pizza pizza : pizzas) {
            pizza.imprimirDados();
            System.out.println("-------------------");
        }
    } else {
        System.out.println("Nenhuma pizza selecionada para este pedido.");
    }
    
    // Imprimir bebidas
    if (!bebidas.isEmpty()) {
        System.out.println("----- Bebidas -----");
        for (Bebida bebida : bebidas) {
            bebida.imprimirDados();
            System.out.println("-------------------");
        }
    } else {
        System.out.println("Nenhuma bebida selecionada para este pedido.");
    }

    // Imprime o total do pedido
    System.out.println("Total do Pedido: R$" + totalPedido);
}

}