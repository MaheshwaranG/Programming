import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    static int max = 0;

    public static void validateAlt(char s[], String set) {
        int pointer = -1;
        int size = 0;
        String val = "";
        for (int i = 0; i < s.length; i++) {
            if (set.indexOf(s[i]) == -1) {
                if (pointer < 0) {
                    size += 1;
                    pointer = i;
                    val += Character.toString(s[i]);
                } else if (pointer >= 0 && s[pointer] == s[i]) {
                    return;
                } else if (s[pointer] != s[i]) {
                    size += 1;
                    pointer = i;
                    val += Character.toString(s[i]);

                }
            }
        }

        if (size < 2) {
            size = 0;
        }
        if (size > max) {
            max = size;
        }
    }

    public static int dynamicSubset(char[] s, char[] a, int n, int size, int index, char set[], int i) {
        if (size == index) {
            validateAlt(s, new String(set));
            return 0;
        }
        if (i >= n) {
            return 0;
        }
        set[index] = a[i];
        dynamicSubset(s, a, n, size, index + 1, set, i + 1);
        dynamicSubset(s, a, n, size, index, set, i + 1);
        return 0;
    }

    /*
     * Complete the 'alternate' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternate(String s) {
        // Write your code here
        String unique = "";
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            if (!unique.contains(c)) {
                unique += c;
            }
        }
        if(unique.length() == 1) {
            return 0;
        }
        char[] charSet = unique.toCharArray();

        dynamicSubset(s.toCharArray(), charSet, charSet.length, charSet.length - 2, 0, new char[charSet.length - 2], 0);

        return max;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = Result.alternate(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
