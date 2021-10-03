import java.util.Locale;
import java.util.Scanner;

public class WhileLoopDebugging {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);

        String userInput = " ";

        System.out.println("Enter characters to echo in caps: ");
        userInput = keyboard.nextLine();

        while (userInput.length() > 0){
            System.out.println(userInput.toUpperCase());
            userInput = keyboard.nextLine();
        }
    }
}
