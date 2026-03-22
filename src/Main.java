import java.util.Scanner;

public class Main {
    public static void readArray(Scanner sc, int[] arr, int index, int n) {
        if (index == n) return;
        arr[index] = sc.nextInt();
        readArray(sc, arr, index + 1, n);
    }

    public static double findSum(int[] arr, int n) {
        if (n <= 0) return 0;
        return arr[n - 1] + findSum(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        readArray(sc, arr, 0, n); // Рекурсивный ввод

        double sum = findSum(arr, n);
        System.out.println(sum / n);
    }
}