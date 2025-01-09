public class task29 {
    public static void main(String[] args) {
        int[] array = {123, 7, -14, 67, 16, 98, 75, 576};
        System.out.println("В массиве: ");
        printArray(array);
        System.out.println("Минимальное число: " + getMin(array));
        System.out.println("Максимальное число: " + getMax(array));
        printSqrt(array);
    }

    public static int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int val : array) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    public static int getMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int val : array) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }

    public static void printArray(int[] array) {
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void printSqrt(int[] array) {
        for (int val : array) {
            double sqrt = Math.sqrt(Math.abs(val));
            System.out.println("Корень квадратный для числа " + val + " равен " + sqrt);
        }
    }
}
