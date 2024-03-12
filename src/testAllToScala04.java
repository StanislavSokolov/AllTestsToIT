import java.util.Scanner;

public class testAllToScala04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int like = in.nextInt();
        int[] m = new int[count];

        int mood = 0;

        for (int i = 0; i < count; i++) {
            m[i] = in.nextInt();
        }

        int step = 0;

        for (int i = 0; i < count; i++) {
            if (step == 0) {
                if (m[i] > 0) {
                    mood = mood + m[i];
                } else {
                    step = 1;
                }
            } else if (step == 1) {
                if (m[i] > 0) {
                    mood = mood + m[i];
                } else {
                    step = 2;
                }
            } else {
                if (like > 0) {
                    if (m[i] > 0) {
                        mood = mood + m[i];
                        step = 0;
                    } else {
                        step = 2;
                    }
                }
            }

        }


    }
}
