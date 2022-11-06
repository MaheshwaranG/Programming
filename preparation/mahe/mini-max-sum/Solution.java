import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long arr[] = new long[5];
        for (int i = 0; i < 5; i++)
            arr[i] = in.nextInt();
        Arrays.sort(arr);
        System.out.print(arr[0] + arr[1] + arr[2] + arr[3]);
        System.out.print(" ");
        System.out.print(arr[4] + arr[1] + arr[2] + arr[3]);
    }
}
