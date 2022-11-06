import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String[] sp = time.split(":");
        /*
         * int h=Integer.parseInt(sp[0]);
         * if(h<12)
         * {
         * h+=12;
         * }
         */
        int l = sp.length;
        String t = sp[l - 1].substring(2, 4);
        String surfix = ":" + sp[1] + ":" + sp[2].substring(0, 2);
        if ("AM".equals(t)) {
            int h = Integer.parseInt(sp[0]);
            if (h == 12)
                System.out.print("00" + surfix);
            else
                System.out.print(sp[0] + surfix);
        } else {
            int h = Integer.parseInt(sp[0]);
            if (h != 12)
                h += 12;

            System.out.print(h + surfix);
        }

    }
}
