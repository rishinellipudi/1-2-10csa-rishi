import java.util.Scanner;

public class MadLibsProvidedStory {
    public static void main(String[] args) {
        // create scanner object for user input
        Scanner input = new Scanner(System.in);

        // variable containing the incomplete Mad Lib
        String story = "I went to the zoo to see a <noun>. There were people <verb> around the enclosure which made the <adjective> apes go bananas.";

        // prompts to keep the user on track
        System.out.println("Welcome to Mad Libs. please provide the following words:");
        System.out.print("enter a noun: ");
        String noun = input.nextLine();

        System.out.print("enter a verb: ");
        String verb = input.nextLine();

        System.out.print("enter an adjective: ");
        String adjective = input.nextLine();

        // algorithm to replace placeholders with user input using String methods
        story = story.replace("<noun>", noun);
        story = story.replace("<verb>", verb);
        story = story.replace("<adjective>", adjective);

        // final print statement to display the completed Mad Lib
        System.out.println("\nHere is your completed Mad Lib:");
        System.out.println(story);

        // close the scanner
        input.close();
    }
}
