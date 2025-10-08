// v1 code
import java.util.Scanner;

public class MadLibs {
    
    public static void main(String[] args) {
        
        // base sentence with placeholders
        String story = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
                                 
        // set up input scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("let's create a funny sentence about animals.");
        System.out.println("----------------------------------------------");

        // get user inputs for the three parts of speech
        
        System.out.print("enter a singular noun (e.g., 'shelter'): ");
        String noun = input.nextLine();

        System.out.print("enter a plural noun (e.g., 'dogs'): ");
        String pluralNoun = input.nextLine();
        
        System.out.print("enter a number (e.g., '42'): ");
        String number = input.nextLine();
        
        input.close();
        
        // replace the placeholders using method chaining
        String completedStory = story.replace("<noun>", noun)
                                     .replace("<plural_noun>", pluralNoun)
                                     .replace("<number>", number);
        
        // print the final sentence
        System.out.println("\n----------------------------------------------");
        System.out.println("your completed sentence is:");
        System.out.println(completedStory);
    }
}
