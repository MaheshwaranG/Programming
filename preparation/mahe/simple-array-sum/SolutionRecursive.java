import java.util.*;
import java.util.stream.*;
import java.io.*;
import static java.util.stream.Collectors.toList;

public class SolutionRecursive {

    public static int recursive(List<Integer> ar, int index, int sum) {
        if (index >= ar.size()) {
            return sum;
        }
        return recursive(ar, index + 1, sum + ar.get(index));
    }

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
            return recursive(ar, 0, 0);
        }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
