class ObjetoExercicioPessoa {
    public static void main(String args[]){
        Pessoa yago;

        yago = new Pessoa();
        yago.idade = 24;
        yago.sexo = 'm';
        System.out.println(yago.idade);
        System.out.println(yago.sexo);
    }
}

class Pessoa {
    int idade;
    char sexo;
}