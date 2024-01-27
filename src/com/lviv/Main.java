package com.lviv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedy text:");
        String text = scanner.nextLine();
        StringBuilder str = new StringBuilder();
        str.append(text);
        str = str.reverse();
        System.out.println(str);
    }
}
