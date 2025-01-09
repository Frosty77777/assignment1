public class task24 {


    public static void main(String[] args) {
        // Примеры вызовов методов
        universalMethod();
        universalMethod(42);
        universalMethod("Hello");
        universalMethod(3.14);
        universalMethod(true);
        universalMethod(42, "Answer");
        universalMethod(new int[]{1, 2, 3});
        universalMethod(2.718, 3.14);
        universalMethod("Name", 99);
        universalMethod('A');
    }

    public static void universalMethod() {
        System.out.println("Метод без параметров");
    }

    public static void universalMethod(int a) {
        System.out.println("Метод с int: " + a);
    }

    public static void universalMethod(String s) {
        System.out.println("Метод с String: " + s);
    }

    public static void universalMethod(double d) {
        System.out.println("Метод с double: " + d);
    }

    public static void universalMethod(boolean b) {
        System.out.println("Метод с boolean: " + b);
    }

    public static void universalMethod(int a, String s) {
        System.out.println("Метод с int и String: " + a + ", " + s);
    }

    public static void universalMethod(int[] array) {
        System.out.print("Метод с массивом int: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void universalMethod(double a, double b) {
        System.out.println("Метод с двумя double: " + a + ", " + b);
    }

    public static void universalMethod(String s, int a) {
        System.out.println("Метод с String и int: " + s + ", " + a);
    }

    public static void universalMethod(char c) {
        System.out.println("Метод с char: " + c);
    }
}
