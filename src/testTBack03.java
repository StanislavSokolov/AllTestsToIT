import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testTBack03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int gifts = in.nextInt();
        ArrayList<Present> presents = new ArrayList<>();
        int count = 1;
        int d = 0;
        int c = 0;
        int s = 0;
        int limit = 0;
        while (count < gifts*3 + 1) {
            if (count % 3 == 1) {
                d = in.nextInt();
            } else if (count % 3 == 2) {
                c = in.nextInt();
            } else if (count % 3 == 0) {
                s = in.nextInt();
                if (s > limit) limit = s;
                presents.add(new Present(d, c, s));
            }
            count++;
        }
        presents.sort((o1, o2) -> o1.getReady() - o2.getReady());
        int day = presents.get(0).getReady();
        for (int i = 1; i < presents.size(); i++) {
            if (day < presents.get(i).getReady()) day = presents.get(i).getReady();
            else day++;
        }
        if (day > limit) System.out.println("NO");
        else System.out.println("YES");

    }
}

class Present {
    private int d;
    private int c;
    private int s;

    private int ready;

    public int getReady() {
        return ready;
    }

    public void setReady(int ready) {
        this.ready = ready;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public Present(int d, int c, int s) {
        this.d = d;
        this.c = c;
        this.s = s;
        ready = d + c;
    }
}

//    Костя ответственно относится к подаркам для своих друзей. В этот раз он решил сделать ﻿n﻿ подарков своими руками для своих лучших друзей.
//
//        Для изготовления подарков он заказал материалы, причём материал для подарка ﻿i﻿ придёт в день ﻿d. Также Костя знает, что на изготовление подарка ﻿i﻿ нужно потратить ﻿c дней. Костя трудолюбивый, поэтому в один день может готовить любое число подарков (даже все).
//
//        Готовые подарки Костя планирует отправить почтой. Чтобы подарок ﻿i﻿ успел дойти до нового года, его нужно отправить не позднее дня ﻿s. Кроме того, на почте действует ограничение: можно отправлять не больше одной посылки в один день.
//
//        Помогите Косте понять, успеет ли он приготовить и отправить все подарки так, чтобы они дошли до получателей вовремя.
//
//        Формат входных данных
//
//        В первой строке входных данных дано число ﻿n﻿ — число подарков, которое планирует приготовить Костя (﻿1≤n≤10﻿).
//
//        В следующих n﻿ строках дана информация про каждый из подарков. Описание подарка ﻿i﻿ состоит из трех целых положительных чисел d﻿,c и ﻿s — день, в который доставят материалы для изготовления подарка, время, необходимое на приготовление подарка, и день, до которого должен быть отправлен подарок, чтобы он успел дойти
//
//        Формат выходных данных
//
//        Выведите «YES» (без кавычек), если Костя успеет приготовить и отправить все подарки вовремя, или «NO» (без кавычек) в противном случае.
//
//        Замечание
//
//        В первом тесте из условия Костя может отправить первый подарок в третий день, второй — в шестой день, а третий — в пятый.
//
//        Во втором тесте из условия Костя никак не может успеть отправить все подарки, так как он должен за 3 дня (второй, третий и четвертый) отправить четыре подарка.
//
//        В третьем тесте из Костя может отправить первый подарок в третий день, второй — в шестой день, третий — в четвертый день, а четвертый — в пятый.

//Пример 1
//    Ввод:
//        3
//          1 2 4
//          3 2 8
//          2 3 7
//    Вывод:
//        YES
//
//Пример 2
//        Ввод:
//        4
//          1 1 4
//          1 1 4
//          1 1 4
//          1 1 4
//        Вывод:
//        NO
//Пример 3
//        Ввод:
//        4
//          1 2 4
//          1 2 7
//          2 2 4
//          3 1 5
//        Вывод:
//        YES