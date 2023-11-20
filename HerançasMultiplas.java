class HerancaMultiplas{
    public static void main(String args[]){
        Aeromodelo tecoteco = new Aeromodelo();
        tecoteco.acelerar(50);
        tecoteco.reduzir(10);
    }

}
class Aeromodelo extends Brinquedo implements Voar {
    double envergaduraAsa;
    String tipoMotor;
    String modelo;
    public void acelerar(int aumentar) {
        System.out.println(aumentar);
    }
    public void reduzir (int reduzir) {
        System.out.println(reduzir);
    }
}
class Brinquedo {
    double preco;
    String descricao;

    boolean importado;
}
interface Voar {
    void acelerar (int velocidade);

    void reduzir (int velocidade);
}
