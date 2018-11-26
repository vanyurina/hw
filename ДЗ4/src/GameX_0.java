import java.util.Random;
import java.util.Scanner;

public class GameX_0 {
    public  static String[][] map;
    public static final int SIZE = 5; //размер поля
    public static final int DOTS_TO_WIN = 4; //количество фишек для победы
    public static final String DOT_EMPTY = "+"; //свободная клетка
    public static final String DOT_X = "X"; //человек походил
    public static final String DOT_O = "O"; //компьютер походил

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) { //бесконечный цикл
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    /**
     * инициализация игрового поля
     */
    public static void initMap() {
        map = new String[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    /**
     * печать игрового поля в консоль
     */
    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * ход человека
     */
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y, \n" +
                    "где Х - номер строки, а Y - номер колонки");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }

    /**
     * ход компьютера
     */
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    /**
     * проверяем координаты хода на допустимость
     * @param x координата строки
     * @param y координата колонки
     * @return {@code true}, если ход допустим, иначе {@code false}
     */
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x].equals(DOT_EMPTY)) return true;
        return false;
    }

    /**
     * проверка выигрыша
     * @param symb
     * @return
     */
    public static boolean checkWin(String symb) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j].equals(symb)) {
                    if (coincidenceDiagonal(i, j, symb)){ //проверяем диагональ слева направо
                        return true;
                    }
                    if (coincidenceDiagonalInverse(i, j, symb)){ //проверяем диагональ справа налево
                        return true;
                    }
                    if (coincidenceColumn(i, j, symb)){ //проверяем столбец
                        return true;
                    }
                    if (coincidenceRow(i, j, symb)){ //проверяем строку
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * проверка строки
     */
    public static boolean coincidenceRow (int row, int column, String symb){
        int coincidence = 0;
        for (int counter = 0; counter < DOTS_TO_WIN; counter++) {
            if (column < SIZE && map[row][column].equals(symb)){
                ++coincidence;
                ++column;
            } else {
                coincidence = 0;
                ++column;
            }
        }
        if (coincidence == DOTS_TO_WIN){
            return true;
        }
        return false;
    }

    /**
     * проверка столбика
     */
    public static boolean coincidenceColumn (int row, int column, String symb){
        int coincidence = 0;
        for (int counter = 0; counter < DOTS_TO_WIN; counter++) {
            if (row < SIZE && map[row][column].equals(symb)){
                ++coincidence;
                ++row;
            } else {
                coincidence = 0;
                ++row;
            }
        }
        if (coincidence == DOTS_TO_WIN){
            return true;
        }
        return false;
    }

    /**
     * проверка диагонали слева направо
     */
    public static boolean coincidenceDiagonal (int row, int column, String symb){
        int coincidence = 1;
        for (int i = row; i < DOTS_TO_WIN; i++) {
            for (int j = column; j < DOTS_TO_WIN; j++) {
                if (map[i + 1][j + 1].equals(symb)){
                    ++coincidence;
                }
            }
        }
        if (coincidence == DOTS_TO_WIN){
            return true;
        }
        return false;
    }

    /**
     * проверка диагонали справа налево
     **/
    public static boolean coincidenceDiagonalInverse (int row, int column, String symb){
        int coincidence = 0;
        while (coincidence <= DOTS_TO_WIN && row + 1 <= SIZE - 1 && column - 1 >= 0){
            if (map[row][column].equals(symb)){
                ++coincidence;
                ++row;
                --column;
            } else {
                return false;
            }
        }
        if (coincidence == DOTS_TO_WIN){
            return true;
        }
        return false;
    }

    /**
     * проверка Карта заполнена?
     * @return {@code true}, если пустых клеток нет, иначе {@code false}
     */
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

}

