import java.util.Scanner;
public class Media{
    public static void main (String[] args){
        Scanner t = new Scanner(System.in);
        System.out.println("Insira a primeira nota:");
        int nota01 = t.nextInt();
        System.out.println("Insira a segunda nota:");
        int nota02 = t.nextInt();
        System.out.println("Insira a terceira nota:");
        int nota03 = t.nextInt();

        int media = ((nota01+nota02+nota03)/3);
        System.out.println("A media do estudante equivale a: "+ media +"\n");

        if(media > 6){
            System.out.println("O estudante tirou acima de 6, ele está aprovado");
        }else if(media > 4 && media < 7) {
            System.out.println("O estudante tirou entre 4 e 7, ele está de recuperação");
        }else{
            System.out.println("O estudante tirou menos que 5, ele está reprov");
        }
    }
}