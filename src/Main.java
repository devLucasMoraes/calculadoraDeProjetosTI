import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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


        int decisao = 1;
        while (decisao == 1){
            System.out.println("Deseja inserir um novo intem de sistema? (1 - sim, 0 - não)");
            decisao = sc.nextInt();
            if(decisao == 1){
                System.out.println("Que tipo consiste esse item?");
                System.out.println("1 - Telas com entradas e saídas de dados");
                System.out.println("2 - Telas de consultas com informação de dados");
                System.out.println("3 - Gravação de dados");
                System.out.println("4 - Algoritmos com processamentos");
            }
        }


        ItemSistema itemSistema = new ItemSistema(Tipo.TELAS_COM_ENTRADAS_E_SAIDAS_DE_DADOS,"Tela de Login",2);
        double horas = itemSistema.CalculaEsforcoHoras();
        double custo = horas * profissional.CalculaValorHora();
        Orcamento orcamento = new Orcamento(profissional,horas, custo);
        System.out.println(orcamento);
    }
}