import java.util.HashMap;

public class Step3_1_LongestSubarrayWithGivenSumK_positives {

    public static int longestSubarrayWithSumKAnotherApproach(int []a, long k){
        int maxSubArrayLength=0;
        int tempSum=0 ,reqSum=0;
        HashMap<Integer,Integer> hashMap= new HashMap<>();
        for(int i=0; i<a.length;i++){
            tempSum=tempSum+a[i];
            if(tempSum==k){
                maxSubArrayLength=Math.max(maxSubArrayLength,i+1);
            }
            reqSum=(int)(tempSum-k);
            if(hashMap.containsKey(reqSum)){
                maxSubArrayLength = Math.max(i-hashMap.get(reqSum),maxSubArrayLength);
            }else{
                hashMap.put(tempSum,i);
            }
        }
        return maxSubArrayLength;
    }

    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int MaxSubArrayLength=0;
        for(int i=0; i<a.length;i++){
            int subArraySum=0 , subArrayLength=0;
            for(int j=i; j<a.length; j++){
                subArraySum=subArraySum+a[j];
                subArrayLength++;
                if(subArraySum>=k && j+1!=a.length && a[j+1]!=0){
                    break;
                }
            }
            if(subArraySum==k){
                MaxSubArrayLength=Math.max(MaxSubArrayLength,subArrayLength);
            }
        }
        return MaxSubArrayLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 0};
        System.out.println(longestSubarrayWithSumK(arr,3));
    }
}
