import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1, k, j;
        /*
         * while(i<=n){
         * for(int j=i;j<=n;j++){
         * for(int k=n-j;k<=n;k++){
         * System.out.print(" ");
         * }
         * System.out.print("#");
         * }
         * System.out.println();
         * i++;
         * }
         */
        while (i <= n) {

            for (k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (j = 0; j < n - k; j++) {

                System.out.print("#");
            }
            System.out.println();
            i++;
        }
    }
}
