public class Step1_6CountFrequencyInA_Range {

    public static int[] countFrequency(int n, int x, int [] nums){
        // Write your code here.
        int[] ans = new int[n];
        for(int i=0; i<n; i++) {
            int temp = nums[i];
            try {
                ans[temp-1]++;
            }catch (Exception e){
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 9, 2, 7};
        int[] ans = countFrequency(6,9,arr);
        for(int i : ans){
            System.out.print(i+" ");
        }
    }
}
