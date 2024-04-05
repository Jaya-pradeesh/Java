import java.util.*;
public class evenodd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();

        String result=n %2 ==0 ? "Even number" : "Odd number";
        System.out.println(result);

    }
}
