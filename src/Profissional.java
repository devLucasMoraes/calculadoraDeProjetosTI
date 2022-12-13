public class Profissional {
    private String Nome;
    private double SalarioMensalDesejado = 1900;
    private double FHD = 7;
    private double diasUteisMensaisPadrao = 20;

    public double CalcalaHorasMensais() {
        return FHD * diasUteisMensaisPadrao;
    }

    public double CalculaValorHora() {
        return (SalarioMensalDesejado * 2) / CalcalaHorasMensais();
    }
}