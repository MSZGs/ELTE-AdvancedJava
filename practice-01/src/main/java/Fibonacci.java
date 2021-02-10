public class Fibonacci {

    public static int withLoop(int n) {
        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {
            int tmp = first + second;
            first = second;
            second = tmp;
        }

        return first;
    }

    public static int withRecursion(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return withRecursion(n - 2) + withRecursion(n - 1);
        }
    }
}
