import java.util.ArrayList;
import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int days = in.nextInt();

        int count = 0;

        int sum = 0;

        int current = 0;

        int max = 0;

        int maxId = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < days; i++) {
            current = in.nextInt();
            if (count == 0) {
                sum = sum + current;
                count = 1;
            } else {
                sum = sum - current;
                count = 0;
            }
            arrayList.add(current);
        }

        for (int j = 0; j < arrayList.size(); j++) {
            if (max < arrayList.get(j)) {
                max = arrayList.get(j);
                maxId = j;
            }
        }




        System.out.println(sum);
    }
}
