package javaatv2;

//Cadastro quantidade de dias (Pacote Viagem)
public class PacoteViagem {

    private String destino;
    private int qtdDias;
    private double margemLucro;
    private Transporte transp;
    private Hospedagem hosp;

    public PacoteViagem() {
        this.hosp = new Hospedagem();
        this.transp = new Transporte();
    }

    public PacoteViagem(String destino, int qtdDias, double margemLucro) {
        this.destino = destino;
        this.qtdDias = qtdDias;
        this.margemLucro = margemLucro;
        this.hosp = new Hospedagem();
        this.transp = new Transporte();
    }

    public PacoteViagem(String destino, int qtdDias, double margemLucro, Transporte transp, Hospedagem hosp) {
        this.destino = destino;
        this.qtdDias = qtdDias;
        this.margemLucro = margemLucro;
        this.transp = transp;
        this.hosp = hosp;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public Transporte getTransp() {
        return transp;
    }

    public void setTransp(Transporte transp) {
        this.transp = transp;
    }

    public Hospedagem getHosp() {
        return hosp;
    }

    public void setHosp(Hospedagem hosp) {
        this.hosp = hosp;
    }

    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }
    
    //Calculo total hospedagem
    public double calcularTotalHospedagem() {
        return hosp.getValorDiaria() * qtdDias;
    }
    //Calculo Lucro
    public double calcularLucro() {
        return ((margemLucro * (calcularTotalHospedagem() + transp.getValor())) / 100) + calcularTotalHospedagem();
    }
    //Calculo Pacote + Lucro
    public double calcularPacote() {
        return transp.getValor() + calcularLucro();
    }

    public void exibirPacote() {
        System.out.print("\nSOLICITAÇÃO DE PACOTE \n");
        System.out.println(" " + transp.exibirTransporte());
        System.out.println(" " + hosp.exibirHospedagem());
        System.out.println(" Destino: " + destino + " | Quantidade de dias: " + qtdDias + " dias");
        System.out.println("VALOR TOTAL (Hospedagem + Transporte): $" + (calcularTotalHospedagem() + transp.getValor()));
    }

}
