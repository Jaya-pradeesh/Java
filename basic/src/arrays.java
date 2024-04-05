import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        char vowels[] = new char[5];
        vowels[0]='a';
        vowels[1]='e';
        vowels[2]='i';
        vowels[3]='o';
        vowels[4]='u';

        //String name[] = {"Jayapradeesh","Nishanthini","Aakash","Ajay","Kishore","Shankari","Jayasuriya","Sandeep","Niranjan","Prithvi"};
       // Arrays.sort(name);
       // System.out.println(Arrays.toString(vowels));
     //   System.out.println(Arrays.toString(name));

        int num[]={1,2,3,4,5};
        int CopyOfNum[]= Arrays.copyOf(num,num.length);
        Arrays.fill(CopyOfNum,0);
       // Arrays.fill(num,0); this allows us to fill the given value to the mentioned array
        System.out.println(Arrays.toString(CopyOfNum));
        System.out.println(Arrays.toString(num));
        System.out.println(num == CopyOfNum);
        System.out.println(Arrays.equals(num,CopyOfNum));
        System.out.println(Arrays.stream(num).sum());

        String n ="Jaya pradeesh";
        String[] str=n.split(" ");
        System.out.println(Arrays.toString(str));

        //Arryas.copyOfRange(arrayname,startindex,endindex)
        // this allows user to set range that should be copied from the original array this does not need any length to be set





       // System.out.println("Enter the name you want to find its position: ");
      //  String key = sc.nextLine();
        //int FindPosition = Arrays.binarySearch(name,key);
      //  System.out.println(FindPosition);
        sc.close();


    }
}