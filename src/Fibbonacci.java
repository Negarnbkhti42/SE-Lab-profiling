import java.util.HashMap;
import java.util.Map;

public class Fibbonacci {

    private static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int limit = 100; // Adjust the limit as needed
        System.out.println("Fibonacci numbers up to " + limit + ": ");
        for (int i = 0; i <= limit; i++) {
            System.out.print(optimizedFibonacci(i) + " ");
        }
    }

    public static int optimizedFibonacci(int n) {
        Utils.sleepUninterrruptable(0.05);
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = optimizedFibonacci(n - 1) + optimizedFibonacci(n - 2);
        memo.put(n, result);

        return result;
    }
}

//public class Fibbonacci {
//
//
//        public static void main(String[] args) {
//            int limit = 40; // Adjust the limit as needed
//            System.out.println("Fibonacci numbers up to " + limit + ": ");
//            for (int i = 0; i <= limit; i++) {
//                Utils.sleepUninterrruptable(0.01);
//                System.out.print(badPerformanceFibonacci(i) + " ");
//            }
//        }
//
//        public static int badPerformanceFibonacci(int n) {
//            if (n <= 1) {
//                return n;
//            } else {
//                return badPerformanceFibonacci(n - 1) + badPerformanceFibonacci(n - 2);
//            }
//        }
//
//
//}
