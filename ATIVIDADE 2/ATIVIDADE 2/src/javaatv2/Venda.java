package javaatv2;

//Cadastro Cliente (Venda)
public class Venda {

    private String nomeCliente;
    private String formaPagamento;
    private double cotacao;
    private PacoteViagem pacote;

    public Venda() {
        this.pacote = new PacoteViagem();
    }

    public Venda(String nomeCliente, String formaPagamento, double cotacao) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.cotacao = cotacao;
        this.pacote = new PacoteViagem();
    }

    public Venda(String nomeCliente, String formaPagamento, double cotacao, PacoteViagem pacote) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.cotacao = cotacao;
        this.pacote = pacote;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getCotacao() {
        return cotacao;
    }

    public void setCotacao(double cotacao) {
        this.cotacao = cotacao;
    }

    public PacoteViagem getPacote() {
        return pacote;
    }

    public void setPacote(PacoteViagem pacote) {
        this.pacote = pacote;
    }
    
    //Calculo converçao em reais
    public double converterReais() {
       return pacote.calcularPacote() * cotacao;
    }
    
    public void exibirVenda() {
        System.out.println(" Nome do cliente: " + nomeCliente);
        System.out.println(" Forma de pagamento: " + formaPagamento);
        System.out.println("\n VALOR TOTAL DO PACOTE:");
        System.out.println(" Valor em dólares: $" + pacote.calcularPacote());
        System.out.println(" Valor em reais: R$" + converterReais());
        System.out.println("\n Venda cadastrada com sucesso! \n");
    }

}