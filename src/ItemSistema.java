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

        if(this.tipo.equals(tipo.TELAS_DE_CONSULTAS_COM_INFORMACAO_DE_DADOS)){
            switch (complexidade) {
                case 1:
                    return 4;
                case 2:
                    return 6;
                case 3:
                    return 8;
                default:
                    return -1;
            }
        } else if (this.tipo.equals(tipo.TELAS_COM_ENTRADAS_E_SAIDAS_DE_DADOS)) {
            switch (complexidade){
                case 1:
                    return 8;
                case 2:
                    return 12;
                case 3:
                    return  16;
                default:
                    return -1;
            }
        } else if (this.tipo.equals(tipo.GRAVACOO_DE_DADOS)) {
            switch (complexidade) {
                case 1:
                    return 16;
                case 2:
                    return 24;
                case 3:
                    return  36;
                default:
                    return -1;
            }
        } else if (this.tipo.equals((tipo.ALGORITMOS_COM_PROCESSAMENTOS))) {
            switch (complexidade) {
                case 1:
                    return 16;
                case 2:
                    return 24;
                case 3:
                    return  36;
                default:
                    return -1;
            }
        } else {
            return -1;
        }


    }
}