class DoWhile{
    public static void main(String args[]) {
        int cont;
        boolean ver;

        cont = 1;
        ver = false;
        do{
            System.out.println(cont);
            cont++;
        }while(cont <= 10);
        do{
            System.out.println(cont);
            cont++;
        }while(cont < 0); // roda pelo menos uma vez
    }
}