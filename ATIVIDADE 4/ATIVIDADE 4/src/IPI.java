// Classe para o imposto IPI
class IPI extends ImpostoBase {
    private double frete;
    private double seguro;
    private double outrasDespesas;
    private double aliquota;

    public IPI(double valorBaseCalculo, double frete, double seguro, double outrasDespesas, double aliquota) {
        super(valorBaseCalculo + frete + seguro + outrasDespesas);
        this.frete = frete;
        this.seguro = seguro;
        this.outrasDespesas = outrasDespesas;
        this.aliquota = aliquota;
    }

    @Override
    public double calcularImposto() {
        return valorBaseCalculo * aliquota / 100;
    }

    @Override
    public String getDescricao() {
        return "IPI";
    }
}

