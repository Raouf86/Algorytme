package algorytmy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Page1 {

    public static void main(String[] args) {

        task1(new int[]{1, 13, 51322, -513, 0, 53, 100, 555});
        System.out.println("_____________________________________________");

        task2(7);
        task2(6);
        System.out.println("_____________________________________________");

        task3(new int[]{1, 1, 4, 6, 6, 90, 151, -6});
        System.out.println("_____________________________________________");

        task4(new int[]{1, 1, 4, 6, 6, 6, 151, -6});
        System.out.println("_____________________________________________");

        task5();
        System.out.println("_____________________________________________");

        task6("ala");
        task6("testes");
        System.out.println("_____________________________________________");


        task7("Ala ma kota");
        System.out.println("_____________________________________________");

        task8("Ala ma kota");
        System.out.println("_____________________________________________");

        task9(15);
        System.out.println("_____________________________________________");

        task10(3);
        System.out.println("_____________________________________________");

        task11(10);
        System.out.println("_____________________________________________");

        task12(new int[]{10, 3, 5, 6});
        task12(new int[]{7, 2, 10, 9});
        task12(new int[]{2, 10, 7, 2});
        System.out.println("_____________________________________________");

        task13(new int[]{1, 2, 4, 7, 8, 10, 10, -1, -2, -4, 100, 22, -10});


    }


    public static void task1(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Najwększa liczba to:" + max);
    }

    public static void task2(int number) {
        if (number < 2) {
            System.out.println(number + " to nie jest liczba pierwszaa");
            return;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                System.out.println(number + " to nie jest liczba pierwszaa");
                return;
            }
        }
        System.out.println(number + " to  jest liczba pierwszaa");
    }


    public static void task3(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Najmniejsza podana liczba to " + min + " a największa to " + max);
    }

    public static void task4(int[] numbers) {
        int result[] = Arrays.stream(numbers).distinct().toArray();
    }


    public static void task5() {
        for (int i = 1; i <= 100; i++) {
            String result = "";
            if (i % 3 == 0) {
                result = "Fizz";
            }
            if (i % 5 == 0) {
                result += "Buzz";
            }
            if (result.equals("")) {
                System.out.println(i);
            } else {
                System.out.println(result);
            }
        }
    }

    public static void task6(String text) {
        int f = 0;
        int b = text.length() - 1;
        while (b > f) {
            char fChar = text.charAt(f++);
            char bChar = text.charAt(b--);
            if (fChar != bChar) {
                System.out.println("Nie jest");
                return;
            }

        }
        System.out.println("Jest");
    }

    public static void task7(String text) {
        String result = "";
        String[] splitted = text.split(" ");

        for (String s : splitted) {
            if (s.length() > result.length()) {
                result = s;
            }
        }
        System.out.println(result);
    }

    public static void task8(String text) {
        String result = text.replaceAll(" ", "");
        System.out.println(result.length());
    }

    public static void task9(int n) {
        int number1 = 0;
        int number2 = 1;
        int counter = 0;

        while (counter < n) {
            System.out.print(number1 + " ");
            int num3 = number2 + number1;
            number1 = number2;
            number2 = num3;
            counter = counter + 1;
        }
        System.out.println("");
    }

    public static void task10(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);

    }

    private static void task11(int number) {
        int x;
        if (number <= 1) {
            System.out.print(number);
            return;
        }
        x = number % 2;
        task11(number >> 1);
        System.out.println(x);
    }

    public static void task12(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println(max - min);
    }

    public static void task13(int[] numbers) {
        int[] result = new int[]{};
        final Set<Integer> duplicated = new HashSet<>();
        for (int number : numbers) {
            if (number < 0) {
                number = number * -1;
            }
            if (duplicated.contains(number)) {
                result = Arrays.copyOf(result, result.length + 2);
                result[result.length - 2] = -number;
                result[result.length - 1] = number;
                duplicated.remove(number);
            } else {
                duplicated.add(number);
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
