package others;

import java.util.Arrays;

public class BubbleSort {

    public static int[] BubbleAlgoOptimized(int[] arr){  //best case O(n) else O(n^2)
        for(int i=0; i<arr.length; i++){
            boolean swapHappen = false;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapHappen=true;
                }
            }
            if(!swapHappen){
                break;
            }
        }
        return arr;
    }

    public static int[] BubbleAlgo(int[] arr){  //O(n^2)

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,54,6};
        System.out.println(Arrays.toString(BubbleAlgoOptimized(arr)));
    }
}
