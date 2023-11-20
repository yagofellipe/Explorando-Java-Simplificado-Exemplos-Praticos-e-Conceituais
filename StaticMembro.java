class StaticMembro {
    public static void main(String args[]){
        Calculadora.soma(1,2);
    }
}

class Calculadora{
    static void soma (int num1, int num2){
        int resultado;

        resultado = num1 + num2;
        System.out.println(resultado);
    }
}