import java.util.Scanner;

public class getinput {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.printf("Hello What is your name: ");
        String name=sc.nextLine();

        System.out.printf("Hello %s What is your age: ",name);
        int age=sc.nextInt();

        sc.nextLine();

        System.out.printf("%d is a perfect age for starting you career in IT job \n",age);
        System.out.printf("What is your prefered programming language: ");
        String language=sc.nextLine();

        System.out.printf("%s is very popular language in the world",language);




    }
}