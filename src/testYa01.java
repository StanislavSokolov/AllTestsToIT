import java.util.ArrayList;
import java.util.Scanner;

public class testYa01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String alica = in.next();
        String zeliboba = in.next();
        StringBuilder result = new StringBuilder();
        result.append(zeliboba);
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < zeliboba.length(); i++) {
            if (zeliboba.charAt(i) == alica.charAt(i)) {
                result.setCharAt(i, 'P');
                arrayList.add(i);
            }
        }

        boolean b = false;
        boolean c = false;

        for (int i = 0; i < zeliboba.length(); i++) {
            if (zeliboba.charAt(i) != alica.charAt(i)) {
                c = false;
                for (int j = 0; j < alica.length(); j++) {
                    if (zeliboba.charAt(i) == alica.charAt(j)) {
                        if (!arrayList.isEmpty()) {
                            b = false;
                            for (int a : arrayList) {
                                if (a == j) {
                                    b = true;
                                }
                            }
                            if (!b) {
                                result.setCharAt(i, 'S');
                                arrayList.add(j);
                                c = true;
                            } else {
                                if (!c) {
                                    result.setCharAt(i, 'I');
                                }
                            }
                        }
                    } else {
                        if (!c) {
                            if (j == alica.length() - 1) result.setCharAt(i, 'I');
                        }
                    }
                }
            }
        }

        System.out.println(result);
    }
}
