class For {
    public static void main (String args[]){
        for (int i = 0; i <= 10; i++)
            System.out.println(i);

        int cont = 10;
        for (; cont >= 0; cont--)
            System.out.println(cont);

        cont = 10;
        for (;;cont-=2){
            System.out.println(cont);
            if(cont > 0)
                continue;
            else
                break;
        }

        cont = 10;
        for (;;){
            System.out.println(cont);
            cont -= 2;
            if(cont > 0)
                continue;
            else
                break;

        }
    }

}