package others;

import java.util.Arrays;

public class InsertionSort {

    public static int[] InsertionSortAlgo(int[] arr,int n){
        for(int i=0; i<=n-1; i++){
            for(int j=i; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr= {4,2,1,6,45,23,8};

        System.out.println(Arrays.toString(InsertionSortAlgo(arr,arr.length)));
    }
}
