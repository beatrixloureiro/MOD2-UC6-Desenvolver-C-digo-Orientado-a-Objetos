// Classe para o imposto PIS
class PIS extends ImpostoBase {
    private double debito;
    private double credito;

    public PIS(double debito, double credito) {
        super(debito - credito);
        this.debito = debito;
        this.credito = credito;
    }
    // 1.65% IMPOSTO DO PIS
    @Override
    public double calcularImposto() {
        return (debito - credito) * 0.0165;
    }

    @Override
    public String getDescricao() {
        return "PIS";
    }
}
