package com.util;

import java.util.Scanner;

public class KeyboardUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static int getInt(String message) {
        System.out.print(message + " ");
        return scanner.nextInt();
    }

    public static double getDouble(String message) {
        System.out.print(message + " ");
        return scanner.nextDouble();
    }

    public static String getString(String message) {
        System.out.print(message + " ");
        return scanner.next();
    }

    public static void closeScanner() {
        scanner.close();
    }
}
