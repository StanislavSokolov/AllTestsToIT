import java.util.*;

public class test01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int firstTeamX1 = in.nextInt();
        int firstTeamY1 = in.nextInt();
        int firstTeamX2 = in.nextInt();
        int firstTeamY2 = in.nextInt();

        int secondTeamX1 = in.nextInt();
        int secondTeamY1 = in.nextInt();
        int secondTeamX2 = in.nextInt();
        int secondTeamY2 = in.nextInt();

        int teamX1 = 0;
        int teamY1 = 0;
        int teamX2 = 0;
        int teamY2 = 0;

        int teamX = 0;
        int teamY = 0;

        if (firstTeamX1 < secondTeamX1) teamX1 = firstTeamX1; else teamX1 = secondTeamX1;
        if (firstTeamY1 < secondTeamY1) teamY1 = firstTeamY1; else teamY1 = secondTeamY1;

        if (firstTeamX2 > secondTeamX2) teamX2 = firstTeamX2; else teamX2 = secondTeamX2;
        if (firstTeamY2 > secondTeamY2) teamY2 = firstTeamY2; else teamY2 = secondTeamY2;

        teamX = teamX2- teamX1;
        teamY = teamY2 - teamY1;

        if (teamX < teamY) System.out.println(teamY*teamY); else System.out.println(teamX*teamX);

//int[] arr = new int[]{22, 2, 0};
    }
}
