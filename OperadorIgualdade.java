class OperadorIgualdade {
    public static void main (String args[]) {
        int a = 20;
        int b = 20;

        System.out.println(a != 10);
        System.out.println(a == b);
        System.out.println(b == 20);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b && a == 20);
        System.out.println(a == --b || a != 20);
    }
}