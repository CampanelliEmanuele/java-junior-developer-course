import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> presents = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;

        while (!stop) {
            // Get the present
            System.out.println("Enter a present to add to the list: ");
            String newPresent = scanner.nextLine();

            if (!presents.contains(newPresent)) {
                presents.add(newPresent);
                System.out.println("Successfully added to de list.");
            }
            else
                System.out.println("Added failed: the present is already on the list.");

            // Asks to continue
            System.out.println("Type x to enter another gift or any other key to end.");
            String answer = scanner.nextLine();

            if (!Objects.equals(answer, "x"))
                stop = true;
        }

        // Printing the list
        System.out.println("There is you presents list:");
        for (String present : presents)
            System.out.println(present);

    }
}