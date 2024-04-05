public class RemoveEven {
    public static void main(String args []){

        int [] arr = {11,22,33,44,55};
        int [] reverse=reverseArray(arr,0,arr.length-1);
        int [] result = removeEven(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(reverse[i]+" ");
        }

    }
    public static int[] removeEven(int[] arr){
        int oddCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddCount ++;
            }
        }
        int [] result = new int[oddCount];
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                result[index]=arr[i];
                index++;
            }
        }
        return result;
    }
    public static int[] reverseArray(int[] number, int start, int end){
        while(start<end){
            int temp = number[start];
            number[start]=number[end];
            number[end] = temp;
            start++;
            end--;
        }


        return number;
    }
}