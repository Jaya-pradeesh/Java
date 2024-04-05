import java.util.*;
public class prime_number_within_range {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();

        for(int i=a;i<=b;i++)
            if(isprime(i))
                System.out.println(i);

    }
    static boolean isprime(int n){
        int count=0;

        if(n<2)
            return false;

        for(int i = 2;i<=2;i++)
            if(n%i==0)
                return false;
        return true;
    }
}
