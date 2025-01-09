import java.util.Scanner;

public class task16 {

    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        array = new char[height][2 * height - 1];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * height - 1; j++) {
                if (j >= height - 1 - i && j <= height - 1 + i) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < height; i++) {
            System.out.println(new String(array[i]));
        }
    }
}
