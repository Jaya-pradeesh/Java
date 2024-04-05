public class resizeArray {
    public static void main(String args[]){
        int[] orginal = {1,2,3,4,5};

        System.out.println("The length original array: "+orginal.length);
        int cap = orginal.length;
        orginal=resize(orginal,cap*2);

        System.out.println("The length of Resized Array: "+orginal.length);
        for(int num:orginal){
            System.out.print(num+" ");
        }

    }
    public static int[] resize(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for (int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        return temp;
    }
}
