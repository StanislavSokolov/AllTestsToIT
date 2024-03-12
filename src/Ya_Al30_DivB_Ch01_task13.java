import java.util.ArrayList;
import java.util.Scanner;

public class Ya_Al30_DivB_Ch01_task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        String s = in.nextLine();
        String[] subStr;
        String delimeter = " ";
        subStr = s.split(delimeter);

        for (int i = 0; i < subStr.length; i++) {
            if (!subStr[i].equals("+") & !subStr[i].equals("-") & !subStr[i].equals("*")) arrayList.add(Integer.parseInt(subStr[i]));
            else if (subStr[i].equals("+")) {
                int value = arrayList.get(arrayList.size() - 2) + arrayList.get(arrayList.size() - 1);
                arrayList.remove(arrayList.size() - 1);
                arrayList.remove(arrayList.size() - 1);
                arrayList.add(value);
            }
            else if (subStr[i].equals("-")) {
                int value = arrayList.get(arrayList.size() - 2) - arrayList.get(arrayList.size() - 1);
                arrayList.remove(arrayList.size() - 1);
                arrayList.remove(arrayList.size() - 1);
                arrayList.add(value);
            }
            else if (subStr[i].equals("*")) {
                int value = arrayList.get(arrayList.size() - 2) * arrayList.get(arrayList.size() - 1);
                arrayList.remove(arrayList.size() - 1);
                arrayList.remove(arrayList.size() - 1);
                arrayList.add(value);
            }
        }
        if (!arrayList.isEmpty()) System.out.print(arrayList.get(0));
    }
}
