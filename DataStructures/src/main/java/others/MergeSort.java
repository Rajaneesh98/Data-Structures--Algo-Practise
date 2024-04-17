package others;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    private  static void mergeFunctionAlternative(int[] arr, int low, int mid, int high){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int left= low, right= mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                arrayList.add(arr[left]);
                left++;
            }else{
                arrayList.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            arrayList.add(arr[left++]);
        }
        while(right<=high){
            arrayList.add(arr[right++]);
        }

        for(int i=low; i<=high; i++){
            arr[i]=arrayList.get(i-low);
        }
    }


    private static void mergeFunction(int[] arr, int low , int mid , int high){
        int[] res=new int[high+1];
        int left = low;
        int right = mid+1;
        int resIndex=0;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                res[resIndex]=arr[left++];
            }else{
                res[resIndex]=arr[right++];
            }
            resIndex++;
        }
        while(left<=mid){
            res[resIndex++]=arr[left++];
        }
        while(right<=high){
            res[resIndex++]=arr[right++];
        }
        for(int i=low; i<=high; i++){
            arr[i]=res[i-low];
        }
    }

    public static void mergeAlgo(int[] arr,int low, int high){
        if(low>=high) return;
        int mid = (low +high)/2;
        mergeAlgo(arr,low,mid);
        mergeAlgo(arr,mid+1,high);
        mergeFunctionAlternative(arr,low,mid, high);
    }

    public static void main(String[] args) {
        int[] arr1 = {4,1,2,7,5,9,14,0,4,23,43,-5};
        mergeAlgo(arr1,0, arr1.length-1);
        System.out.println(Arrays.toString(arr1));
    }
}
