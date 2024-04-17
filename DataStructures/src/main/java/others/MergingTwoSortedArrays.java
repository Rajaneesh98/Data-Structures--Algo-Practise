package others;

import java.util.Arrays;

public class MergingTwoSortedArrays {

    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int[] res = new int[arr1.length+arr2.length];
        int loopCondition = Math.min(arr1.length,arr2.length);
        int i1=0, i2=0 , j1=0;
        while(i1<loopCondition && i2<loopCondition){
            if(arr1[i1]<=arr2[i2]){
                res[j1]=arr1[i1];
                i1++;
                j1++;
            }else{
                res[j1]=arr2[i2];
                j1++;
                i2++;
            }
        }
        while(i1<arr1.length){
            res[j1++]=arr1[i1++];
        }
        while(i2<arr2.length){
            res[j1++]=arr2[i2++];
        }

        return res;

    }

    public static void main(String[] args) {
        int[] arr1= {2,6,13,56};
        int[] arr2 = {4,7,10};
        System.out.println(Arrays.toString(mergeArrays(arr1,arr2)));
    }
}
