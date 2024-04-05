import java.util.Scanner;
public class SecondMax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = {20,22,06,10,02,19};
        System.out.println("SecondMax - sm || Maximum - m");
        String get=sc.nextLine();
        switch (get){
            case ("sm"):
                System.out.println(secondMax(arr));
            case("m"):
                System.out.println(maximum(arr));
        }



    }
    public static int secondMax(int[] arr){
        int Max=Integer.MIN_VALUE;
        int secondMaximum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max){
                secondMaximum = Max;
                Max = arr[i];
            } else if (arr[i]>secondMaximum && arr[i]!=Max) {
                secondMaximum = arr[i];

            }
        }
        return secondMaximum;

    }
    public static int maximum(int [] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
