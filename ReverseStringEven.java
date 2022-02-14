/*Given a string containing a number of words. If the count of words in string is even then reverse its even position’s
 words else reverse its odd position, push reversed words at the starting of a new string and append the remaining words as it is in order.
* */
/*
* Input:  Ashish Yadav Abhishek Rajput Sunil Pundir
Output: ridnuP tupjaR vadaY Ashish Abhishek Sunil

Input:  Ashish Yadav Abhishek Rajput Sunil Pundir Prem
Output: merP linuS kehsihbA hsihsA Yadav Rajput Pundir*/

import java.util.Scanner;

public class ReverseStringEven {
    public static void main(String[] args){
// receive a sentence, -i/p
        //count the words in the sentence
        //put in an array - each words seperately
        // if count == even, reverse the even index in array and put in new array in desc order
        //then push other elements to new array.

        System.out.println("Enter the sentence");
        Scanner sc = new Scanner(System.in);
        //Using next() will only return what comes before the delimiter (defaults to whitespace).
        // nextLine() automatically moves the scanner down after returning the current line.
        String sentence = sc.nextLine();
        System.out.print(sentence);
//String tokenizer does same as split but faster but u hv to iterate to get all elements where split gets its array with regex
        String[] wordsArray = sentence.split("\\s+");
        int wordsCount = wordsArray.length;
        String[] reversedArray = new String[wordsCount];
        if(wordsCount%2!=0){
            String revrsedString ="";
            for(int i=0;i<wordsCount;i++){
                //bcz array starts with 0, but its considered as even
                if(i%2==0){
                    revrsedString = new StringBuilder(wordsArray[i]).reverse().toString();
                    reversedArray[i]=revrsedString;
                }
            }
            System.out.print(reversedArray);

        }else{
            //even
            String revrsedString ="";
            for(int i=0;i<wordsCount;i++){
                //bcz array starts with 0, but its considered as even
                if(i%2!=0){
                    revrsedString = new StringBuilder(wordsArray[i]).reverse().toString();
                    reversedArray[i]=revrsedString;
                }
            }
            System.out.print(reversedArray);

        }
    }
}
