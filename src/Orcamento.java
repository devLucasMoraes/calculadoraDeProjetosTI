public class Orcamento {
    private Profissional profissional;
    private double totalHoras;
    private double custoFinal;

    public Orcamento(Profissional profissional, double totalHoras, double custoFinal) {
        this.profissional = profissional;
        this.totalHoras = totalHoras;
        this.custoFinal = custoFinal;
    }

    @Override
    public String toString() {
        return "Orcamento{" +
                "profissional=" + this.profissional +
                ", totalHoras=" + this.totalHoras +
                ", custoFinal=" + this.custoFinal +
                '}';
    }
}
