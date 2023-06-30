import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String variableName;
        int NUM = 42;
        String word = "Hello";

        variableName = NUM + word;

        System.out.println("Значение переменных:");
        System.out.println("variableName: " + variableName);
        System.out.println("NUM: " + NUM);
        System.out.println("word: " + word);

        // Условная конструкция
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        // ДЗ на сообразительность
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя:");
        String userName = scanner.nextLine();

        System.out.println("Привет, " + userName + "!");
    }
}
