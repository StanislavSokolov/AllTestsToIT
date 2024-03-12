import java.util.ArrayList;
import java.util.Scanner;

public class testTBack02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int books = in.nextInt();
        int[] m = new int[books];
        int count = 0;
        while (count < books) {
            m[count] = in.nextInt();
            count++;
        }


        ArrayList<Stack> stacks = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (stacks.isEmpty()) stacks.add(new Stack(m[0], 1));
            else {
                boolean con = false;
                for (Stack stack: stacks) {
                    if (!con) {
                        if (stack.getHeight() == m[i]) {
                            stack.setCount(stack.getCount() + 1);
                            con = true;
                        }
                    }
                }
                if (!con) stacks.add(new Stack(m[i], 1));
            }
        }

        stacks.sort((o1, o2) -> o1.getCount() - o2.getCount());

        System.out.println(stacks.size());

        for (Stack stack: stacks) {
            System.out.print(stack.getCount() + " ");
        }
    }
}

class Stack {
    private int height;
    private int count;

    public Stack(int height, int count) {
        this.height = height;
        this.count = count;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

//    Заяц Миша очень любит читать, поэтому на новый год ему подарили ﻿n﻿ книг.
//
//        Михаил хочет сложить компактно все подаренные книги в несколько стопок. Заяц считает, что книги сложены в стопки красиво, если в каждой стопке все книги имеют одинаковую высоту.
//
//        Миша хочет сложить книги в минимальное число стопок так, чтобы книги были сложены красиво. Помогите ему и найдите, как нужно сложить книги в стопки.
//
//        Формат входных данных
//
//        В первой строке входных данных дано целое число n﻿ — число книг, подаренных Зайцу (﻿1≤n≤10 в 5).
//
//        Во второй строке дано ﻿n﻿ целых чисел ﻿— высоты книг (﻿1≤n≤10 в 5)
//
//        Формат выходных данных
//
//        В первой строке вывода напечатайте одно число ﻿
//        k﻿ — минимальное число стопок книг.
//
//        Во второй строке выведите высоты стопок книг в порядке неубывания.
//
//        Замечание
//
//        Обратите внимание, что в ответе нужно вывести высоты стопок книг, а не высоты книг в стопках.
//
//        В первом примере из условия Миша может сложить книги в две стопки, высота каждой из стопок будет равна 1.
//
//        Во втором примере из условия Миша может сложить книги в три стопки: в первой будут одна книга с высотой 1, во второй одна книга с высотой 3, в третьей — две книги с высотой 2.
//
//
//Пример 1
//    Ввод:
//        2
//        1 2
//    Вывод:
//        2
//        1 1
//
//Пример 2
//        Ввод:
//        4
//        1 2 2 3
//        Вывод:
//        3
//        1 1 2
//Пример 3
//        Ввод:
//        5
//        5 4 4 5 5
//        Вывод:
//        2
//        2 3

