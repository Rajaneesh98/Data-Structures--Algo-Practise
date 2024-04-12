package others;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {4,1,7,9,5,12,8};

        for(int i=0; i<arr.length-1; i++){
            int smallestIndex = i;
            for(int j=i; j<arr.length; j++){
                if(arr[smallestIndex]>arr[j]){
                    smallestIndex=j;;
                }
            }
            int temp = arr[i];
            arr[i]=arr[smallestIndex];
            arr[smallestIndex]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
