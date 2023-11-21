import java.awt.desktop.AboutEvent;

class Composicao {
    public static void main(String args[]){
        Imobiliaria imobiliaria;
        imobiliaria = new Imobiliaria();
        imobiliaria.apartamento.metros = 100;
    }
}

class Imobiliaria extends Empresa {
    String email;
    String nomeContato;
    Imovel apartamento; // variável de instância
    public Imobiliaria(){
        apartamento = new Imovel() ; // instância dentro de instância
    }
}
abstract class Empresa{
    String cnpj;
    String telefone;
    String endereco;

}

class Imovel {
    int quartos;
    boolean garagem;
    int metros;
    double vlrAluguel;
    double vlrVenda;
}