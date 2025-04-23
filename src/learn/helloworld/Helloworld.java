package learn.helloworld;

import java.util.Scanner;

public class Helloworld {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name :");
        String user = in.nextLine();
        System.out.println("Hello world by " + user);
    }
}