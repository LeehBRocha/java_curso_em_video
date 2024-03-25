import java.util.Scanner;

public class Somador {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int pares = 0,impares=0,valores=0,maior=0,soma=0,media=0,numero=0;

        do{
            numero = input.nextInt();
            impares = (numero % 2 != 0)?(impares+1):impares;
            pares = (numero % 2 == 0)?(pares+1):pares;
            maior = (numero >= 100)?(maior+1):maior;
            soma+=numero;
            valores++;

        }while(numero != 0);

        media = soma/valores;
        System.out.println("========================================================");
        System.out.println("Quantidade de numeros inseridos: "+valores);
        System.out.println("Quantidade de numeros pares: "+pares);
        System.out.println("Quantidade de numeros impares: "+impares);
        System.out.println("Quantidade de numeros maiores do que 100: "+maior);
        System.out.println("Media dos valores (valor em inteiro): "+media);
        System.out.println("========================================================");

    }
}