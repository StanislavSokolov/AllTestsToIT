import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ya_Al30_DivB_Ch01_task15 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("main/input.txt"));
        String s1 = null;
        int count = 0;
        String task = "";

        int line = 0;

        while ((s1 = bufferedReader.readLine()) != null) {
            if (line == 0) {
                count = Integer.parseInt(s1);
                line = 1;
            } else {
                task = s1;
            }
        }

        String[] t = new String[count];
        String delimeter = " ";
        t = task.split(delimeter);

        int[] cities = new int[t.length];
        int[] finish = new int[t.length];
        for (int i = 0; i < t.length; i++) cities[i] = Integer.parseInt(t[i]);

        ArrayList<Integer> arrayList = new ArrayList<>();
        int q = 0;
        while (count != 0) {
            if (arrayList.isEmpty()) {
                arrayList.add(cities[count - 1]);
                count--;
                finish[finish.length - 1] = -1;
            } else {
                if (cities[count - 1] > arrayList.get(arrayList.size() - 1 - q)) {
                    finish[count - 1] = count + q;
                    arrayList.add(cities[count - 1]);
                    count--;
                    q = 0;
                } else {
                    if (q < arrayList.size() - 1) {
                        q++;
                    } else {
                        arrayList.add(cities[count - 1]);
                        finish[count - 1] = -1;
                        q = 0;
                        count--;
                    }
                }
            }
        }

//        for (int i = 0; i < cities.length; i++) {
//            for (int j = i; j < cities.length; j++) {
//                if (cities[i] > cities[j]) {
//                    System.out.print(j + " ");
//                    j = cities.length;
//                }
//                else {
//                    if (j == cities.length - 1) System.out.print(-1 + " ");
//                }
//            }
//        }

        for (int i = 0; i < finish.length; i++) System.out.print(finish[i] + " ");
    }
}
