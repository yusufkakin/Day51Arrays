import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();

        while (true) {
            int itemInput = scanner.nextInt();
            listOfIntegers.add(itemInput);
            if (itemInput == 0) {
                System.out.println("Done entering integers into the list");
                System.out.println("What number are you looking for in the list?");
                int indexInput = scanner.nextInt();
                System.out.println(indexInput+ " is at index " + listOfIntegers.indexOf(indexInput));
                System.out.println(indexInput+ " is at index " + listOfIntegers.lastIndexOf(indexInput));
                break;
            }
        }
    }
}
