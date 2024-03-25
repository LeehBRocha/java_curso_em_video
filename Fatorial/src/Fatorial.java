import java.util.Scanner;

public class Fatorial{
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int fatorial = entrada.nextInt();
        int f=1, j=fatorial;
        while (j>=1) {
            f = f * j;
            j--;
        }
        System.out.println("O fatorial "+fatorial+"! é igual a: "+ f);
 }
}