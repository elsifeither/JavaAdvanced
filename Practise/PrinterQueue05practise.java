package StacksAndQueuesPractise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue05practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        ArrayDeque<String> files = new ArrayDeque<>();

        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                if (files.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.printf("Canceled %s%n",files.pop());
                    input = sc.nextLine();
                    continue;
                }
            } else {
                files.offer(input);
            }

            input = sc.nextLine();
        }


        while (!files.isEmpty()) {
            System.out.println(files.poll());
        }

    }
}
