public class task8 {
    public static void main(String[] args) {
        int[][] a = new int[11][11];
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                a[i][j] = i * j;
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
