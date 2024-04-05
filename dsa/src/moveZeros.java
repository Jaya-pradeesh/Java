public class moveZeros {
    public static void main(String args[]){
        int[] arr = {1,0,3,0,22,0,06,226};
        moveZero(arr);
        for(int num : arr){
            System.out.print(num+" ");
        }

    }
    public static void moveZero(int [] arr){
        int j =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j] == 0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if (arr[j]!=0){
                j++;
            }
        }
    }
}
