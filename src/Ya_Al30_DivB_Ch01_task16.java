import java.util.LinkedList;
import java.util.Scanner;

public class Ya_Al30_DivB_Ch01_task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        int count = 100;
        LinkedList<LinkedList> arrayList = new LinkedList<>();
        while (!exit) {
            String task = in.next();
            if (task.equals("exit")) exit = true; else {
                if (task.equals("push")) {
                    int data = in.nextInt();
                    if (!arrayList.isEmpty()) {
                        if (arrayList.get(arrayList.size() - 1).size() < count) {
                            arrayList.get(arrayList.size() - 1).add(data);
                        } else {
                            LinkedList<Integer> linkedList1 = new LinkedList();
                            linkedList1.add(data);
                            arrayList.add(linkedList1);
                        }
                    } else {
                        LinkedList<Integer> linkedList1 = new LinkedList<>();
                        linkedList1.add(data);
                        arrayList.add(linkedList1);
                    }
                    System.out.println("ok");
                }
                if (task.equals("pop")) {
                    if (arrayList.isEmpty()) System.out.println("error"); else {
                        System.out.println(arrayList.get(0).remove(0));
                        if (arrayList.get(0).isEmpty()) {
                            arrayList.remove(0);
                        }
                    }
                }
                if (task.equals("front")) {
                    if (arrayList.isEmpty()) System.out.println("error"); else {
                        System.out.println(arrayList.get(0).get(0));
                    }
                }
                if (task.equals("size")) {
                    if (arrayList.isEmpty()) System.out.println(0);
                    else if (arrayList.size() == 1) System.out.println(arrayList.get(0).size());
                    else if (arrayList.size() == 2) System.out.println(arrayList.get(0).size() + arrayList.get(arrayList.size()-1).size());
                    else System.out.println((arrayList.size()*(count - 2)) + arrayList.get(0).size() + arrayList.get(arrayList.size()-1).size());
                    }
                }
                if (task.equals("clear")) {
                    arrayList = new LinkedList<>();
                    System.out.println("ok");
                }
            }
        System.out.println("bye");
        }
}
