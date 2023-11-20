
class Encapsulamento {
    public static void main (String args []) {
        Carro carrinho = new Carro();
        carrinho.setCor("vermelhao");
        String color = carrinho.getCor();
        System.out.println( color );
    }
}

class Carro {
    private String cor;
    private String marca;
    private int valor;

    public void setCor(String coloracao) {
        cor = coloracao;
    }
    public void setMarca(String marc) {
        marca = marc;
    }
    public void setValor(int preco) {
        valor = preco;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca(){
        return marca;
    }

    public int valor() {
        return valor;
    }
}

/*
A lógica por trás de all atributos serem privados é quando ele não é private e é modificado fora
da propria classe, quando é preciso fazr uma alteração, é precisa alterar em várias partes dos
códigos. Ou seja, cada atributo só será modificado através de método dentro da própria classe. Esses
métodos são getter e setter.


 */