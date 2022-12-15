public class ItemSistema {
    private Tipo tipo;
    private String nome;
    private int complexidade;

    public ItemSistema(Tipo tipo, String nome, int complexidade) {
        this.tipo = tipo;
        this.nome = nome;
        this.complexidade = complexidade;
    }

    public int CalculaEsforcoHoras() {

        if(this.tipo.equals(Tipo.TELAS_DE_CONSULTAS_COM_INFORMACAO_DE_DADOS)){
            return switch (complexidade) {
                case 1 -> 4;
                case 2 -> 6;
                case 3 -> 8;
                default -> -1;
            };
        } else if (this.tipo.equals(Tipo.TELAS_COM_ENTRADAS_E_SAIDAS_DE_DADOS)) {
            return switch (complexidade) {
                case 1 -> 8;
                case 2 -> 12;
                case 3 -> 16;
                default -> -1;
            };
        } else if (this.tipo.equals(Tipo.GRAVACOO_DE_DADOS)) {
            return switch (complexidade) {
                case 1 -> 16;
                case 2 -> 24;
                case 3 -> 36;
                default -> -1;
            };
        } else if (this.tipo.equals((Tipo.ALGORITMOS_COM_PROCESSAMENTOS))) {
            return switch (complexidade) {
                case 1 -> 16;
                case 2 -> 24;
                case 3 -> 36;
                default -> -1;
            };
        } else {
            return -1;
        }


    }
}