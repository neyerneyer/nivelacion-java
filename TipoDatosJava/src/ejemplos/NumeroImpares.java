package ejemplos;

public class NumeroImpares {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 25) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

}
