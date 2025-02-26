import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaRH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();
        
        // Permitindo até 2 funcionários para facilitar a demonstração
        for (int i = 0; i < 2; i++) { 
            System.out.println("Cadastro de Funcionário " + (i + 1));

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("CPF: ");
            String cpf = scanner.nextLine();

            System.out.print("Endereço: ");
            String endereco = scanner.nextLine();

            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();

            System.out.print("Setor: ");
            String setor = scanner.nextLine();

            System.out.print("Tipo de Funcionário (1 - Assalariado, 2 - Horista): ");
            int tipoFuncionario = scanner.nextInt();
            //Assalariado
            if (tipoFuncionario == 1) {
                System.out.print("Salário Mensal ($): ");
                double salario = scanner.nextDouble();
                scanner.nextLine();

                FuncionarioAssalariado assalariado = new FuncionarioAssalariado(nome, cpf, endereco, telefone, setor, salario);
                funcionarios.add(assalariado);
            //Horista  
            } else if (tipoFuncionario == 2) {
                System.out.print("Horas Trabalhadas: ");
                double horasTrabalhadas = scanner.nextDouble();

                System.out.print("Valor da Hora ($): ");
                double valorHora = scanner.nextDouble();
                scanner.nextLine(); 

                FuncionarioHorista horista = new FuncionarioHorista(nome, cpf, endereco, telefone, setor, horasTrabalhadas, valorHora);
                funcionarios.add(horista);
            } else {
                System.out.println("Opção inválida.");
            }
        }
        //DADOS FUNCIONARIOS
        System.out.println("\nDados dos Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarDados();
            System.out.println("Pagamento: $" + funcionario.calcularPagamento());
            System.out.println();
        }

        System.out.print("Informe o percentual de aumento salarial a ser aplicado a todos os funcionários (%): ");
        double percentualAumento = scanner.nextDouble();
        scanner.nextLine(); 

        for (Funcionario funcionario : funcionarios) {
            funcionario.aplicarAumento(percentualAumento);
        
        }
        //DADOS FUNCIONARIOS APOS AUMENTO
        System.out.println("\nDados dos Funcionários Após Aumento:");
        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarDados();
            System.out.println("Novo Pagamento: R$" + funcionario.calcularPagamento());
            System.out.println();
        }

        scanner.close();
    }
}

