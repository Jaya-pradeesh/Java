import java.util.*;

public class strarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //get string from the user
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        // store the string s in a array which is in char type
        char[] sarray = s.toCharArray();
        // get to indices start and end from the user
        System.out.print("Start: ");
        int start =sc.nextInt();
        System.out.print("End: ");
        int end=sc.nextInt();

        //verify the range constrains start>=0 && end<= length of sarray && start< end
        if(start>=0 && end<= sarray.length && start<end){
            //select the range by copying range from sarray
            char [] copyOfsArray = Arrays.copyOfRange(sarray,start,end+1); //end+1 means it include last index we gave we can also use only end it will exclude last index value
            //now we want to print if we want to print a array we should use for loop constrain char ch: copyOfsArray this means value of copyOfsArray belongs to ch
            for(char ch:copyOfsArray){
                System.out.print(ch);
            }

            }

        }


    }
