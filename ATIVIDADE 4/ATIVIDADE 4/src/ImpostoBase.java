// Classe base para todos os impostos
abstract class ImpostoBase implements Imposto {
    protected double valorBaseCalculo;

    public ImpostoBase(double valorBaseCalculo) {
        this.valorBaseCalculo = valorBaseCalculo;
    }
}
