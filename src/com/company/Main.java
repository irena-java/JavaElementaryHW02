package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите предложение");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println("Введите слово");
        String word = scanner.nextLine();
        System.out.println("Выберите: firstMatches(1)/countMatches(2)/clearMatches(3)");
        String task = scanner.nextLine();

        StringWoker stringWoker = null;
        if (task.equals("firstMatches") || task.equals("1")) {
            stringWoker = new FirstMatches();
        } else if (task.equals("countMatches") || task.equals("2")) {
            stringWoker = new CountMatches();
        } else if (task.equals("clearMatches") || task.equals("3")) {
            stringWoker = new ClearMatches();
        } else {
            System.out.println("Результат: ошибка при вводе типа задачи.");
        }

        if (stringWoker != null) {
            int result = stringWoker.execute(sentence, word);
            String resultString = "Результат: " + result;
            System.out.println("?Результат выводить: 1-консоль/2-файл\"homework2.txt\"");
            int output = scanner.nextInt();

            Writer writer = null;
            if (output == 1) {
                writer = new ConsoleWriter();
            } else if (output == 2) {
                writer = new FileWriter();
            } else {
                System.out.println("Результат: ошибка при вводе типа вывода");
            }
            if (writer != null) {
                writer.write(resultString);
            }
        }
    }
}
