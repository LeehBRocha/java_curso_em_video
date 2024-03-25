import java.util.Scanner;

public class ParImpar {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();

        if (valor % 2 == 0){
            System.out.println("O valor digitado é par");
        } else {
            System.out.println("O valor digitado é impar");
        }

    }
}
