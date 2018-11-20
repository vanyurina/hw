import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        n3();
        n4();
        n5();
        n5_2();
        n6();
        n7();
        n8();
    }

    // task 3
    public static void n3() {
        int a = 10;
        int b = 23;
        int c = 2;
        int d = 78;

        int r = calcN3(a, b, c, d);

        System.out.println("Result task 3 = " + r);
    }

    public static int calcN3(int a1, int b1, int c1, int d1){
       int result = a1 * (b1 + (c1 / d1));
       return result;
    }

    // task 4
    public static void n4() {
        int a = 10;
        int b = 23;

        boolean r = calcN4(a, b);

        System.out.println("Result task 4 = " + r);
    }

    public static boolean calcN4(int a1, int b1){
        int summ = a1 + b1;
        if ((summ > 10) && (summ <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    // task 5
    public static void n5() {
        int a = -10;

        System.out.println("Result task 5 = " + calcN5(a));
    }

    // tast 5 - 2
    public static void n5_2() {
        System.out.println("Result task 5_2 =" + calcN5_2(10));
    }

        public static String calcN5_2 (int p) {
        if (isPositive(p)) {
            return "positive";
        } else {
            return  "negative";
        }
    }

    public static Boolean isPositive(int p) {
        return p >= 0;
    }

    public static Boolean isNegative(int p) {
        return !isPositive(p);
    }

    public static String calcN5(int a1){
        if (a1 >= 0) {
            return "Positive number";
        }
        return "Negative number";
    }

    // task 6
    public static void n6() {
        int a = - 10;
        System.out.println("Result task 6 = " + calcN6(a));
    }

    public static Boolean calcN6(int a1) {
        if (a1 < 0) {
            return true;
        }
        return false;
    }

    // task 7
    public static void n7() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        String name1 = in.nextLine();
        System.out.println("Result task 7 = " + calcN7(name1));
    }

    public static String calcN7(String a1) {
        return "Привет, " + a1;
    }

    // task 8
    public static void n8() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год");
        int year = in.nextInt();
        if (isVisokosn(year)) {
          System.out.println("Result task 8 = год високосный");
        } else {
            System.out.println("Result task 8 = год невисокосный");
        }
    }

    public static Boolean isVisokosn(int year) {
        if ((year % 4 == 0) || (year % 400 == 0)) {
         return true;
        }
        return false;
    }

}
