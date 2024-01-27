package com.lviv;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedy text:");
        String text = scanner.nextLine();
        char symbols[] = text.toCharArray();
        for (int x = symbols.length - 1; x >= 0; x--) {
            System.out.print(symbols[x]);

        }
    }
}
