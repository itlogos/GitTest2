package com.lviv;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedi text:");
       String text = scanner.nextLine();
       StringBuilder builder = new StringBuilder();
       builder.append(text);
       builder = builder.reverse();
        System.out.println(builder);
    }
}
