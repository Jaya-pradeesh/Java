import java.util.Scanner;

public class calculation {
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the First number: ");
        int number1= Integer.parseInt(sc.nextLine());

        System.out.print("Enter the Second number: ");
        int number2 = Integer.parseInt(sc.nextLine());

        System.out.print("What Operation do you want to perform: ");
        String operation=sc.nextLine();

        if(operation.equals("sum"))
        {
            System.out.printf("%d + %d = %d",number1,number2,number1+number2);

        } else if (operation.equals("sub")) {
            System.out.printf("%d - %d = %d",number1,number2,number1-number2);

        } else if (operation.equals("div")) {
            if (number2==0){
                System.out.println("Cannot perform operation");
            }
            else {
            System.out.printf("%d / %d = %d",number1,number2,number1/number2);}

        } else if (operation.equals("mul")) {
            System.out.printf("%d * %d = %d",number1,number2,number1*number2);

        }
        else {
            System.out.println("Enter valid Operation");
        }
    }
}