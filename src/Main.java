import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Would you like the game to start (reply with 'y' for yes or any other letter for no -- not case sensitive): ");
        char wantGameStart = sc.next().charAt(0);
        wantGameStart = Character.toLowerCase(wantGameStart);

        boolean gameStart = false;

        if (wantGameStart == 'y') {
            gameStart = true;
        } else {
            System.exit(0);
        }

        if (gameStart) {
            System.out.println("Enter a year: ");
            int year = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter a holiday: ");
            String holiday = sc.nextLine();

            System.out.println("Enter a noun: ");
            String noun = sc.nextLine();

            System.out.println("Enter a place: ");
            String place = sc.nextLine();

            System.out.println("Enter a famous person: ");
            String famousPerson = sc.nextLine();

            System.out.println("Enter an adjective: ");
            String adjective = sc.nextLine();

            System.out.println("Enter a number greater than 1 (can be a decimal): ");
            double num = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter a plural body part: ");
            String bodyPart = sc.nextLine();

            System.out.println("Enter a verb: ");
            String verb = sc.nextLine();

            System.out.println("Enter another adjective: ");
            String adjective2 = sc.nextLine();

            System.out.println("Enter another noun: ");
            String noun2 = sc.nextLine();

            System.out.println("Enter a food: ");
            String foodItem = sc.nextLine();

            System.out.println("I can't believe it's already " + holiday + " in " + year + "!");
            System.out.println("I can't wait to put on my " + noun + " and visit every " + place + " in my neighbourhood.");
            System.out.println("This year, I'm going to dress up as (a) " + famousPerson + " with " + adjective + " " + num + " " + bodyPart);
            System.out.println("Before I " + verb + ", I make sure to grab my " + adjective2 + " " + noun2 + " to hold all of my " + foodItem);
        }
    }
}
