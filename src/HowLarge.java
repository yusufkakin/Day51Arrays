import java.util.Scanner;
import java.util.ArrayList;

public class HowLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        ArrayList<String> listOfWords = new ArrayList<String>();

        while (true) {
            String itemInput = scanner.nextLine();
            listOfWords.add(itemInput);
            int arrayCount = listOfWords.size() - 1;
            if (itemInput.isBlank()) {
                System.out.println("The total amount of items in the list was: " + arrayCount);
                break;
            }
        }
    }
}
