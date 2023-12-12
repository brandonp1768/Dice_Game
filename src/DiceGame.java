import java.util.Scanner; // importing to get input from the user

public class DiceGame {
    /**
     * @param args allows us to pass arguments through the main function
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] first_values = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] second_values = new int[] {00, 10, 20, 30, 40, 60, 70, 80, 90};
        Die first_die = new Die(20, "Red", "Blue", "Gold", first_values);
        Die second_die = new Die(10, "Green", "Yellow", "Silver",
                second_values);
        System.out.println("Attributes Of First Die:");
        displayAttributes(first_die);
        System.out.println("Attribute Of Second Die:");
        displayAttributes(second_die);
        System.out.print("Would You Like To Play A Game? ");
        String user_answer = input.next();
        while (user_answer.equalsIgnoreCase("yes")) {
            System.out.print("Which Die Do You Think Will Win? (1 For First Die Or 2 For Second Die) ");
            int user_guess = input.nextInt();
            input.nextLine(); // removing the new line character
            int die1_roll = 0;
            int die2_roll = 0;
            while (die1_roll != 10 && die2_roll != 10) { // ask about the difference between |, ||, &, and &&
                die1_roll = first_die.roll();
                System.out.println("Die 1 Value: " + die1_roll);
                die2_roll = second_die.roll();
                System.out.println("Die 2 Value: "  + die2_roll);
            }
            if (die1_roll == 10) {
                System.out.println("Die #1 Rolled 10 First!");
                if (user_guess == 1) {
                    System.out.println("You Won The Game!");
                }
                else {
                    System.out.println("You Lost The Game :(");
                }
            }
            else {
                System.out.println("Die #2 Won The Game!");
                if (user_guess == 2) {
                    System.out.println("You Won The Game!");
                }
                else {
                    System.out.println("You Lost The Game :(");
                }
            }
            System.out.print("Would You Like To Play Again? ");
            user_answer = input.next();
        }
        System.out.print("Goodbye!");
    }

    /**
     * @param die the die object that we will be displaying all the attributes of
     * @purpose displays all the attributes of each die that is entered
     */
    public static void displayAttributes(Die die) {
        int num_sides = die.getNumSides();
        String primary_color = die.getPrimaryColor();
        String secondary_color = die.getSecondaryColor();
        String num_color = die.getNumColor();
        int[] side_values = die.getSideValues();
        System.out.println("Number of Sides: " + num_sides);
        System.out.println("Primary Color Of Die: " + primary_color);
        System.out.println("Secondary Color Of Die: " + secondary_color);
        System.out.println("Number Colors Of Die: " + num_color);
        System.out.print("Side Values: ");
        for (int counter = 0; counter < side_values.length; counter++) {
            if (side_values.length - 1 == counter) {
                System.out.println(side_values[counter]);
            }
            else {
                System.out.print(side_values[counter] + ", ");
            }
        }
        System.out.println(); // creating a space between each of the die and their attributes
    }
}


