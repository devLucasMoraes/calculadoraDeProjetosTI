public class ItemSistema {
    private Tipo tipo;
    private String nome;
    private int complexidade;

    public int CalculaEsforcoHoras(Tipo tipo) {

        if(tipo.equals(tipo.TELAS_DE_CONSULTAS_COM_INFORMACAO_DE_DADOS)){
            switch (complexidade) {
                case 1:
                    return 8;
                case 2:
                    return 12;
                case 3:
                    return 16;
                default:
                    return -1;
            }
        } else {
            return 0;
        }


    }
}