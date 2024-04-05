import java.util.Scanner;

public class sumOfN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Find Sum of N natural numbers");
        System.out.print("Enter num: ");
        int num=sc.nextInt();
        System.out.println("sum of N natural numbers is: "+ sum(num));
    }
    public static int sum(int n){
        return n*(n+1)/2;

    }
}