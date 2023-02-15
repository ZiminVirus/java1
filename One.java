
// import java.util.Arrays;
import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("sourse: ");
        String source = iScanner.nextLine();
        System.out.println("year: ");
        int year = iScanner.nextInt();
        System.out.printf("int a: ");
        int a = iScanner.nextInt();
        System.out.printf("int b: ");
        int b = iScanner.nextInt();
        System.out.printf("len: ");
        int len = iScanner.nextInt();
        System.out.printf("initalValue: ");
        int initalValue = iScanner.nextInt();
        boolean one = isSumBetween10And20(a, b);
        System.out.println(one);
        boolean two = (isPositive(a));
        System.out.println(two);
        System.out.printf("repeet: ");
        int repeat = iScanner.nextInt();
        // System.out.println(repeet);
        iScanner.close();
        printString(source, repeat);
        boolean leapYear = isLeapYear(year);
        System.out.println(leapYear);
        int[] array = createArray(len, initalValue);
        System.out.println(array);

    }

    // 1. Написать метод, принимающий на вход два целых числа и проверяющий,
    // * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
    // true, в противном случае – false.
    private static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        if (sum >= 10 && sum <= 20) {
            return true;
        } else
            return false;
    }

    // 2. проверить, что a положительное
    private static boolean isPositive(int a) {
        if (a >= 0) {
            return true;
        } else
            return false;

    }

    // // 3. напечатать строку source repeat раз
    private static void printString(String source, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.println(source);
        }

    }

    // 4. // проверить, является ли год високосным. если да - return true
    private static boolean isLeapYear(int year) {
        if ((year % 4) == 0) {
            return true;
        }
        return false;
    }

    // 5. // должен вернуть массив длины len, каждое значение которого равно
    // initialValue
    private static int[] createArray(int len, int initalValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initalValue;

        }
        return arr;
    }


    
    String [] stringArray = {"aaa", "aab", "aa"};
    String printStringArray = findCommonPrefix (stringArray);
    // 6. // /** Найти общий префикс среди слов из одного массива.
    // * ["aaa", "aab", "aa"] -> "aa", ["abc", "bca", "cda"] -> ""
    // */
    private static String findCommonPrefix(String[] source) {

        if (source.length == 0) return "";
        String prefix = "";
        int minLength = source [0].length();
        for (int i = 1; i < source.length; i++) {
            if (source [i].length() < minLength){

            minLength = source [i].length();
        }
        }
        int count = 0;
        while (count < source.length){
            int temp = 0;
            for (int i = 0; i < source.length-1; i++) {
                String a = source [i];
                a = a.substring(count, count+1);
                String b = source [i+1];
                b = b.substring(count, count+1);
                if (a.equals(b)){
                    temp++;
                }
        if (temp == source.length-1){
            String sumbol = source [i];
            sumbol =sumbol.substring(count, count+1);
            prefix += sumbol;       
        }
        else return prefix;
        count++;

            }
            return prefix;
        }

        }
    
    }
