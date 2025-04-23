package problems.counting_crossed_valleys;

import java.util.Scanner;

public class CountingValleys {
    public static void main(String argv[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String steps = in.nextLine();
        System.out.println(countingValleys(steps));
    }

    public static int countingValleys(String steps) {
        int valleyCount = 0, stepBal = 0;
        // we can use index to get char from string by string.charAt(index)
        for (char ch : steps.toCharArray()) {
            if (ch == 'D' && stepBal == 0) {
                valleyCount++;
            }
            if (ch == 'U') {
                stepBal += 1;
            } else if (ch == 'D') {
                --stepBal;
            }
        }
        return valleyCount;
    }
}