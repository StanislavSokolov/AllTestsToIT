import java.util.Scanner;

public class testTJ03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int res0 = number;
        int res1 = number;
        for (int i = number; i > 1; i--) {
            int x = i - 1;
            int y = number - x;
            if (x % y == 0) {
                res0 = x;
                res1 = y;
            }
        }
        System.out.print(res0 + " " + res1);
    }
}
