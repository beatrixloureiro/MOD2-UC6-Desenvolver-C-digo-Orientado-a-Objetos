package javaatv2;

import java.util.Scanner;

public class JavaATV2 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            Transporte transporte = new Transporte();
            Hospedagem hospedagem = new Hospedagem();
            PacoteViagem pacote = new PacoteViagem();
            Venda venda = new Venda();
            
            //Cadastro Transporte
            System.out.println("Cadastro de Transporte");
            System.out.println("Informe o tipo de transporte desejado (aéreo, rodoviário, marítimo, etc.: "); 
            transporte.setTipo(scanner.nextLine());
            System.out.println("Informe valor do transporte ($):");
            transporte.setValor(scanner.nextDouble());
            pacote.setTransp(transporte);
            scanner.nextLine();
            
            //Cadastro Hospedagem
            System.out.println("Cadastro de Hospedagem");
            System.out.println("Informe a descrição da hospedagem:");
            hospedagem.setDescricao(scanner.nextLine());
            System.out.println("Informe o valor da diária ($):");
            hospedagem.setValorDiaria(scanner.nextDouble());
            pacote.setHosp(hospedagem);
            
            scanner.nextLine();
            //Cadastro Destino
            System.out.println("Informe o destino da viagem:");
            pacote.setDestino(scanner.nextLine());
            
            //Cadastro quantidade de dias (Pacote Viagem)
            System.out.println("Informe a quantidade de dias:");
            pacote.setQtdDias(scanner.nextInt());
            
            pacote.exibirPacote();
                        
            System.out.println("Informe a margem de lucro desejada (%): ");
            pacote.setMargemLucro(scanner.nextInt());
            System.out.println("O valor total do pacote é de $" + pacote.calcularPacote() + " dólares.");
            venda.setPacote(pacote);            
            scanner.nextLine();
            
            //Cadastro Cliente (Venda)     
            System.out.println("\nInforme o nome do cliente: ");
            venda.setNomeCliente(scanner.nextLine());
            System.out.println("Informe a forma de pagamento:");
            venda.setFormaPagamento(scanner.nextLine());
            
            System.out.println("Insira o valor da cotação atual do dólar em reais:");
            venda.setCotacao(scanner.nextDouble());
            
            System.out.print("\n");
            venda.exibirVenda();
        }
    }

}