import java.util.Scanner;

public class switchcase {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the First number: ");
        int number1=Integer.parseInt(sc.nextLine());

        System.out.print("Enter the Second number: ");
        int number2=Integer.parseInt(sc.nextLine());

        System.out.print("What operation do you want to perform: ");
        String operation=sc.nextLine();

        switch (operation){
            case ("sum"):
                System.out.printf("%d + %d = %d",number1,number2,number1+number2);
                break;
            case ("sub"):
                System.out.printf("%d - %d = %d",number1,number2,number1-number2);
                break;
            case ("div"):
                if (number2==0){
                    System.out.print("Cannot perform the operation");
                }
                else {
                    System.out.printf("%d / %d = %d",number1,number2,number1/number2);
                }
                break;

            case ("mul"):
                System.out.printf("%d * %d = %d",number1,number2,number1*number2);

        }

    }
}