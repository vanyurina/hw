import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] words = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                                    "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
                                    "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
                                    "pumpkin", "potato"};
        //загадываем слово
        Random random = new Random();
        String hiddenWord = words[random.nextInt(words.length + 1)];
        //System.out.println(hiddenWord); //подсказка для тестирования

        //организуем ввод слова пользователем
        System.out.println("Введите слово");
        Scanner scanner = new Scanner(System.in);
        String enteredWord = scanner.nextLine();

        //пока загаданное слово и введенное слово не совпадут
        while (!hiddenWord.equalsIgnoreCase(enteredWord)){
            //если длина загаданного слова и введенного слова совпадают
            if (hiddenWord.length() == enteredWord.length()) {
                stringСomparison(hiddenWord, enteredWord);
            }

            //если длина загаданного слова больше длины введенного слова
            if (hiddenWord.length() > enteredWord.length()) {
                char[] charVvod = new char[hiddenWord.length()];

                for(int i = 0; i < charVvod.length; ++i) {
                    charVvod[i] = 'X';
                }

                for(int i = 0; i < enteredWord.length(); ++i) {
                    charVvod[i] = enteredWord.charAt(i);
                }

                String enteredWord1 = new String(charVvod);
                stringСomparison(hiddenWord, enteredWord1);
            }

            //если длина загаданного слова меньше длины введенного слова
            if (hiddenWord.length() < enteredWord.length()) {
                enteredWord = enteredWord.substring(0, hiddenWord.length());
                stringСomparison(hiddenWord, enteredWord);
            }

            System.out.println();
            System.out.println("Неверно. Введите слово");
            enteredWord = scanner.nextLine();
        }

        System.out.println("Вы угадали!!!");
    }

    //посимвольно сравниваем две строки
    public static void stringСomparison(String strokaZagad, String strokaVvod) {
        for(int i = 0, j = 0; i < strokaZagad.length(); ++i, ++j) {
            if (strokaZagad.charAt(i) == strokaVvod.charAt(j)) {
                System.out.print(strokaZagad.charAt(i));
            } else {
                System.out.print("X");
            }
        }
        for(int i = strokaZagad.length(); i < 15; ++i) {
            System.out.print("X");
        }
    }
}
