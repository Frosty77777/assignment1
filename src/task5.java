import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n % 2 == 0) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(arr[j] + " ");

            }

        }
        else {
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }
        }
    }
}
