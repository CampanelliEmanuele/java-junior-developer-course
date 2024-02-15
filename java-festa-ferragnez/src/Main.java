import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int length = 5;
        String[] guests = new String[length];

        guests[0] = "Tizio Caio 0";
        guests[1] = "Tizio Caio 1";
        guests[2] = "Tizio Caio 2";
        guests[3] = "Tizio Caio 3";
        guests[4] = "Tizio Caio 4";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pathetic name: ");
        String userName = scanner.nextLine();

        if (isIn(userName, guests))
            System.out.println("Well " + userName + ", you can go.");
        else
            System.out.println("Well " + userName + ", you can go home.");

    }

    public static boolean isIn(String element, String[] array) {
        for (String s : array)
            if (s.equals(element))
                return true;
        return false;
    }
}