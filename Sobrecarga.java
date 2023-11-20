class Sobrecarga {
    public static void main (String args[]) {
        TesteSobrecarga teste = new TesteSobrecarga();
        teste.mostrar('c');
        teste.mostrar("ola");
    }
}

class TesteSobrecarga {
    void mostrar(char caracter){
        System.out.println(caracter);
    }
    void mostrar(String palavra){
        System.out.println(palavra);
    }
}

/*
Sobrecarga é quando métodos diferentes tem o mesmo nome, porém tem que haver tipos e sequências
diferentes.

 */