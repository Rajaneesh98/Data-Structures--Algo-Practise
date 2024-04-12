package others;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public int[] twoSumHashMapBetter(int[] nums, int target){
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i =0; i<nums.length; i++){
            Integer ans = target- nums[i];
            if(hashMap.containsKey(ans) && hashMap.get(ans)!=i){
                System.out.println(i+" "+hashMap.get(ans));
                return new int[]{i,hashMap.get(ans)};
            }
            hashMap.put(nums[i],i);
        }
        return null;
    }

    public int[] twoSumHashMap(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length; i++){
            hashMap.put(nums[i],i);
        }
        for(int j=0; j<nums.length; j++ ){
            Integer ans = target-nums[j];
            if(hashMap.containsKey(ans) && hashMap.get(ans)!=j){
                int[] resArr = {j,hashMap.get(ans)};
                System.out.println(j+" "+hashMap.get(ans));
                return resArr;
            }
        }
        return null;
    }

    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    int[] arr = {i,j};
                    return arr;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSumHashMapBetter(new int[]{2, 2, 3, 5}, 4)));
    }
}
