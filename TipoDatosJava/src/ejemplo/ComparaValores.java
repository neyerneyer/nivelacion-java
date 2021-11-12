package ejemplo;

public class ComparaValores {
    public static void main(String[] args) {
        String x = new String("Saludos");
        String y = new String("Saludos");

        System.out.println(x == y);
        System.out.println(x.equals(y));
    }
}
