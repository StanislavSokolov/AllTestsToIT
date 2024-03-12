import java.util.ArrayList;
import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lastYears = in.nextInt();

        ArrayList<Wins> table = new ArrayList<>();

        for (int i = 0; i < lastYears; i++) {
            Wins wins = new Wins();
            for (int j = 0; j < 3; j++) {
                String name = in.next();
                wins.setWins(j, name);
            }
            table.add(wins);
        }

        int count = 1;

        int prevX = 0;
        int maxCoincidence = 0;

        boolean coincidenceB = false;

        ArrayList<Integer> coincidence = new ArrayList<>();

        System.out.println(table.get(0).getWins(1));

        for (int x = 0; x < lastYears - 1; x++) {
            coincidenceB = false;
            if (!coincidence.isEmpty()) {
                for (int q = 0; q < coincidence.size(); q++) {
                    if (x == coincidence.get(q)) {
                        coincidenceB = true;
                    }
                }
            }
            if (!coincidenceB) {
                for (int j = x; j < lastYears - 1; j++) {
                    for (int i = 0; i < 3; i++) {
                        if (table.get(x).getWins(0).equals(table.get(j + 1).getWins(i))) {
                            for (int a = 0; a < 3; a++) {
                                if (table.get(x).getWins(1).equals(table.get(j + 1).getWins(a))) {
                                    for (int b = 0; b < 3; b++) {
                                        if (table.get(x).getWins(2).equals(table.get(j + 1).getWins(b))) {
                                            if (prevX == x) {
                                                count = count + 1;
                                            } else {
                                                count = 2;
                                                prevX = x;
                                            }
                                            coincidence.add(j);

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if (count > maxCoincidence) maxCoincidence = count;

        }

        if (coincidence.isEmpty()) {
            maxCoincidence = 1;
        }
                System.out.println(maxCoincidence);


    }

    public static class Wins {

        public String getWins(int j) {
            return wins[j];
        }

        public void setWins(int j, String name) {
            this.wins[j] = name;
        }

        String[] wins = new String[3];
    }
}


