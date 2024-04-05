import java.util.*;
class sum_of_digits{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int result = check(n);
        System.out.println(result);

    }
    private static int check(int a){

        int sum=0;
        while(a!=0){
            sum += a%10;
            a=a/10;
        }
        return sum;
    }
}