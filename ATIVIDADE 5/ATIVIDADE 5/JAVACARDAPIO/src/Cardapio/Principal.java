package Cardapio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cardapio cardapio = new Cardapio("Pizzaria da Bia");
        Pedido novoPedido1 = null;

        while (true) {
            System.out.println("----- Menu Principal -----");
            System.out.println("1. Cadastrar nova pizza no cardápio");
            System.out.println("2. Cadastrar nova bebida no cardápio");
            System.out.println("3. Listar o cardápio");
            System.out.println("4. Criar pedido e mostrar dados do pedido");
            System.out.println("5. Cadastrar pedido para a cozinha");
            System.out.println("6. Extrair próximo pedido a ser preparado e levado ao cliente");
            System.out.println("7. Sair");

            System.out.print("Escolha a opção: ");
            char opcao = scanner.next().charAt(0);

            switch (opcao) {

                // Cadastrar nova pizza no cardápio
                case '1':
                    scanner.nextLine();

                    System.out.print("Digite o nome da pizza: ");
                    String nomePizza = scanner.nextLine();

                    System.out.print("Digite o tamanho da pizza (em cm): ");
                    int tamanhoPizza = scanner.nextInt();

                    System.out.print("Digite o preço da pizza: ");
                    double precoPizza = scanner.nextDouble();

                    System.out.print("A pizza é doce?: ");
                    boolean isDoce = scanner.next().equalsIgnoreCase("S");
                    scanner.nextLine();

                    List<String> ingredientesPizza = new ArrayList<>();
                    while (true) {
                        System.out.println("Informe um ingrediente da pizza (ou 'pare' para encerrar): ");
                        String ingrediente = scanner.nextLine();

                        if (ingrediente.equalsIgnoreCase("pare")) {
                            break;
                        }
                        ingredientesPizza.add(ingrediente);
                    }

                    Pizza novaPizza = new Pizza(nomePizza, tamanhoPizza, precoPizza, isDoce, ingredientesPizza);
                    cardapio.adicionarPizza(novaPizza);
                    
                    System.out.println("Pizza cadastrada com sucesso!");
                    break;

                // Cadastrar nova bebida no cardápio
                case '2':
                    scanner.nextLine();

                    System.out.print("Digite o nome da bebida: ");
                    String nomeBebida = scanner.nextLine();

                    System.out.print("Digite a quantidade da bebida (em ml): ");
                    int quantidadeBebida = scanner.nextInt();

                    System.out.print("Digite o preço da bebida: ");
                    double precoBebida = scanner.nextDouble();

                    Bebida novaBebida = new Bebida(nomeBebida, quantidadeBebida, precoBebida);
                    cardapio.adicionarBebida(novaBebida);
                    
                    System.out.println("Bebida cadastrada com sucesso!");
                    break;

                // Lista do Cardapio
                case '3':
                    cardapio.listarCardapio();
                    break;
                                
                // Criar pedido e mostrar dados do pedido
                case '4':
                    scanner.nextLine();

                    System.out.print("Digite o número da mesa: ");
                    int numeroMesa = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer

                    List<Pizza> pizzas = new ArrayList<>();
                    while (true) {
                        // Mostra as pizzas disponíveis
                        cardapio.listarPizzas(); 
                        System.out.print("Selecione o número correspondente à pizza desejada: ");
                        int numeroPizza = scanner.nextInt();
        
                        scanner.nextLine(); 
                        Pizza pizza = cardapio.obterPizza(numeroPizza - 1);
                        if (pizza != null) {
                        pizzas.add(pizza);
                        } else {
                        System.out.println("Pizza inválida. Por favor, selecione novamente.");
                        }

                        System.out.print("Deseja adicionar outra pizza? (S/N): ");
                        if (scanner.nextLine().equalsIgnoreCase("N")) {
                        break;
                        }
                    }

                    List<Bebida> bebidas = new ArrayList<>();
                    while (true) {
                        // Mostra as bebidas disponíveis
                        cardapio.listarBebidas(); 
                        System.out.print("Selecione o número correspondente à bebida desejada: ");
                        int numeroBebida = scanner.nextInt();
                        scanner.nextLine(); 
                        Bebida bebida = cardapio.obterBebida(numeroBebida - 1);
                        if (bebida != null) {
                        bebidas.add(bebida);
                        } else {
                         System.out.println("Bebida inválida. Por favor, selecione novamente.");
                        }

                        System.out.print("Deseja adicionar outra bebida? (S/N): ");
                            if (scanner.nextLine().equalsIgnoreCase("N")) {
                            break;
                            }
                    }

                            if (novoPedido1 == null) {
                                novoPedido1 = new Pedido(numeroMesa, pizzas, bebidas);
                            } else {
                                novoPedido1.adicionarPizzas(pizzas);
                                novoPedido1.adicionarBebidas(bebidas);
                            }

                                novoPedido1.mostrarDadosPedido();
                                break;

                // Cadastrar pedido para a cozinha    
                case '5':
                    if (novoPedido1 == null || novoPedido1.getPizzas().isEmpty()) {
                        System.out.println("Erro: Nenhum pedido válido para cadastrar para a cozinha.");
                    } else {
                        System.out.println("Pedido cadastrado para a cozinha!");
                    }
                    break;

                // Extrair pedido 
                case '6':
                    if (novoPedido1 != null && !novoPedido1.getPizzas().isEmpty()) {
                        System.out.println("Preparando pedido para a mesa " + novoPedido1.getNumeroMesa());
                    } else {
                        System.out.println("Nenhum pedido válido para extrair e preparar.");
                    }
                    break;
                case '7':
                    System.out.println("Saindo do programa!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}