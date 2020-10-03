import java.util.Scanner;

public class BST {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter noof elements : ");
        Integer n = in.nextInt();
        int list[] = new int[n];
        System.out.println("Elements of list ");
        for (int i = 0; i < n; i++) {
            list[i] = in.nextInt();
        }
        // Binary search list should be sorted, Time complexity O(log n)
        System.out.println("Enter Search Element : ");
        int element = in.nextInt();
        // int index = bstMethod2(element, list) + 1;
        int index = bstRecursion(element, list, 0, list.length - 1) + 1;
        System.out.println("Element found at : " + index);
    }

    static public int bstMethod1(int element, int[] list) {
        int first = 0, last = list.length, mid = (int) Math.ceil(last / 2);
        while (first <= last) {
            if (list[mid] == element) {
                return mid;
            }
            if (list[mid] > element) {
                last = mid;
                mid = (int) Math.ceil(last / 2);
            } else {
                first = mid;
                mid = first + (int) Math.ceil((last - first) / 2);
            }
        }
        return -2;
    }

    static public int bstMethod2(int element, int[] list) {
        int first = 0, last = list.length - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (list[mid] == element) {
                return mid;
            }
            if (list[mid] < element) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -2;
    }

    static public int bstRecursion(int element, int[] list, int first, int last) {
        int mid = first + (last - first) / 2;
        if (first <= last) {
            if (list[mid] == element) {
                return mid;
            }
            if (list[mid] < element) {
                return bstRecursion(element, list, mid + 1, last);
            } else {
                return bstRecursion(element, list, first, mid - 1);
            }
        }
        return -2;
    }
}