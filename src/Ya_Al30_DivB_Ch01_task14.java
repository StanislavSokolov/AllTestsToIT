import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ya_Al30_DivB_Ch01_task14 {
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

        ArrayList<Integer> arrayList = new ArrayList();

        int number = 1;

        while ((count != 0) || (!arrayList.isEmpty())) {
            if (arrayList.isEmpty() & (count != 0)) {
                arrayList.add(Integer.parseInt(t[t.length - count]));
                count = count - 1;
            } else {
                if (arrayList.get(arrayList.size() - 1) == number) {
                    arrayList.remove(arrayList.size() - 1);
                    number++;
                } else {
                    if (count != 0) {
                        arrayList.add(Integer.parseInt(t[t.length - count]));
                        count = count - 1;
                    } else {
                        break;
                    }
                }
            }
        }
        if ((count == 0) & (arrayList.isEmpty())) System.out.println("YES");
        else System.out.println("NO");
    }
}
