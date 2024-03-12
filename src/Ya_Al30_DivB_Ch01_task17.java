import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ya_Al30_DivB_Ch01_task17 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("main/input.txt"));
        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();

        int count = 0;
        boolean stop = false;

        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();


        String[] subStr1;
        String[] subStr2;
        String delimeter = " ";
        subStr1 = s1.split(delimeter);
        subStr2 = s2.split(delimeter);

        for (int i = 0; i < 5; i++) {
            first.add(Integer.parseInt(subStr1[i]));
            second.add(Integer.parseInt(subStr2[i]));
        }

        while (!stop) {
            if (count < 1000000) {
                if (first.isEmpty()) {
                    System.out.println("second " + count);
                    stop = true;
                }
                else if (second.isEmpty()) {
                    System.out.println("first " + count);
                    stop = true;
                }
                else {
                    int i1 = first.get(0);
                    int i2 = second.get(0);
                    if (i1 > i2) {
                        if (i2 != 0) {
                            first.remove(0);
                            second.remove(0);
                            first.add(i1);
                            first.add(i2);
                        } else {
                            if (i1 != 9) {
                                first.remove(0);
                                second.remove(0);
                                first.add(i1);
                                first.add(i2);
                            } else {
                                first.remove(0);
                                second.remove(0);
                                second.add(i1);
                                second.add(i2);
                            }
                        }
                    } else {
                        if (i1 != 0) {
                            first.remove(0);
                            second.remove(0);
                            second.add(i1);
                            second.add(i2);
                        } else {
                            if (i2 != 9) {
                                first.remove(0);
                                second.remove(0);
                                second.add(i1);
                                second.add(i2);
                            } else {
                                first.remove(0);
                                second.remove(0);
                                first.add(i1);
                                first.add(i2);
                            }
                        }
                    }
                }
            } else {
                stop = true;
                System.out.println("botva");
            }
            count++;
        }
    }
}
