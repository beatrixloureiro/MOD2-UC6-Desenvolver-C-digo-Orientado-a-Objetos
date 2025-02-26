//Cadastro Funcionario Assalariado
class FuncionarioAssalariado extends Funcionario {
    private double salarioMensal;

    public FuncionarioAssalariado(String nome, String cpf, String endereco, String telefone, String setor, double salarioMensal) {
        super(nome, cpf, endereco, telefone, setor);
        this.salarioMensal = salarioMensal;
    }
    //Calculo pagamento sem aumento
    @Override
    public double calcularPagamento() {
        return salarioMensal;
    }
    //Calculo pagamento com aumento
    @Override
    public void aplicarAumento(double percentualAumento) {
        this.salarioMensal += this.salarioMensal * percentualAumento / 100;
    }
}
