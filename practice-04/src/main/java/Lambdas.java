import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class Lambdas {
    public static void main(String[] args) {
        var lamdas = new Lambdas();

        lamdas.task2();
        lamdas.task3();
        lamdas.task4();
        lamdas.task5();
        lamdas.task6();
        lamdas.task7_8();
        lamdas.task9();
    }

    public void task2() {
        Supplier<Integer> counter = new Supplier<>() {
            private int count = -1;

            @Override
            public Integer get() {
                return ++count;
            }
        };

        System.out.println(counter.get());
        System.out.println(counter.get());
        System.out.println(counter.get());
        System.out.println(counter.get());
        System.out.println(counter.get());
    }

    public void task3() {
        Consumer<Integer> multiple = (number) -> {
            for (int i = 0; i < number; i++) {
                System.out.println(number);
            }
        };
        multiple.accept(3);
    }

    public void task4() {
        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println(factorial.apply(3));
    }

    public void task5() {
        Function<Integer, Integer> fibonacci = (n) -> {
            int first = 0;
            int second = 1;

            for (int i = 0; i < n; i++) {
                int tmp = first + second;
                first = second;
                second = tmp;
            }

            return first;
        };
        System.out.println(fibonacci.apply(1));
        System.out.println(fibonacci.apply(2));
        System.out.println(fibonacci.apply(3));
    }

    public void task6() {
        BiFunction<Map<String, Integer>, Map<String, Integer>, Map<String, Integer>> merge = (map1, map2) -> {
            var result = new HashMap<>(map1);
            map2.forEach((key, value) -> {
                result.merge(key, value, Integer::sum);
            });
            return result;
        };

        var test = merge.apply(Map.of("a", 1, "c", 5), Map.of("a", 2, "b", 1));
        System.out.println(test);
    }

    public void task7_8() {
        //7
        Predicate<Integer> isPrim = (number) -> {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        };

        System.out.println(isPrim.test(2));
        System.out.println(isPrim.test(3));
        System.out.println(isPrim.test(4));
        System.out.println(isPrim.test(5));
        System.out.println(isPrim.test(6));

        //8
        Supplier<Integer> prims = new Supplier<>() {
            private int last = 0;

            @Override
            public Integer get() {
                do {
                    ++last;
                } while (!isPrim.test(last));
                return last;
            }
        };

        System.out.println(prims.get());
        System.out.println(prims.get());
        System.out.println(prims.get());
        System.out.println(prims.get());
        System.out.println(prims.get());
        System.out.println(prims.get());
        System.out.println(prims.get());
        System.out.println(prims.get());
        System.out.println(prims.get());
    }

    public void task9() {
        Supplier<Point> pointsOfPlane = new Supplier<>() {
            private int X = -1;
            private int Y = 0;

            @Override
            public Point get() {
                if (Y < X) {
                    ++Y;
                } else {
                    ++X;
                    Y = 0;
                }
                return new Point(X, Y);
            }
        };

        System.out.println(pointsOfPlane.get());
        System.out.println(pointsOfPlane.get());
        System.out.println(pointsOfPlane.get());
        System.out.println(pointsOfPlane.get());
        System.out.println(pointsOfPlane.get());
        System.out.println(pointsOfPlane.get());
        System.out.println(pointsOfPlane.get());
        System.out.println(pointsOfPlane.get());
        System.out.println(pointsOfPlane.get());
        System.out.println(pointsOfPlane.get());
    }
    
}
