public class OperadoresAritmeticos{
    public static void main (String[] args) {
        int numeroum = 12;
        int numerodois = 6;
        int soma = numeroum + numerodois;
        int resto = numeroum % numerodois;
        int subtracao = numeroum - numerodois;
        int divisao = numeroum / numerodois;
        
        System.out.println("\nA soma entre os numeros é: "+ soma);
        System.out.println("O resto entre os numeros é: "+ resto);   
        System.out.println("A subtração entre os numeros é: "+ subtracao);
        System.out.println("A divisão entre os numeros é: "+ divisao);     
        
        numeroum++;
        numerodois--;

        System.out.println("Primeiro numero com incremento = " + numeroum);
        System.out.println("Segundo numero com descremento = " + numerodois + "\n");

        soma += numeroum;
        subtracao -= numerodois;
        divisao /= numeroum;
        resto %= numerodois;
    
        System.out.println("\nA soma entre os numeros é: "+ soma);
        System.out.println("O resto entre os numeros é: "+ resto);   
        System.out.println("A subtração entre os numeros é: "+ subtracao);
        System.out.println("A divisão entre os numeros é: "+ divisao);        
        
        int numerotres = 2;
        int numeroquatro = 3;

        float expo = (float) Math.pow(numeroquatro, numerotres);
        float raiz = (float) Math.sqrt(numeroquatro);
        float raizcub = (float) Math.cbrt(2);
        float pi = (float) Math.PI;

        System.out.println("\nExpoente de 3 elevado ao quadrado: "+expo);
        System.out.println("Raiz quadrada de 3: "+raiz);
        System.out.println("Raiz cubica de 2: "+raizcub);
        System.out.println("Valor de PI: "+pi+"\n");

        double numeroaleatorio = Math.random();
        int cincoedez = (int) (5 + numeroaleatorio * (10 - 5));
        int quinzevintequatro = (int) (15 + numeroaleatorio * (24-15));
        int centosetentacincocem = (int) (100 + numeroaleatorio *(175-100));

        System.out.println(cincoedez);
        System.out.println(quinzevintequatro);
        System.out.println(centosetentacincocem);



    }
}