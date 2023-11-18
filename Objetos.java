class Objetos {
    public static void main (String args[]) {

        Carro palio; // definindo o tipo.
        palio = new Carro(); // instânciando. O parêntese chama um método constrututor
        palio.cor = "preto";
        palio.ano = 2008;
        palio.combustivel = "flex";
        System.out.println(palio.cor);
    }
}

class Carro {
    String cor = "";
    int ano = 0;
    String combustivel = "";
}

/*
A classe é uma estrutura definada(um molde) que posteriormente será usada para criar um objeto(dar a
real forma). Entendo objeto quando penso em um objeto material mesmo, um palio pode ser um objeto da
classe carro. Os atributos que a classe carro, depois do palio ter virado um objeto, vão ser as
caracteristicas do objeto palio.
A linguagem orientada a objetos tem como objetivo o reúso de códigos.
Quando a declaração de uma variavel é do tipo construído, ela é um objeto, já que é um tipo
"especial".
 */