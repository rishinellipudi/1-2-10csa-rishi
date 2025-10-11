import java.util.Scanner;
public class MadLibsStoryCreation {
    public static void main(String[] args) {
        // create scanner for user input
        Scanner input = new Scanner(System.in);

        // prompt for template
        System.out.println("enter your story template (use placeholders like [NOUN], [ADJECTIVE], [VERB]):");
        String storyTemplate = input.nextLine();

        // prompts for common word types
        System.out.print("enter a noun: ");
        String noun = input.nextLine();

        System.out.print("enter an adjective: ");
        String adjective = input.nextLine();

        System.out.print("enter a verb: ");
        String verb = input.nextLine();

        System.out.print("enter an adverb: ");
        String adverb = input.nextLine();

        System.out.print("enter a color: ");
        String color = input.nextLine();

        System.out.print("enter an animal: ");
        String animal = input.nextLine();

        System.out.print("enter a feeling: ");
        String feeling = input.nextLine();

        System.out.print("enter a name: ");
        String name = input.nextLine();

        // algorithm to replace placeholders with user inputs
        String finalStory = storyTemplate;
        finalStory = finalStory.replace("[NOUN]", noun);
        finalStory = finalStory.replace("[ADJECTIVE]", adjective);
        finalStory = finalStory.replace("[VERB]", verb);
        finalStory = finalStory.replace("[ADVERB]", adverb);
        finalStory = finalStory.replace("[COLOR]", color);
        finalStory = finalStory.replace("[ANIMAL]", animal);
        finalStory = finalStory.replace("[FEELING]", feeling);
        finalStory = finalStory.replace("[NAME]", name);

        // display the final story
        System.out.println("\nThe completed Mad Lib:");
        System.out.println(finalStory);

        // close the scanner
        input.close();
    }
}
