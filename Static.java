class Static {
    public static void main (String args[]) {
        Carro.acelerar();  // sem instânciar
    }
}

class Veiculo {
    String cor;
    int ano;
    int preco;
    String combustivel;
}

class Carro extends Veiculo {

    int ligar(){
        return 1;
    }

    static void acelerar(){
        System.out.println("Acelerando");
    }
    void buzinar(String intensidade){
        System.out.println("businando " + intensidade);
    }

    String pegarNomeCarro(){
        return "Carro";
    }

}
class Reajuste {
    static void calcularCarro(Carro carroParametro) {
        carroParametro.preco += 10000;
    }
}