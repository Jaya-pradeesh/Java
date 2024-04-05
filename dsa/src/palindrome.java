import java.util.Scanner;
public class palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Text to check whether it is a PALINDROME or NOTPALINDROME : ");
        String check=sc.nextLine();
        if(checkPalindrome(check) == true){
            System.out.println(check+" is PALINDROME");
        }else {
            System.out.println(check+" is not a PALINDROME");
        }

    }
    public static boolean checkPalindrome(String word){
        char [] charWord = word.toCharArray();
        int start = 0;
        int end = word.length()-1;
        while(start<end){
            if(charWord[start]!=charWord[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

