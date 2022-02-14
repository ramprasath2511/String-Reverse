import java.io.*;
import java.util.*;



class palindrome
{
    public static void main(String args[]){
        String s,r="";
        Scanner in = new Scanner(System.in);
        s=in.nextLine();
        int length=s.length();
        for(int i=length-1;i>=0;i--){
            r=r+s.charAt(i);
        }
        if(s.equals(r)){
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }



    }

}