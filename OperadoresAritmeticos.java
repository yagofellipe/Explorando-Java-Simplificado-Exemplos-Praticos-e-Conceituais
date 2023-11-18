class OperadoresAritmeticos {
    public static void main(String args[]){
        int soma;
        double divisao;
        int mult;
        double subtracao;
        double resto;
        int operacao;

        soma = 10 + 10;
        divisao = 20 / 10;
        mult = 10 * 10;
        subtracao = 10 - 2;
        resto = 100 % 3;
        operacao = 8 + 2 * 2;

        System.out.println(soma);
        soma += 1000;
        System.out.println(soma);
        System.out.println(divisao);
        System.out.println(mult);
        System.out.println(subtracao);
        System.out.println(resto);
        System.out.println(operacao);
    }
}