import java.util.Scanner;
import java.util.ArrayList;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        ArrayList<String> listOfWords = new ArrayList<String>();

        while (true) {
            String itemInput = scanner.nextLine();
            listOfWords.add(itemInput);
            if (itemInput.isBlank()) {
                System.out.println("The fifth item in the list is: " + listOfWords.get(4));
                break;
            }
        }
    }
}
