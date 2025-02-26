import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe o nome da empresa: ");
            String nomeEmpresa = scanner.nextLine();
            
            Pagamentos pagamentos = new Pagamentos(nomeEmpresa);
            
            System.out.println("Cadastro de Impostos:");
            while (true) {
                System.out.println("Informe o tipo do imposto (PIS ou IPI), ou 'pare' para encerrar: ");
                String tipoImposto = scanner.nextLine();
                if (tipoImposto.equalsIgnoreCase("pare")) {
                    break;
                }
                
                if (tipoImposto.equalsIgnoreCase("PIS")) {
                    System.out.println("Informe o valor total de débito: ");
                    double debito = scanner.nextDouble();
                    
                    System.out.println("Informe o valor total de crédito: ");
                    double credito = scanner.nextDouble();
                    
                    PIS pis = new PIS(debito, credito);
                    pagamentos.adicionarImposto(pis);
                } else if (tipoImposto.equalsIgnoreCase("IPI")) {
                    System.out.println("Informe o valor da alíquota (%): ");
                    double aliquota = scanner.nextDouble();
                    
                    System.out.println("Informe o valor do produto: ");
                    double valorBaseCalculo = scanner.nextDouble();
                    
                    System.out.println("Informe o valor do frete: ");
                    double frete = scanner.nextDouble();
                    
                    System.out.println("Informe o valor do seguro: ");
                    double seguro = scanner.nextDouble();
                    
                    System.out.println("Informe o valor de outras despesas: ");
                    double outrasDespesas = scanner.nextDouble();
                    
                    IPI ipi = new IPI(valorBaseCalculo, frete, seguro, outrasDespesas, aliquota);
                    pagamentos.adicionarImposto(ipi);
                    
                } else {
                    System.out.println("Tipo de imposto inválido. Tente novamente.");
                }
                
                scanner.nextLine();
            }
            
            pagamentos.mostrarTotalImpostos();
        }
    }
}
