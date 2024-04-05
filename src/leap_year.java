import java.util.Scanner;

class leap_year{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=check(n);
        System.out.println(result);

    }
    private static int check(int a){

        if(a%400==0)
            System.out.println("leap year");
        else if(a%4==0 && a % 100 !=0)
            System.out.println("leap year");
        else
            System.out.println("not a leap year");

        return a;
    }


}