import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String currentUrl = "";
        ArrayDeque<String> history = new ArrayDeque<>();

        while (!input.equals("Home")) {

            if (input.equals("back")) {

                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                    input = sc.nextLine();
                    continue;
                } else {
                    currentUrl = history.pop();
                }
            } else {
                if (!currentUrl.isEmpty()) {
                    history.push(currentUrl);
                }
                currentUrl = input;
            }

            System.out.println(currentUrl);
            input = sc.nextLine();
        }
        
        
    }
}