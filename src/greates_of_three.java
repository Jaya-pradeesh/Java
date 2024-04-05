public class greates_of_three {
    public static void main(String args[]){
        int a,b,c;
        a=10;
        b=20;
        c=30;
        boolean result=check(a,b,c);



    }
    public static boolean check(int a, int b, int c){
        if(a>=b && a>=c)
            System.out.println("a is greater - "+ a);

        else if (b>=a && b>=c)
            System.out.println("b is greater - "+ b);
        else if (c>=a && c>=b)
            System.out.println("c is greater - "+ c);
        return true;
    }
}
