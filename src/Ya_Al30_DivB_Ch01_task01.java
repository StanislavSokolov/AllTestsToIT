import java.io.*;
import java.util.ArrayList;

public class Ya_Al30_DivB_Ch01_task01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
        String s1 = null;
        String task = "";

        while ((s1 = bufferedReader.readLine()) != null) {
            task = task + s1;
        }

        ArrayList<Simbol> simbols = new ArrayList<>();

        for (int i = 0; i < task.length(); i++) {
            if (task.charAt(i) != ' ') {
                if (simbols.isEmpty()) {
                    simbols.add(new Simbol(task.charAt(i)));
                } else {
                    boolean coincidence = false;
                    for (Simbol s: simbols) {
                        if (s.getaChar() == task.charAt(i)) {
                            s.setCount(s.getCount() + 1);
                            coincidence = true;
                        }
                    }
                    if (!coincidence) simbols.add(new Simbol(task.charAt(i)));
                }
            }
        }

        if (!simbols.isEmpty()) {
            simbols.sort((o1, o2) -> o2.count - o1.count);
            int size = simbols.get(0).count;
            simbols.sort((o1, o2) -> o1.aChar - o2.aChar);


            for (int i = size; i > 0; i--) {
                for (Simbol s: simbols) {
                    if (s.count >= i) System.out.print("#"); else System.out.print(" ");
                }
                System.out.print('\n');
            }

            for (int i = 0; i < simbols.size(); i++) {
                System.out.print(simbols.get(i).aChar);
            }
        }

    }
    static class Simbol {
        char aChar;
        int count;

        public Simbol(char aChar) {
            this.aChar = aChar;
            this.count = 1;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public char getaChar() {
            return aChar;
        }

        public int getCount() {
            return count;
        }
    }
}



