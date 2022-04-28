package algorytmy;

import java.util.Arrays;
import java.util.Locale;

public class Page2 {

    public static void main(String[] args) {

        task6(new int[]{1, 2, 3});
        System.out.println("_____________________________________________");

        // task7   - tutaj iterujemy aż to ideksu 5, a maksymalny index tablicy to 4. Bo indexy numerujemy od 0.


        task8(new int[]{4, 1, 9, 15});
        System.out.println("_____________________________________________");

        System.out.println(Arrays.toString(task9(new int[]{1, 2, 3, 4})));
        System.out.println("_____________________________________________");

        System.out.println(Arrays.toString(task10(new String[]{"Ala", "KOTAA", "tests", "tests"})));
        System.out.println("_____________________________________________");

        System.out.println(Arrays.toString(task11(new String[]{"Ala", "KOTAA", "tests", "kottestowy"})));
        System.out.println("_____________________________________________");

        System.out.println(task12(new String[]{"Ala", "Bardzodlugiwyraz", "tests", "kottestowy"}));
        System.out.println("_____________________________________________");

        System.out.println(Arrays.toString(task13(new int[]{1, 2, 3, 4, 35, 567, 44, 35, 7, 11, 13, 17, 19, 23, 29})));
        System.out.println("_____________________________________________");

        System.out.println(Arrays.toString(task14(new boolean[]{false, true, true, false, false})));
        System.out.println("_____________________________________________");

        System.out.println((task15(new int[]{1, 2, 3, 3, 3, 4, 3}, 3)));
        System.out.println("_____________________________________________");

        System.out.println((task16(3, 4, 5)));
        System.out.println("_____________________________________________");

        System.out.println((task17(9)));
        System.out.println("_____________________________________________");

        System.out.println((task19(16)));
        System.out.println("_____________________________________________");

        System.out.println((task20("aaa", "bb")));
        System.out.println("_____________________________________________");

        System.out.println((task21("aaaaa", "sad")));
        System.out.println("_____________________________________________");

        System.out.println(task22(16));
        System.out.println("_____________________________________________");

        System.out.println((task23(27)));
        System.out.println("_____________________________________________");

        task24(17);
        System.out.println("_____________________________________________");

        System.out.println((task25()));
        System.out.println("_____________________________________________");

        task26("kajak");
        System.out.println("_____________________________________________");

        System.out.println((task27("87122508076")));
        System.out.println("_____________________________________________");

        System.out.println(Arrays.toString(task28(new int[]{1, 2, 45, 5, 6, 7, 88, 100})));

    }

    public static void task6(int[] numbers) {
        int[] result = new int[numbers.length];
        int counter = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            result[counter] = numbers[i];
            counter++;
        }
        System.out.println(Arrays.toString(result));
    }


    public static void task8(int[] numbers) {
        int n = numbers.length;
        int tmp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    tmp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] task9(int[] numbers) {
        int middle = numbers.length / 2;
        int[] result = new int[2];
        result[0] = numbers[middle - 1];
        result[1] = numbers[middle];
        return result;
    }

    public static String[] task10(String[] words) {
        String[] result = new String[]{};
        for (String word : words) {
            if (word.length() == 5) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = word;
            }
        }
        return result;
    }

    public static String[] task11(String[] words) {
        String[] result = new String[]{};
        for (String word : words) {
            result = Arrays.copyOf(result, result.length + 1);
            result[result.length - 1] = word.toLowerCase(Locale.ROOT);
        }

        return result;
    }

    public static int task12(String[] words) {
        int max = Integer.MIN_VALUE;
        for (String word : words) {
            if (word.length() > max) {
                max = word.length();
            }
        }
        return max;
    }

    public static int[] task13(int[] numbers) {
        int[] result = new int[]{};

        for (int number : numbers) {
            boolean isOk = true;
            if (number < 2) {
                isOk = false;
            }
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isOk = false;
                    break;
                }
            }
            if (isOk) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = number;
            }
        }
        return result;
    }

    public static boolean[] task14(boolean[] values) {
        boolean[] result = new boolean[]{};
        for (boolean value : values) {
            if (value) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = true;
            }
        }
        return result;
    }

    public static int task15(int[] numbers, int k) {
        int counter = 0;
        for (int number : numbers) {
            if (number == k) {
                counter++;
            }
        }

        return counter;
    }

    public static boolean task16(int a, int b, int c) {
        return a * a + b * b == c * c || a * a + c * c == b * b || c * c + b * b == a * a;
    }

    public static boolean task17(int number) {
        return number % 2 == 0;
    }

    public static boolean task19(int number) {
        double retValue = Math.sqrt(number);
        return ((retValue - Math.floor(retValue)) == 0);
    }

    public static String task20(String a, String b) {
        return a + b;
    }


    public static int task21(String a, String b) {
        return Math.max(a.length(), b.length());
    }


    public static int task22(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        return counter;

    }

    public static boolean task23(int number) {
        double retValue = Math.pow(number, 1.0 / 3);
        return ((retValue - Math.floor(retValue)) == 0);
    }

    public static void task24(int number) {
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

    public static int task25() {
        int max = Integer.MIN_VALUE;
        int founded = 0;
        for (int i = 2; i <= 10000; i++) {
            int retValue = task22(i);
            if (retValue > max) {
                max = retValue;
                founded = i;
            }
        }
        return founded;
    }

    public static void task26(String text) {
        int forward = 0;
        int backward = text.length() - 1;
        while (backward > forward) {
            char forwardChar = text.charAt(forward++);
            char backwardChar = text.charAt(backward--);
            if (forwardChar != backwardChar) {
                System.out.println("Nie jest");
                return;
            }

        }
        System.out.println("Jest");
    }

    public static boolean task27(String text) {
        boolean isNumber = true;
        for (char c : text.toCharArray()) {
            if (!Character.isDigit(c)) {
                isNumber = false;
                break;
            }
        }
        return isNumber && text.length() == 11;
    }

    public static int[] task28(int[] numbers) {
        int[] result = new int[numbers.length];
        int counter = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            result[counter] = numbers[i];
            counter++;
        }
        return result;
    }
}
