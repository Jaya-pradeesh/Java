public class minValue {
    public static void main(String args[]){
        int[] arr ={22,44,3,55,6,7};
        System.out.println(minValue(arr));

    }
    public static int minValue(int[] arr){
        int min = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
