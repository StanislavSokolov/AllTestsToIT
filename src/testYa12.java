import java.util.ArrayList;
import java.util.Scanner;

public class testYa12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < count*5; i++) {
            stringArrayList.add(in.next());
        }
        ArrayList<String[]> strings = new ArrayList<>();
        String[] words = new String[5];
        int counter = 0;
        for (int i = 0; i < count*5; i++) {
            words[counter] = stringArrayList.get(i);
            if (counter == 4) {
                strings.add(words);
                counter = 0;
            } else counter++;
        }
        ArrayList<String> rockets = new ArrayList<>();
        rockets.add(strings.get(0)[3]);


        for (int i = 0; i < strings.size(); i++) {
            boolean b = false;
            for (String s: rockets) {
                if (strings.get(i)[3].equals(s)) b = true;

            }

        }

//        rockets.add(strings.get(0));
//        for (String[] s: strings) {
//            boolean b = false;
//            for (int i = 0; i < rockets.size(); i++) {
//                if (s[3].equals(rockets.get(i)[3])) {
//                    b = true;
//                }
//                if (!b) rockets.add(s);
//            }
//        }
//
//        System.out.println(rockets.size());
//        System.out.println(rockets.get(0)[3]);
    }
}
