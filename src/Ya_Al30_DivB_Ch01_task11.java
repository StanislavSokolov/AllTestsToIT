import java.util.*;
public class Ya_Al30_DivB_Ch01_task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (!exit) {
            String task = in.next();
            if (task.equals("exit")) exit = true; else {
                if (task.equals("push")) {
                    int data = in.nextInt();
                    arrayList.add(data);
                    System.out.println("ok");
                }
                if (task.equals("pop")) {
                    if (arrayList.isEmpty()) System.out.println("error"); else {
                        System.out.println(arrayList.get(arrayList.size() - 1));
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
                if (task.equals("back")) {
                    if (arrayList.isEmpty()) System.out.println("error"); else {
                        System.out.println(arrayList.get(arrayList.size() - 1));
                    }
                }
                if (task.equals("size")) {
                    if (arrayList.isEmpty()) System.out.println(0); else System.out.println(arrayList.size());
                }
                if (task.equals("clear")) {
                    arrayList = new ArrayList<>();
                    System.out.println("ok");
                }
            }
        }
        System.out.println("bye");

    }
}
