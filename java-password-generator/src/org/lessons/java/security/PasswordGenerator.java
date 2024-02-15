package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = userInput.nextLine();

        System.out.println("Enter your surname: ");
        String surname = userInput.nextLine();

        System.out.println("Enter your favourite color: ");
        String color = userInput.nextLine();

        System.out.println("Enter your day of birth: ");
        byte birthDay = userInput.nextByte();

        System.out.println("Enter your month of birth: ");
        byte birthMonth = userInput.nextByte();

        System.out.println("Enter your year of birth: ");
        short birthYear = userInput.nextShort();

        String password = createPass(name, surname, color, birthDay, birthMonth, birthYear);
        System.out.println("Your password is: " + password);

        String password2 = createPass2(birthDay, birthMonth, birthYear, name, surname, color);
        System.out.println("Your password2 is: " + password2);
    }

    public static String createPass(String name, String surname, String color, byte birthDay, byte birthMonth, short birthYear) {
        return name + '-' + surname + '-' + color + '-' + (birthDay + birthMonth + birthYear);
    }

    public static String createPass2(byte birthDay, byte birthMonth, short birthYear, String ...args) {
        short sum = (short) (birthDay + birthMonth + birthYear);
        StringBuilder pass = new StringBuilder();

        for (String arg : args)
            pass.append(arg).append('-');

        pass.append(sum);
        return pass.toString();
    }
}