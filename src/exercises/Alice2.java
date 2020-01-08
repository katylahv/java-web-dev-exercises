package exercises;

import java.util.Scanner;

public class Alice2 {
    public Alice2(){
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
        int termIndex = excerpt.indexOf(term);
        String[] splitExcerpt = excerpt.toLowerCase().split(term);

        if ((excerpt.toLowerCase()).contains(term)) {
            System.out.println("your term was found! The index of your term is " +
                    termIndex +
                    " the length of your term is " + term.length() + ". \n\n" );
            System.out.println(splitExcerpt[0] + " \n TERM REMOVED \n" + splitExcerpt[1]);
        } else {
            System.out.println("your term was not found.");
        }
    }
}
