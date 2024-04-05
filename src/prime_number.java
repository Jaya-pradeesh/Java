import com.sun.security.jgss.GSSUtil;

public class prime_number {

    private static void checkprime(int n){
        int count=0;

        if(n<2)
            System.out.println("It is not a prime number");

        for(int i =1;i<=n;i++)
            if(n%i==0){
                count += 1;
            }
        if(count >2)
            System.out.println("It is not a prime number");
        else
            System.out.println("It is a Prime number");
    }
    public static void main(String args[]){
        int n=7;
        checkprime(n);

    }
}
