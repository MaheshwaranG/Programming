package dsa.recursion.factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to find factorial :");
        int num = Integer.parseInt(in.nextLine());
        System.out.println("Factorial of " + num + " is : " + factorial(num));
        Factorial fact = new Factorial();
        System.out.println("Sum of " + num + " is : " + fact.sum(num));
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public int sum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sum(num - 1);
    }
}