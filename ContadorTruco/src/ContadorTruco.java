import java.util.Scanner;

public class ContadorTruco{

    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nEscreva o nome do primeiro jogador: ");
        String primeiro = entrada.nextLine();
        System.out.println("Escreva o nome do segundo jogador: ");
        String segundo = entrada.nextLine();
        int pontuacao = 0;
        int pont01 = 0;
        int pont02 = 0;
        //pont01 = pontos do primeiro jogador
        //pont02 = pontos do segundo jogador
        //pontuacao = pontos da rodada
        

        int jogada = 0;
        int cont = 0;

        while (jogada == 0){
            System.out.println("\n====================================");
            System.out.println("TABELA DE PONTOS");
            System.out.println(primeiro+" - "+pont01+ " pontos");
            System.out.println(segundo+" - "+pont02+ " pontos");
            System.out.println("Rodada atual: "+cont);
            System.out.println("====================================");
            System.out.println("\nQuanto vale essa rodada? ");
            System.out.println("1 - um ponto");
            System.out.println("2 - tres pontos");
            System.out.println("3 - seis pontos");
            System.out.println("4 - doze pontos\n");
            int opcao01 = entrada.nextInt();
            
            switch (opcao01) {
                case 1:
                    pontuacao = 0;
                    pontuacao = pontuacao + 1;
                    break;
                
                case 2:
                    pontuacao = 0;
                    pontuacao = pontuacao + 3;
                    break;

                case 3:
                    pontuacao = 0;
                    pontuacao = pontuacao + 6;
                    break;

                case 4:
                    pontuacao = 0;
                    pontuacao = pontuacao + 12;
                    break;
            
                default:
                    if (opcao01 > 2){
                        System.out.println("Valor invalido. Digite novamente:");
                        continue;
                    }

            }

            System.out.println("\nQual jogador venceu essa rodada?");
            System.out.println("1 - " + primeiro);
            System.out.println("2 - " + segundo + "\n");
            int opcao02 = entrada.nextInt();

            switch (opcao02) {
            
                case 1:
                    pont01 = pont01 + pontuacao;
                    break;

                case 2:
                    pont02 = pont02 + pontuacao;
                    break;
                default:
                    if (opcao02 > 2){
                        System.out.println("Valor invalido. Digite novamente:");
                        continue;
                    }
            }


            if(pont02 >= 12 || pont01 >= 12){
                jogada = 1;
            }

            cont++;
        }
        if(pont01 >= 12){
            System.out.println("\nO vencedor é o "+primeiro+", que fez "+pont01+" pontos. Enquanto, o "+segundo+" fez "+pont02+" pontos");
        }else{
            System.out.println("\nO vencedor é o "+segundo+", que fez "+pont02+" pontos.  Enquanto, o "+primeiro+" fez "+pont01+" pontos");
        }
    }
}