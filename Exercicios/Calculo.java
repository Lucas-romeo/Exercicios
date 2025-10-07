public class Calculo {
    //Operadores Aritméticos:   +, -, *, /, %
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int resultadoSoma = a + b + c + d + e;
        System.out.println("Resultado da Soma: " + resultadoSoma);

        int resultadoSubtracao = e - d;
        System.out.println("Resultado da Subtração: " + resultadoSubtracao);

        int resultadoMultiplicacao = a * b;
        System.out.println("Resultado da Multiplicação: " + resultadoMultiplicacao);

        int resultadoDivisao = d / a;
        System.out.println("Resultado da Divisão: " + resultadoDivisao);

        int resultadoResto = e % b;
        System.out.println("Resultado do Resto da Divisão: " + resultadoResto);
    }
}
