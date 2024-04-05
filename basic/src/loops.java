import java.util.Scanner;

public class loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Operation\nsum - s || table - t: ");
        String input=sc.nextLine();

        if(input.equals("s")){
            sum();

        } else {
            if (input.equals("t")) {
                System.out.println("Custom Table - ct || Tables from 1 to 10 - tt");
                String ask= sc.nextLine();
                if(ask.equals("ct")){
                    multiplicationTables();
                } else if (ask.equals("tt")) {
                    tables();

                }


            }


        }
        sc.close();


    }
    public static void multiplicationTables(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        for(int mul=1;mul<=10;mul++){
            System.out.printf("%d x %d = %d \n",number,mul,number*mul);

        }
        sc.close();

    }
    public static void addNumbers(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (args.length == 2) {
            int num1 = sc.nextInt();Integer.parseInt(args[0]);
            int num2 = sc.nextInt();Integer.parseInt(args[1]);
        }
    }
    // when we try to execute this method in terminal it should done by java loops then 2 arguments then it ask for sum or table
// we give sum and enter the answer is correct this is because in this specific code we took args length
// so if we want to perform sum we need to give 2 parameters after we type java loops
// these 2 parameters are the args length
// the alternate way is writen down

    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1=sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.print("Answer: "+sum);
    }
    public static void tables(){
        for(int row=1;row<=2;row++)  //outer loop for row
        {
            for(int number=1;number<=10;number++) //middle loop for number
            {
                for(int column=1;column<=5;column++) // inner loop for column
                {
                    int multiplier = column + (row-1)*5;
                    System.out.printf("%d x %d = %d\t",multiplier,number,multiplier*number);
                }
                System.out.println();

            }
            System.out.println();

        }

    }
}
