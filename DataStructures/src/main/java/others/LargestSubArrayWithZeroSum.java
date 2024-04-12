package others;

import java.util.HashMap;

public class LargestSubArrayWithZeroSum {

    int maxLen(int arr[], int n)
    {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Integer tempSum = 0;
        int subArrLength = 0;
        hashMap.put(0,-1);
        for(int i=0; i<n; i++){
            tempSum = tempSum + arr[i];
            if(hashMap.containsKey(tempSum)){
                if(subArrLength < i-hashMap.get(tempSum))  subArrLength=i-hashMap.get(tempSum);
            }else{
                hashMap.put(tempSum,i);
            }
        }
        return subArrLength;
    }

    public static void main(String[] args) {
        var obj = new LargestSubArrayWithZeroSum();
        int[] arr = {-1, 1, -1, 1};
        System.out.println(obj.maxLen(arr,arr.length));
    }
}
