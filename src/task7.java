import java.util.Scanner;
import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[6];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextLine();
        }
        for (int i = 0; i < s.length; i++) {
            if (s[i] == null) continue;

            for (int j = i + 1; j < s.length; j++) {
                if (s[i] != null && s[i].equals(s[j])) {
                    s[j] = null;
                    s[i] = null;
                }
            }
        }
        System.out.println(Arrays.toString(s));
    }
}
