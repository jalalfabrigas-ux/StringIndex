import java.util.*;

public class StringIndex{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the phrase: ");
        String phrase = scanner.nextLine();

        System.out.print("Enter the keyword: ");
        String keyword = scanner.nextLine();

        int index = phrase.indexOf(keyword);

        if (index != -1) {
            System.out.println("\n" + keyword + " is found!");
            System.out.println("Location: is at index " + index + ".");
        } else {
            System.out.println("\n" + keyword + " is not found.");
        }

        scanner.close();
    }
}