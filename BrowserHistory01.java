package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();
        String navigation = sc.nextLine();
        String currentUrl = "";

        while (!navigation.equals("Home")) {

            if (navigation.equals("back")) {
                if (!history.isEmpty()) {
                    currentUrl = history.pop();
                } else {
                    System.out.println("no previous URLs");
                    navigation = sc.nextLine();
                    continue;
                }
            } else {

                if (!currentUrl.isEmpty()) {
                    history.push(currentUrl);
                }
                currentUrl = navigation;
            }

            System.out.println(currentUrl);
            navigation = sc.nextLine();
        }


    }
}
