public class findMissingNumber {
    public static void main(String args[]){
        int [] arr ={1,3,4,5,6,7};
        System.out.println("The missing number in the array is "+missingNumber(arr));

    }
    public static int missingNumber(int [] args){
        int n = args.length+1;
        int sum = n*(n+1)/2;
        for(int num:args){
            sum = sum-num;
        }
        return sum;
    }
}
