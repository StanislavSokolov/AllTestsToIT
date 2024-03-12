import java.util.Scanner;

public class testTJ01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberLetters = in.nextInt();
        in = new Scanner(System.in);
        String name = in.nextLine();
        String key = in.next();

        String[] words = name.split(" ");
        int j = 0;
        int result = 0;
        for (String word: words) {
            char prev = 'A';
            boolean b = false;
            for (int i = 0; i < word.length(); i++) {
                char c = key.charAt(j);
                j = j + 1;
                if (!b) {
                    if (c == prev) {
                        b = true;
                        result = result + 1;
                    }
                }
                prev = c;
            }
        }
        System.out.println(result);
    }
}
