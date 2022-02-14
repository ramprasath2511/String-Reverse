import java.util.Scanner;

/*Class name should be in capital letter
 method name on camelcase
variable name on lower case

These are coding standards expected in interview.
Standards can differ based on coding lang
*/


public class Palindrome2 {
    public static void main(String[] args){
        /*
        * if the question is palindrome think beyond the question
        * what could be the input, number or string. if its a string it can be case sensitive
        * keep this in mind n start solving the problem*/
        System.out.print("Press 1 if it's a Number, press 2 if it's a string");
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        int number = 0;
        boolean result=false;
        String string = null;
        // always perform null check before processing the user input, integer can be checked only with 0, where as string with null
        if(code!=0 && code==1) {
            number = sc.nextInt();
            result = checkPalindrome(number + "");
        }
        if(code!=0 && code==2) {
            string = sc.next();
            result = checkPalindrome(string);
        }
        System.out.println(result);

    }
/*always declare a method to perform particular operation
give it a meaningful name.
perform null check before processing
Declared private because it is not used outside this class
Declared static because one object is enough for entire class to process the output.
 */
    private static boolean checkPalindrome(String string) {
        if(string!=null){
            //to lowercase to avoid case sensitive conflicts
            string=string.toLowerCase();
            //string has many functionality like concat,tolower etc, use them wisely
            // also learn about String vs StringBuilder vs StringBuffer
            if(string.equals(new StringBuilder(string).reverse().toString())){
                return true;
            }
        }
        return false;
    }
}
