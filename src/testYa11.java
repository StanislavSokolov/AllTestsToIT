import java.util.ArrayList;
import java.util.Scanner;

public class testYa11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        ArrayList<String> stringArrayList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            stringArrayList.add(in.next());
        }

        ArrayList<String[]> strings = new ArrayList<>();

        for (String s : stringArrayList) {
            String[] words = s.split(",");
            strings.add(words);
        }




        ArrayList<Integer> integers = new ArrayList<>();

        for (String[] s: strings) {
            ArrayList<Character> chars = new ArrayList<>();
            chars.add(s[0].charAt(0));
            for (int a = 0; a < 3; a++) {
                for (int i = 0; i < s[a].length(); i++) {
                    boolean b = false;
                    for (int j = 0; j < chars.size(); j++) {
                        if (s[a].charAt(i) == chars.get(j)) {
                            b = true;
                        }
                    }
                    if (!b) chars.add(s[a].charAt(i));
                }
            }
            int x1 = 0, x2, x;
            x = Integer.parseInt(s[4]);
            if (x < 10) x2 = x;
            else {
                x1 = x/10;
                x2 = x - 10;
            }
            int y1 = 0, y2, y;
            y = Integer.parseInt(s[3]);
            if (y < 10) y2 = y;
            else {
                y1 = y/10;
                if (y < 20) y2 = y - 10;
                else {
                    if (y < 30) y2 = y - 20;
                    else y2 = y - 30;
                }
            }

            int result = chars.size() + (x1 + x2 + y1 + y2) * 64 + ((int) chars.get(0) - 64) * 256;
            integers.add(result);
        }

        for (Integer i: integers) {
            int a;
            if (i < 4096) System.out.println(Integer.toHexString(i));
            else {
                a = i/4096;
                System.out.print(Integer.toHexString(i - 4096*a) + " ");
            }
        }
    }
}
