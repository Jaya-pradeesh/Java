import java.util.Scanner;
public class reverse_number {
    private static int check(int a){

        int rem,reverse=0;
        while (a!=0){
            rem=a%10;
            reverse=reverse*10+rem;
            a /=10;

        }
        return reverse;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int result = check(a);
        System.out.println(result);
    }

}
