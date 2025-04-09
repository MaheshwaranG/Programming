import java.util.Scanner;

public class PrintNumbers {
    public static void main(String args[]) {
        System.out.println("Enter number of elements: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        PrintNumbers pn = new PrintNumbers();
        pn.reversePrint(num);
        System.out.println();
        pn.print(num);
    }

    void reversePrint(int num) {
        if (num == 0) {
            return;
        }
        reversePrint(num - 1);
        System.out.print(num + " ");
    }

    void print(int num) {
        if (num == 0) {
            return;
        }
        System.out.print(num + " ");
        reversePrint(num - 1);
    }
}