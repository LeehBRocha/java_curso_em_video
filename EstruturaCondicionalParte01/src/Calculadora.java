import java.util.Scanner;

public class Calculadora {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float resultado;
        System.out.println("ESCOLHA A OPCAO QUE DESEJA UTILIZAR");
        System.out.println("1. SOMA");
        System.out.println("2. SUBTRAÇÃO");
        System.out.println("3. DIVISÃO");
        System.out.println("4. MULTIPLICAÇÃO\n");
        System.out.println("Digite a operacao que deseja executar: ");
        int opcao = entrada.nextInt();
        System.out.println("Digite o primeiro valor: ");
        float valor01 = entrada.nextInt();
        System.out.println("Digite o segundo valor: ");
        float valor02 = entrada.nextInt();
        switch (opcao) {
            case 1:
                resultado = valor01 + valor02;
                System.out.println("\nVocê escolheu a operação 'soma', o resultado é "+resultado);
                break;
            case 2:
                resultado = valor01 - valor02;
                System.out.println("\nVocê escolheu a operação 'subtração', o resultado é "+resultado);
                break;
            case 3:
                resultado = valor01 / valor02;     
                System.out.println("\nVocê escolheu a operação 'divisão', o resultado é "+resultado);
                break;
            case 4:
                resultado = valor01 * valor02;
                System.out.println("\nVocê escolheu a operação 'multiplicação', o resultado é "+resultado);
                break;
            default:
                System.out.println("\nEscolha uma operação válida");
                break;
    
        }
        System.out.println("\n");
    }

}
