class Polimorfismo {
    public static void main(String args[]) {
        Animal animal = new Animal();
        Animal cachorro = new Cachorro(); // do tipo animal, mas referencia a subclasse cachorro
        Animal gato = new Gato();
        animal.dizerTipo();
        cachorro.dizerTipo();
        gato.dizerTipo();
        Processar proc = new Processar();
        proc.processarAnimal(gato); // polimorfismo por parâmetro
    }
}

class Processar {
    void processarAnimal (Animal anim){
        anim.dizerTipo();
    }
}

class Animal {
    public void dizerTipo (){
        System.out.println("animal");
    }
}

class Cachorro extends Animal {
    public void dizerTipo (){
        System.out.println("cachorro");
    }
}
class Gato extends Animal {
    public void dizerTipo (){
        System.out.println("gato");
    }
}
