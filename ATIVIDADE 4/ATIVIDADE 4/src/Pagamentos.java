
import java.util.ArrayList;
import java.util.List;

// Classe para representar os pagamentos
class Pagamentos {
    private String nomeEmpresa;
    protected List<Imposto> impostos;

    public Pagamentos(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.impostos = new ArrayList<>();
    }

    public void adicionarImposto(Imposto imposto) {
        impostos.add(imposto);
    }

    public void mostrarTotalImpostos() {
        System.out.println("Total de Impostos:");
        for (Imposto imposto : impostos) {
            double totalImposto = imposto.calcularImposto();
            System.out.println(imposto.getDescricao() + ": " + totalImposto);
        }
    }
}
