import java.util.Scanner;

public class task13 {
    public static int[][] a = new int[3][3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = a[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        System.out.println(max);

    }
}
