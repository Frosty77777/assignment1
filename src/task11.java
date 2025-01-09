public class task11 {
    public static int[][][] a = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1},
        {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
