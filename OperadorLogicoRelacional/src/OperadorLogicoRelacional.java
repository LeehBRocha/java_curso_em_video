public class OperadorLogicoRelacional {
    public static void main(String[] args) {
        int n1 = 20, n2 = 30;

        int numero = (n1 > n2) ? n1 : n2;
        System.out.println(numero);

        String nome = "Leticia";
        String nome2 = "Leticia";
        String nome3 = new String("Leticia");
        String res1,res2,res3;

        res1 = (nome==nome2)?"igual":"diferente";
        res2 = (nome==nome3)?"igual":"diferente";
        res3 = (nome.equals(nome3)?"igual":"diferente");

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
