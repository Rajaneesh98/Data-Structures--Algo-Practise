public class Step3_1_FindMissingNumberInArray {

    public int missingNumber(int[] nums) {
        int n= nums.length;
        int sumByMath = (n*(n+1))/2;
        for(int i : nums){
            sumByMath=sumByMath-i;
        }
        return sumByMath;
    }

    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,8,1};
        var obj = new Step3_1_FindMissingNumberInArray();
        System.out.println(obj.missingNumber(arr));
    }
}
