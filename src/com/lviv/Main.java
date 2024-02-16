package com.lviv;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedy text: ");
        String text = scanner.nextLine();
        char symbols[] = text.toCharArray();
        System.out.println(symbols);
        for (int i = symbols.length - 1; i >= 0; i--) {
            System.out.print(symbols[i]);
        }

    }
}
