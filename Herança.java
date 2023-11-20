package estudo;
class Herança {
    public static void main (String args[]) {

        Carro palio;
        palio = new Carro();
        palio.cor = "preto";
        palio.ano = 2008;
        palio.combustivel = "flex";
        palio.preco = 50000;
        int estadoCarro = palio.ligar();
        if (estadoCarro == 1)
            palio.acelerar();
        else
            System.out.println("carro desligado");
        palio.buzinar("baixo");
        System.out.println(palio.pegarNomeCarro());
        System.out.println(palio.preco);
        Reajuste.calcularCarro(palio);
        System.out.println(palio.preco);
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

    void acelerar(){
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
