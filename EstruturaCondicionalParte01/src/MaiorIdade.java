import java.util.Scanner;

public class MaiorIdade{
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira sua data de nascimento: ");
        int anonascimento = entrada.nextInt();
        int idade = 2024 - anonascimento;
        if (idade > 17){
            System.out.println("Você tem " + idade + " anos. Então, é considerado maior de idade.");
        }else{
            System.out.println("Você tem " + idade + " anos. Então, não é considerado maior de idade.");
        }
      }
    }
