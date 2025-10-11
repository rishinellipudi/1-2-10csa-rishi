import java.util.Scanner;
public class MadLibsProvidedStory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // original story with placeholders
        String story = "I went to the zoo to see a <noun>. There were people <verb> around the enclosure which made the <adjective> apes go bananas.";

        // get user input for each placeholder
        System.out.print("Enter a noun: ");
        String noun = input.nextLine();
        System.out.print("Enter a verb: ");
        String verb = input.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();

        // find and replace <noun> using indexOf and substring methods
        int nounPosition = story.indexOf("<noun>");
        story = story.substring(0, nounPosition) + noun + story.substring(nounPosition + 6);

        // find and replace <verb>
        int verbPosition = story.indexOf("<verb>");
        story = story.substring(0, verbPosition) + verb + story.substring(verbPosition + 6);

        // find and replace <adjective>
        int adjPosition = story.indexOf("<adjective>");
        story = story.substring(0, adjPosition) + adjective + story.substring(adjPosition + 11);

        // display completed mad lib
        System.out.println("\nHere is the completed MadLib: ");
        System.out.println(story);

        input.close();
    }
}
