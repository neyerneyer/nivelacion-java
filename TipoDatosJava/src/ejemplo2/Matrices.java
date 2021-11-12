package ejemplo2;

public class Matrices {
    int matriz1[][];
    int matriz2[][] = new int[4][5];
    int[][] matriz3 = new int[4][5];
    int[][] matriz4 = new int[4][5];
    int matriz5[][] = {};
    int matriz6[][] = {{1, 2}, {3, 8}};
    int matriz7[][] = new int[][]{{1, 2}, {3, 8}};

    public static void main(String[] args) {
        //Desarrolla un  programa que dada una matriz de 5*4, almacena numeros aleatorios
        //entre 0 y el 100 en todas sus pocisiones. luego imprimir la matriz en forma de tabla.

        int numeros[][] = new int[5][4];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                numeros[i][j] = (int) Math.ceil(Math.random() * 100);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

    }
}
