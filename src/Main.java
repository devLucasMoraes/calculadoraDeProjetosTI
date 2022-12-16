import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ola! Digite seu nome:");
        String nome = sc.nextLine();
        System.out.println("Informe seu salario mensal desejado:");
        double salarioMensalDesejado = sc.nextDouble();
        System.out.println("Quantas horas por dia voce quer trabalhar?");
        double FHD = sc.nextDouble();
        System.out.println("Quantos dias voce quer trabalhar mensalmente?");
        double diasUteisMensais = sc.nextDouble();

        Profissional profissional = new Profissional(nome,salarioMensalDesejado,FHD,diasUteisMensais);
        List<ItemSistema> itensDoSistema = new ArrayList<>();

        int decisao = 1;
        while (decisao == 1){

            System.out.println("Deseja inserir um novo intem de sistema? (1 - sim, 0 - não)");

            decisao = sc.nextInt();
            if(decisao == 1){
                System.out.println("Digite um nome descritivo para esse item: ");
                String nomeItem = sc.nextLine();
                sc.nextLine();

                System.out.println("Informe o grau de dificuldade para a realização desse item indo de 1 a 3");
                int grauDeDificuldade = sc.nextInt();
                sc.nextLine();

                System.out.println("Que tipo consiste esse item?");
                System.out.println("1 - Telas com entradas e saídas de dados");
                System.out.println("2 - Telas de consultas com informação de dados");
                System.out.println("3 - Gravação de dados");
                System.out.println("4 - Algoritmos com processamentos");



                int tipo = sc.nextInt();


                switch (tipo) {
                    case 1 -> {
                        ItemSistema itemSistema1 = new ItemSistema(Tipo.TELAS_COM_ENTRADAS_E_SAIDAS_DE_DADOS, nomeItem, grauDeDificuldade);
                        itensDoSistema.add(itemSistema1);
                    }
                    case 2 -> {
                        ItemSistema itemSistema2 = new ItemSistema(Tipo.TELAS_DE_CONSULTAS_COM_INFORMACAO_DE_DADOS, nomeItem, grauDeDificuldade);
                        itensDoSistema.add(itemSistema2);
                    }
                    case 3 -> {
                        ItemSistema itemSistema3 = new ItemSistema(Tipo.GRAVACOO_DE_DADOS, nomeItem, grauDeDificuldade);
                        itensDoSistema.add(itemSistema3);
                    }
                    case 4 -> {
                        ItemSistema itemSistema4 = new ItemSistema(Tipo.ALGORITMOS_COM_PROCESSAMENTOS, nomeItem, grauDeDificuldade);
                        itensDoSistema.add(itemSistema4);
                    }
                }
            }
        }

        double totalHoras = 0;
        for (ItemSistema itemSistema : itensDoSistema) {
            totalHoras += itemSistema.CalculaEsforcoHoras();
        }



        double custoFinal = totalHoras * profissional.CalculaValorHora();
        Orcamento orcamento = new Orcamento(profissional,totalHoras, custoFinal);

        try(Connection connection = new ConnectionFactory().recuperarConexao()){
            OrcamentoDAO orcamentoDAO = new OrcamentoDAO(connection);
            orcamentoDAO.salvar(orcamento);
        }
        System.out.println(orcamento);
    }
}