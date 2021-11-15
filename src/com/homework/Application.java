package com.homework;

import java.util.Scanner;

/**
 * @author Volodia Sachenko
 * @version 0.1
 * @since 14.11.21
 */

public class Application {

    public static void main(String[] args) {
        System.out.println("Программа Document Worker \uD83D\uDCC4");
        System.out.println("Подсказка: для бесплатной версии введите 123");
        System.out.println("Ключ активации для версии pro: 12345");
        System.out.println("Ключ активации для версии exp: 123456");
        System.out.println("Для выхода из программы, нажмите любую клавишу, и enter");
        System.out.println("Пожалуйста, введите номер ключа доступа, для активации программы:");
        String input = scanning();
        if (input.equals("12345")) {
            System.out.println((char) 27 + "[34m" + "Версия Pro, успешно активирована.");
            DocumentWorker access = new ProDocumentWorker();
            show(access);
            System.out.println("--------------");
        }
        if (input.equals("123456")) {
            System.out.println((char) 27 + "[35m" + "Версия Expert, успешно активирована.");
            DocumentWorker access = new ExpertDocumentWorker();
            show(access);
            System.out.println("--------------");
        }
        if (input.equals("123")) {
            System.out.println((char) 27 + "[36m" + "Бесплатная демо-версия.");
            DocumentWorker access = new DocumentWorker();
            show(access);
            System.out.println("--------------");
        } else {
            System.out.println("Выход из системы");
        }
    }

    private static String scanning() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void show(DocumentWorker type) {
        type.openDocument();
        type.editDocument();
        type.saveDocument();
    }
}
