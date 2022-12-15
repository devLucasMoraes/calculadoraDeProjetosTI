public class Profissional {
    private String nome;
    private double salarioMensalDesejado;
    private double FHD;
    private double diasUteisMensais;

    public Profissional(String nome, double salarioMensalDesejado, double FHD, double diasUteisMensaisPadrao) {
        this.nome = nome;
        this.salarioMensalDesejado = salarioMensalDesejado;
        this.FHD = FHD;
        this.diasUteisMensais = diasUteisMensaisPadrao;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    public double CalcalaHorasMensais() {
        return FHD * diasUteisMensais;
    }

    public double CalculaValorHora() {
        return (salarioMensalDesejado * 2) / CalcalaHorasMensais();
    }
}