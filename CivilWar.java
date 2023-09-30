import java.util.Scanner;

public class CivilWar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];

        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }

        long ironmanPower = 0, captainPower = 0;
        int ironmanIndex = 0, captainIndex = N - 1;
        boolean ironmanTurn = true;

        while (ironmanIndex <= captainIndex) {
            if (ironmanTurn) {
                // Ironman's turn
                if (P[ironmanIndex] >= 0) {
                    ironmanPower += P[ironmanIndex];
                    ironmanIndex++;
                } else {
                    // Spurious avenger, skip to the next
                    ironmanIndex++;
                }
            } else {
                // Captain America's turn
                if (P[captainIndex] >= 0) {
                    captainPower += P[captainIndex];
                    captainIndex--;
                } else {
                    // Spurious avenger, skip to the next
                    captainIndex--;
                }
            }

            // Switch turns
            ironmanTurn = !ironmanTurn;
        }

        // Calculate the difference in powers
        long difference = ironmanPower - captainPower;
        System.out.println(difference);
    }
}
