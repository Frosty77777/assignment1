import java.util.Scanner;

public class task14 {
    public static int[][] a = new int[3][3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            int rsun = 0;
            for (int j = 0; j < 3; j++) {
                rsun += a[i][j];
            }
            if (rsun < sum) {
                sum = rsun;
            }
        }
        for (int i = 0; i < 3; i++) {
            int csum = 0;
            for (int j = 0; j < 3; j++) {
                csum += a[i][j];
            }
            if(csum < sum) {
                sum = csum;

            }
        }
        System.out.println(sum);
    }
}
