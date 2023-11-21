class Arrays {
    public static void main (String args[]){
        Carro carro1 = new Carro("fiat","palio","preto",15000);
        Carro carro2 = new Carro("fiat","palio","vermelho",16000);
        Carro listaDeCarros [] = new Carro[2];
        listaDeCarros[0] = carro1;
        listaDeCarros[1] = carro2;
        for ( int i = 0; i < listaDeCarros.length; i++ )
            System.out.println(listaDeCarros[i]);
    }
}

class Carro {
    String marca;
    String modelo;
    String cor;
    int preco;
    Carro(String mar, String mod, String c, int pre ){
        marca = mar;
        modelo = mod;
        cor = c;
        preco = pre;
    }
    @Override
    public String toString() {
        return (marca + " " + modelo + " " + cor + " " + preco);
    }
}