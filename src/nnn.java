import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        if(n==0) {
            System.out.println("Given number is ZERO");
        }

        else{
            String result=n > 0 ? "Given number is POSITIVE" : "Given number is NEGATIVE";
            System.out.println(result);
        }

    }
}