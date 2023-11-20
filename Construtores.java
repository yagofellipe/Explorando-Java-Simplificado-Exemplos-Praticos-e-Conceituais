class Constrututores {
    public static void main (String args []) {
        Carro carrinho = new Carro();
        System.out.println( carrinho.getCor() );
        System.out.println( carrinho.getMarca() );
        System.out.println( carrinho.getValor() );

    }
}

class Carro {
    private String cor;
    private String marca;
    private int valor;

    // constructor que não precisa de parâmetros.
    public Carro(){};

    // constructor que precisa de parâmetros
    public Carro(String color, String brand, int price){
        cor = color;
        marca = brand;
        valor = price;
    }

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

    public int getValor() {
        return valor;
    }
}