import java.util.Scanner;

public class Ya_Al30_DivB_Ch01_task18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        int[] queue = new int[102];
        int left = 49;
        int right = 50;
        while (!exit) {
            String task = in.next();
            if (task.equals("exit")) exit = true;
            else {
                if (task.equals("push_front")) {
                    queue[left] = in.nextInt();
                    if (left == 0) left = 101; else left = left - 1;
                    System.out.println("ok");
                }
                if (task.equals("push_back")) {
                    queue[right] = in.nextInt();
                    if (right == 101) right = 0; else right = right + 1;
                    System.out.println("ok");
                }
                if (task.equals("pop_front")) {
                    if (right - left == 1 ) System.out.println("error");
                    else if (right > left) System.out.println(queue[left + 1]);
                    else if ((left > right) & (left == 101) & (right == 0)) System.out.println("error");
                    else if ((left > right) & (left == 101)) System.out.println(queue[0]);
                    else if (left > right) System.out.println(queue[left+1]);

                    if (left == 101) left = 0; else left = left + 1;
                }
                if (task.equals("pop_back")) {
                    if ((right - left == 1 )) System.out.println("error");
                    else if (right > left) System.out.println(queue[right - 1]);
                    else if ((left > right) & (left == 101) & (right == 0)) System.out.println("error");
                    else if ((left > right) & (right == 0)) System.out.println(queue[101]);
                    else if (left > right) System.out.println(queue[right-1]);

                    if (right == 0) right = 101; else right = right - 1;
                }
                if (task.equals("front")) {
                    if (right - left == 1 ) System.out.println("error");
                    else if (right > left) System.out.println(queue[left + 1]);
                    else if ((left > right) & (left == 101) & (right == 0)) System.out.println("error");
                    else if ((left > right) & (left == 101)) System.out.println(queue[0]);
                    else if (left > right) System.out.println(queue[left+1]);
                }
                if (task.equals("back")) {
                    if ((right - left == 1 )) System.out.println("error");
                    else if (right > left) System.out.println(queue[right - 1]);
                    else if ((left > right) & (left == 101) & (right == 0)) System.out.println("error");
                    else if ((left > right) & (right == 0)) System.out.println(queue[101]);
                    else if (left > right) System.out.println(queue[right-1]);
                }
                if (task.equals("size")) {
                    if (right - left == 1 ) System.out.println(0);
                    else if ((left > right) & (left == 101) & (right == 0)) System.out.println(0);
                    else if (right > left) System.out.println(right - left - 1);
                    else if (left > right) System.out.println(101 - left + right);
                }
                if (task.equals("clear")) {
                    left = 49;
                    right = 50;
                    System.out.println("ok");
                }
                if (task.equals("rl")) {
                    System.out.println("r = " + right + " l = " + left);
                }
            }
        }
        System.out.println("bye");
    }
}
