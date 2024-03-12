import java.util.ArrayList;
import java.util.Scanner;

public class testTJ02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> valueArrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            valueArrayList.add(in.nextInt());
        }
        in = new Scanner(System.in);
        ArrayList<Integer> countArrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            countArrayList.add(in.nextInt());
        }
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + valueArrayList.get(i)*countArrayList.get(i);
        }

        int result = 0;
        int[] coef = {0, 0, 0};
        for (int i = sum; i > -1; i--) {
            coef[0] = i;
            for (int j = 0; j < sum - i + 1; j++) {
                coef[1] = sum - i - j;
                coef[2] = j;
                if ((coef[0] % valueArrayList.get(0) == 0) & (coef[1] % valueArrayList.get(1) == 0) & (coef[2] % valueArrayList.get(2) == 0)) {
                    System.out.println(coef[0]/valueArrayList.get(0) + " " + coef[1]/valueArrayList.get(1) + " " + coef[2]/valueArrayList.get(2));
                result = result + 1;
                }
            }
        }

        System.out.println(result);
    }
}
