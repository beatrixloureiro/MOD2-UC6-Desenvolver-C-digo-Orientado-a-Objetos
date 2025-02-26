//Cadastro Funcionario Horista
class FuncionarioHorista extends Funcionario {
    private double horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(String nome, String cpf, String endereco, String telefone, String setor, double horasTrabalhadas, double valorHora) {
        super(nome, cpf, endereco, telefone, setor);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }
    //Calculo pagamento sem aumento
    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }
    //Calculo pagamento com aumento
    @Override
    public void aplicarAumento(double percentualAumento) {
        this.valorHora += this.valorHora * percentualAumento / 100;
    }
}
