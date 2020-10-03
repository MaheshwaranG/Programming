import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListTest {
    public static void main(String args[]) {
        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(0, 100); // if index iss greated than size then it throws indexoutofbound exception,
                             // always ensure that index is valid
        listInt.add(12);
        listInt.add(12);
        listInt.add(14);
        listInt.add(2);
        listInt.add(12);
        listInt.add(12);
        listInt.add(8);
        listInt.add(7);
        listInt.remove((Integer) 12);
        System.out.println("Size : " + listInt.size());
        listInt.ensureCapacity(5);
        listInt.replaceAll((a) -> a + 10);
        System.out.println("Elements : " + listInt.toString());
        // listInt.sort((a, b) -> a - b);
        listInt.sort(Comparator.reverseOrder());
        listInt.add(2, 45121);
        listInt.sort(Comparator.comparingInt(Integer::intValue).reversed());
        listInt.removeIf((a) -> Math.round(a % 5) == 0 ? true : false);
        System.out.println("Elements 1 : " + listInt.toString());
        listString();

    }

    static void listString() {
        ArrayList<String> listStr = new ArrayList<>();
        listStr.add("z");
        listStr.add("s");
        listStr.add("i");
        listStr.add("x");
        listStr.add("S");
        listStr.add("a");
        listStr.add("y");

        listStr.sort(Comparator.comparing(String::toString));
        System.out.println("String Sort : " + listStr.toString());
        listStr.sort(Comparator.naturalOrder());
        System.out.println("String Nature order Sort : " + listStr.toString());
        listStr.sort(Comparator.reverseOrder());
        System.out.println("String reverseOrder Sort : " + listStr.toString());

    }
}