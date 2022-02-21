package zadanie3;

import java.util.Random;

public class Matrix {
    private int dlugosc = 5;
    private int[][] matrix2d = new int[dlugosc][dlugosc];
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_GREEN = "\u001B[32m";


    public void loadData() {
        Random random = new Random();
        for (int i = 0; i < dlugosc; i++) {
            for (int j = 0; j<dlugosc; j++) {
                if (i==j) {
                    this.matrix2d[i][j] = random.nextInt(10);
                } else {
                    this.matrix2d[i][j] = 0;
                }
            }
        }
    }

    public void showData() {
        for (int i = 0; i < dlugosc; i++) {
            for (int j = 0; j < dlugosc; j++) {
                if (i == j) {
                    System.out.print(ANSI_GREEN + this.matrix2d[i][j] + ANSI_RESET + "  ");
                } else {
                    System.out.print(this.matrix2d[i][j] + "  ");
                }
            }
            System.out.println("");
        }
    }

    public int calculateSum() {
        int sum = 0;
        for (int i = 0; i < dlugosc; i++) {
            for (int j = 0; j < dlugosc; j++) {
                if (i == j) {
                    sum += this.matrix2d[i][j];
                }
            }
        }
        return sum;
    }


}
