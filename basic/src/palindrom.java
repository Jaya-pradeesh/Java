import java.util.*;

public class palindrom {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String input=sc.nextLine();
        if(isPalindrome(input)==true){
            System.out.println(input + " is Palindrome");
        }
        if(isPalindrome(input)==false) {
            System.out.println(input + " is not a Palindrome");
        }


    }
    public static boolean  isPalindrome(String s){
        

        int left=0;
        int right=s.length()-1;

        while (left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}