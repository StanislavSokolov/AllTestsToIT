import java.util.ArrayList;
import java.util.Scanner;

public class Ya_Al30_DivB_Ch01_task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Character> arrayList = new ArrayList<>();
        String task = in.next();

        for (int i = 0; i < task.length(); i++) {
            char ch = task.charAt(i);
            if ((arrayList.isEmpty()) & ((ch == '}') || (ch == ')') || (ch == ']'))) {
                arrayList.add(ch);
                break;
            } else if ((!arrayList.isEmpty()) & (ch == '}')) {
                if (arrayList.get(arrayList.size() - 1).equals('{')) arrayList.remove(arrayList.size() - 1); else break;
            } else if ((!arrayList.isEmpty()) & (ch == ')')) {
                if (arrayList.get(arrayList.size() - 1).equals('(')) arrayList.remove(arrayList.size() - 1); else break;
            } else if ((!arrayList.isEmpty()) & (ch == ']')) {
                if (arrayList.get(arrayList.size() - 1).equals('[')) arrayList.remove(arrayList.size() - 1); else break;
            } else {
                arrayList.add(ch);;
            }
        }


        if (arrayList.isEmpty()) System.out.println("yes"); else System.out.println("no");
    }
}
