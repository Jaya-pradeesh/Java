import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);;

        int a=0;
        while(sc.hasNextLine()){
            String f = sc.nextLine();
            a++;
            System.out.println(a+" "+f);
        }
    }
}