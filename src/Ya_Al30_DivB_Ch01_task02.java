import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//заваливается на тесте 8 по времени > 1сек

public class Ya_Al30_DivB_Ch01_task02 {
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

        int[] create = new int[task.length()];
        for (int i = 0; i < create.length; i++) {
            create[i] = task.charAt(i);
        }
        int size = create.length;

        int ansF = 1;
        for (int i = 0; i < size; i++) {
            int ans = 1;
            int count1 = count;
            for (int j = i+1; j < size; j++) {
                    if (count1 != 0) {
                        if (create[i] != create[j]) {
                            count1 = count1 - 1;
                            ans = ans + 1;
                        } else {
                            ans = ans + 1;
                        }
                    } else {
                        if (create[i] == create[j]) {
                            ans = ans + 1;
                        } else {
                            j = size;
                        }
                    }
            }
            if (ansF < ans) ansF = ans;
        }
        for (int i = size - 1; i > -1; i--) {
            int ans = 1;
            int count1 = count;
            for (int j = i-1; j > - 1; j--) {
                    if (count1 != 0) {
                        if (create[i] != create[j]) {
                            count1 = count1 - 1;
                            ans = ans + 1;
                        } else {
                            ans = ans + 1;
                        }
                    } else {
                        if (create[i] == create[j]) {
                            ans = ans + 1;
                        } else {
                            j = - 1;
                        }
                    }
            }
            if (ansF < ans) ansF = ans;
        }
        System.out.println(ansF);
    }
}
