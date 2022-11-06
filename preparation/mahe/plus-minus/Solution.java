import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000000");
        int n = in.nextInt();
        int arr[] = new int[n];
        int cp = 0, cz = 0, cn = 0;
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
            if (arr[arr_i] == 0)
                cz += 1;
            else if (arr[arr_i] > 0)
                cp += 1;
            else
                cn += 1;
        }
        int l = arr.length;
        // double d=(float)2/6;
        // System.out.println(d);
        /*
         * System.out.println(df.format((float)cp/l));
         * System.out.println(df.format((float)cn/l));
         * System.out.println(df.format((float)cz/l));
         * Other options to do
         * System.out.println("double : " + String.format("%.2f", input));
         * System.out.format("double : %.2f", input);
         */
        System.out.printf("%.6f%n", ((float) cp / l));
        System.out.printf("%.6f%n", ((float) cn / l));
        System.out.printf("%.6f%n", ((float) cz / l));
    }
}
