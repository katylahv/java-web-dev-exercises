package exercises;

import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static int evenSum (ArrayList<Integer> practice){
        int sum = 0;
        for (int num : practice){
            if (num % 2 == 0){
                sum += num;
            }
        } return sum;
    }
    public static void searchLetters (ArrayList<String> words){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word length to search for");
            int searchLength = input.nextInt();
            ArrayList<String> wordList = new ArrayList<>();
        for (String word : words){
            if (word.length() == searchLength){
                wordList.add(word);
            } // end if
        } // end for
        // turn wordList array into string
        String convert = wordList.toString();
        String convertFinal = convert.substring(1,convert.length() -1);
        System.out.println("words in the list with the length " + searchLength + " are: " + convertFinal);
    }

    public static void main(String[] args) {
        ArrayList<Integer> practice = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        ArrayList<String> words = new ArrayList<>(List.of("made", "crude", "real", "wheat", "katie"));
        // print even nums
        int sum = ArrayListPractice.evenSum(practice);
        System.out.println(sum);
        // print five letters from search
        ArrayListPractice.searchLetters(words);

    }
}
