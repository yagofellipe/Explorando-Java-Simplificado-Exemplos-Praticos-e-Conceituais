class While {
    public static void main(String args[]){
        int cont = 0;
        while (cont < 10){
            System.out.println(cont);
            cont++;
        }
        while (true)
        {
            System.out.println(cont);
            if (cont > 0)
                cont--;
            else
                break;
        }
    }
}