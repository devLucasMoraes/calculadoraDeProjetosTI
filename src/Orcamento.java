public class Orcamento {
    private Integer id;
    private Profissional profissional;
    private double totalHoras;
    private double custoFinal;
    private static final double RISCO = 0.3;

    public Orcamento(Profissional profissional, double totalHoras, double custoFinal) {
        this.profissional = profissional;
        this.totalHoras = totalHoras;
        this.custoFinal = custoFinal * RISCO;
    }

    @Override
    public String toString() {
        return "Orcamento{" +
                "profissional = " + this.profissional +
                ", totalHoras = " + this.totalHoras +
                ", custoFinal = " + this.custoFinal +
                '}';
    }

    public String getProfissional() {
        return profissional.getNome();
    }

    public double getTotalHoras() {
        return totalHoras;
    }

    public double getCustoFinal() {
        return custoFinal;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
