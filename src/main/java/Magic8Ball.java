import java.util.Random;
import java.util.Scanner;

/*
 * Create a Magic 8-ball program that gives custom responses to yes or no questions
 * To get a response from the user, use the getUserQuestion() method at the bottom of this file
 */
public class Magic8Ball {
    // 1. Make a main method that includes all the steps below
    public static void main(String[] args) {
        // 2. Ask the user to enter a question for the magic 8-ball
        System.out.println("Ask the Magic 8 Ball a yes or no question: ");

        // 3. Call the getUserQuestion() method to get a question from the user
        String userQuestion = getUserQuestion();

        // 4. Make a variable and initialize it to a random number
        // Generate random number between 0 and 3
        int randomNumber = new Random().nextInt(4);

        // 5. If the random number is 0
        if (randomNumber == 0) {
            // Tell the user "Yes"
            System.out.println("Yes");
        }

        // 6. If the random number is 1
        if (randomNumber == 1) {
            // Tell the user "No"
            System.out.println("No");
        }

        // 7. If the random number is 2
        if (randomNumber == 2) {
            // Tell the user a custom response
            System.out.println("Ask again later");
        }

        // 8. If the random number is 3
        if (randomNumber == 3) {
            // Tell the user a custom response
            System.out.println("Definitely maybe");
        }
    }
    /**
     * @return The user's response as a String
     */
    public static String getUserQuestion(){
        // Create a scanner
        Scanner userInput = new Scanner(System.in);
        // Prompts user to ask a yes or no question
        System.out.println("Enter your question ");
        // Read the question from user as String and return it
        return userInput.nextLine();
    }
}



