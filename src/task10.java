import java.util.Scanner;

public class task10 {
    public static int[][] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new int[n][];
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            a[i] = new int[m];
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("[]");
            }
            System.out.println();
        }
    }
}
