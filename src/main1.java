public class main1 {
    public static void main(String[] args) {
        System.out.println(moltiplicare(2, 3));
        System.out.println(concatenare("ciao", 2));

    }

    public static String concatenare(String str, int x) {
        return str + x;
    }

    public static int moltiplicare(int x, int y) {
        return x * y;
    }
}
