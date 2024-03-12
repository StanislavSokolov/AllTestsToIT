import java.util.Scanner;

public class testAllToScala02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        boolean findA = true;
        boolean findB = false;
        boolean findC = false;
        int rezult = 0;
        for (int i = 0; i < s.length(); i++) {
            if (findA) {
                if (s.charAt(i) == 'a') {
                    findA = false;
                    findB = true;
                }
            } else {
                if (findB) {
                    if (s.charAt(i) == 'b') {
                        findB = false;
                        findC = true;
                    } else {
                        findA = true;
                        findB = false;
                    }
                } else {
                    if (findC) {
                        if (s.charAt(i) == 'c') {
                            rezult++;
                        }
                        findA = true;
                        findC = false;
                    }
                }
            }
        }
        System.out.println(rezult);
    }
}

//    Дана строка ﻿s﻿ из маленьких букв английского алфавита. Найдите количество троек ﻿abc в ней