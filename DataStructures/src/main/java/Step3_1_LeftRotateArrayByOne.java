import java.util.Arrays;

public class Step3_1_LeftRotateArrayByOne {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp =arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,34,2,14,2};
        System.out.println(Arrays.toString(rotateArray(arr,arr.length)));
    }
}
