import java.util.HashMap;

public class Step1_6Highest_LowestFrequencyElements {

    public static int[] getFrequencies(int []v){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int j : v) {
            if (hashMap.containsKey(j)) {
                hashMap.put(j, hashMap.get(j) + 1);
            } else {
                hashMap.put(j, 1);
            }
        }
        Integer highest = Integer.MIN_VALUE;
        Integer highestFreq= Integer.MIN_VALUE;
        Integer lowest = Integer.MAX_VALUE;
        Integer lowestFreq= Integer.MAX_VALUE;
        for(Integer i : hashMap.keySet()) {
            if (hashMap.get(i) > highestFreq) {
                highest = i;
                highestFreq = hashMap.get(i);
            } else if (hashMap.get(i) == highestFreq && i < highest) {
                highest = i;
            }
            if (hashMap.get(i) < lowestFreq) {
                lowest = i;
                lowestFreq = hashMap.get(i);
            } else if (hashMap.get(i) == lowestFreq && i < lowest) {
                lowest = i;
            }
        }
        return new int[]{highest,lowest};
    }


    public static int[] getFrequenciesUsingArray(int []v) {
        // Write Your Code Here
        for(int temp : v){
            System.out.print(temp+" ");
        }
        System.out.println();
        int[] ans = new int[v.length+1];
        for(int i=0; i<v.length; i++){
            ans[v[i]]++;
        }
        for(int temp=1; temp<ans.length; temp++){
            System.out.print(ans[temp]+" ");
        }
        System.out.println();
        int lessFrequent=Integer.MAX_VALUE;
        int moreFrequent=0;
        int[] freq=new int[2];
        for(int i=1; i<ans.length; i++){
            if(ans[i]> moreFrequent ){
                moreFrequent=ans[i];
                freq[0]=i;
            }
            if (ans[i]<lessFrequent && ans[i]>0) {
                lessFrequent=ans[i];
                freq[1]=i;
            }
        }
        return freq;
    }


    public static void main(String[] args) {
        int[] ans= getFrequencies(new int[]{7, 2, 3});
        for(int j : ans){
            System.out.println(j);
        }
    }
}
