import java.util.Scanner;
import java.util.ArrayList;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();

        while (true) {
            int itemInput = scanner.nextInt();
            listOfIntegers.add(itemInput);
            if (itemInput == 0) {
                int lastItem = listOfIntegers.get(listOfIntegers.size() - 2);
                for (int i = 0; i < listOfIntegers.size() - 2; i++){
                    System.out.print(listOfIntegers.get(i) + ", ");}

                System.out.print("and " + lastItem + " were the items in the list. The sum of that list is: ");
                System.out.println("\n" + sum(listOfIntegers));
                break;
            }
        }
    }

    public static int sum(ArrayList<Integer> list){
        int sum = 0;
        for(int i : list)
            sum = sum + i;
        return sum;
    }
}