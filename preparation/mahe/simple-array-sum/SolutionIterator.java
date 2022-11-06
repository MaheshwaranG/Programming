import java.util.*;
import java.util.stream.*;
import java.io.*;
import static java.util.stream.Collectors.toList;

public class SolutionIterator {
    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;
        Iterator<Integer> items = ar.iterator();
        while(items.hasNext()) {
            sum += items.next();
        }
        return sum;
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
