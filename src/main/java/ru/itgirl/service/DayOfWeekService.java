package ru.itgirl.service;


import ru.itgirl.entity.DayOfWeek;

import java.util.Scanner;
public class DayOfWeekService {

    public static String getRussianDayOfWeek(String englishDayOfWeek) {
        if (englishDayOfWeek == null || englishDayOfWeek.isEmpty()) {
            return "Please enter the name of the day of the week in English.";
        }
        try {
            DayOfWeek dayOfWeek = DayOfWeek.valueOf(englishDayOfWeek.toUpperCase());
            return dayOfWeek.getRussianName();
        } catch (IllegalArgumentException e) {
            return "Wrong enter.";
        }
    }

    public static void runMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the application!");
        System.out.println("To exit the app type:'exit'.");
        while (true) {
            System.out.print("Please enter the name of the day of the week in English:");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using the application. Goodbye!");
                break;
            }
            String output = getRussianDayOfWeek(input);
            System.out.println(output);
        }
        scanner.close();
    }
}
