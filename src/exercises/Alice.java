package exercises;

import java.util.Scanner;

public class Alice {
    public Alice(){
    }
    public static void main(String[] args) {
        String excerpt = "Alice was beginning to get very tired " +
                "of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice " +
                "she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("What term would you like to search for?");
        String term = input.nextLine().toLowerCase();
        if ((excerpt.toLowerCase()).contains(term)) {
            System.out.println("your term was found!");
        } else {
            System.out.println("your term was not found.");
        }
    }
}
