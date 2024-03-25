import java.util.Scanner;

public class IdadeEleitor {
    public static void main (String[] args ){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira uma idade: ");
        int idade = entrada.nextInt();
        if (idade > 15 || idade > 70){
            if (idade > 17 && idade < 70){
                System.out.println("É obrigatório votar");
            } else{
                System.out.println("Não é obrigatório votar");
            }
            System.out.println();
        }else{
            System.out.println("Não pode votar");
        }

    }
}
