import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Задание 1
        masN1();
        System.out.println();

        //Задание 2
        masN2();
        System.out.println();

        //Задание 3
        masN3();
        System.out.println();

        //Задание 4
        masN4();
        System.out.println();

        //Задание 5
        masN5();
        System.out.println();

        //Задание 6
        System.out.println("Задание 6");
        //Случайным образом создается одномерный массив размерности n (5 <= n <= 15)
        //и заполняется случайчыми числами от 0 до 10
        int k = (int) (Math.random() * 10 + 5);
        int[] mas6 = new int[k];
        for (int i = 0; i < k; i++) {
            mas6[i] = (int)(Math.random() * 10);
        }

        System.out.println("Заданный массив");
        System.out.print(java.util.Arrays.toString(mas6));
        System.out.println();

        System.out.println(masN6(mas6));
        System.out.println();

        //Задание 7
        System.out.println("Задание 7");
        //Случайным образом создается одномерный массив размерности n (5 <= n <= 15)
        //и заполняется случайчыми числами от 0 до 100
        int m = (int) (Math.random() * 10) + 5;
        int[] mas7 = new int[m];
            for( int i = 0; i<m;i++) {
                mas7[i] = (int) (Math.random() * 100);
            }
        System.out.println("Заданный массив");
        System.out.print(java.util.Arrays.toString(mas7));
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.println("Задайте смещение элементов массива");
        int n = in.nextInt();

        masN7(mas7, n);
    }

    // task 1
    public static void masN1(){
        int[] mas1 = {1, 0, 0, 1, 1, 1, 0, 1, 0, 0};
        System.out.println("Задание 1");
        System.out.println("Заданный массив");
        System.out.print(java.util.Arrays.toString(mas1));
        System.out.println();
        System.out.println("Полученный массив");

        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] == 0) {
                mas1[i]=1;
            }else {
                mas1[i]=0;
            }
        }
        System.out.print(java.util.Arrays.toString(mas1));
        System.out.println();
    }

    // task 2
    public static void masN2() {
        int[] mas2 = new int[8];
        System.out.println("Задание 2");
        for (int i = 0; i < 8; i++) {
            mas2[i] = i * 3;
        }
        System.out.println("Полученный массив");
        System.out.print(java.util.Arrays.toString(mas2));
        System.out.println();
    }

    //task 3
    public static void masN3() {
    int[] mas3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задание 3");
        System.out.println("Заданный массив");
        System.out.print(java.util.Arrays.toString(mas3));
        System.out.println();
        System.out.println("Полученный массив");
        for (int i = 0; i <mas3.length ; i++) {
            if (mas3[i] < 6){
                mas3[i] = mas3[i] * 2;
            }
        }
        System.out.print(java.util.Arrays.toString(mas3));
        System.out.println();
    }

    //task4
    public static void masN4() {
        System.out.println("Задание 4");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность квадратного двумерного массива");
        int n = in.nextInt();
        int[][] mas4 = new int[n][n];
        System.out.println("Получен следующий массив");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j) || (i == n - j - 1)) {
                    mas4[i][j] = 1;
                }
                System.out.print(mas4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //task5
    public static void masN5(){
        int[] mas5 = new int[10];
        int max = 0, min = 100;

        System.out.println("Задание 5");
        System.out.println("Заданный массив");

        for (int i = 0; i < 10; i++) {
            mas5[i] = (int) (Math.random() * 100);
        }
        System.out.print(java.util.Arrays.toString(mas5));
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (mas5[i] > max){
                max = mas5[i];
            }
            if (mas5[i] < min){
                min = mas5[i];
            }
        }

        System.out.println("Максимальный элемент " + max);
        System.out.println("Минимальный элемент " + min);
    }

    //task6
    public static boolean masN6(int[] mas){
        int n1 = mas.length;
        int s = 0, s1 = 0;

        for (int i = 0; i < n1-1; i++) {
            s = s + mas[i];
            for (int j = i + 1; j < n1; j++) {
                s1 = s1 + mas[j];
            }
            if (s == s1){
                System.out.println("Cумма левой и правой части массива равны " + s);
                return true;
            }
            s1 = 0;
        }
        return false;
    }

    //task7
    public static void masN7(int[] mas, int n1){
        int m1 = mas.length;

        if (n1 > 0) {
            for (int i = m1 - 1; i >= n1; i--) {
                mas[i] = mas[i - n1];
            }
            for (int i = 0; i < n1; i++) {
                mas[i] = 0;
            }
        }
        if (n1 < 0){
            n1 = Math.abs(n1);
            for (int i = 0; i < m1 - n1; i++) {
                    mas[i] = mas[i + n1];
            }
            for (int i = m1 - n1; i < m1; i++) {
                    mas[i] = 0;
            }
        }

        System.out.print(java.util.Arrays.toString(mas));
        System.out.println();
    }

}
