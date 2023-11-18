class OperadorCondicional {
    public static void main(String args[]) {
        int mes = 12;
        int diaMes = mes == 12 ? 31 : 30;
        System.out.println(diaMes);

        int numero = 13;
        System.out.println(numero % 2 == 0 ?"par":"ímpar");

        int horas = 10;
        System.out.println(horas <= 12?"bom dia":horas<=18?"boa tarde":"boa noite");
    }
}