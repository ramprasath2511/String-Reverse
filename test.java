import java.util.Scanner;

class Program
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();
        String result = "";
        //your code goes here
        for(int i=arr.length-1;i>=0;i--)
        {
            result +=arr[i];

        }
        System.out.println(result);

    }
}
