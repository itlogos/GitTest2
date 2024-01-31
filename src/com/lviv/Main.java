package com.lviv;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentense = scanner.nextLine();
        String words[] = sentense.split(" ");
        int size = words.length;
        HashMap<String, Integer> key = new HashMap<String, Integer>();
        for (int i = 0; i < size; i++) {
            if (key.containsKey(words[i])) {
                int counter = key.get(words[i]);
                key.put(words[i], counter + 1);
            } else {
                key.put(words[i], 1);
            }

        }
        System.out.println(key);
    }
}
