package com.lviv;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedi text: ");
        String text = scanner.nextLine();
        String arr []= text.split("");
        for (int i = arr.length-1; i >=0; i--){
            System.out.print(arr[i]);

        }

    }
}
