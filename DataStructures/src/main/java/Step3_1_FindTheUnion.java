import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Step3_1_FindTheUnion {

    public static List<Integer> sortedArrayAnotherApproach(int[] a, int[] b){
        SortedSet<Integer> set= new TreeSet<>();
        for(int i=0; i<a.length; i++){
            set.add(a[i]);
        }
        for(int i=0; i<b.length; i++){
            set.add(b[i]);
        }
        List<Integer> list = new ArrayList<>();
        for(int i : set){
            list.add(i);
        }
        return list;
    }

    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        int insertionPoint=0;
        int i=0, j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                if(list.size() ==0 || list.get(insertionPoint-1)!=a[i]){
                    list.add(insertionPoint,a[i]);
                    insertionPoint++;
                }
                i++;
            }else{
                if(list.size() ==0 || list.get(insertionPoint-1)!=b[j]){
                    list.add(insertionPoint,b[j]);
                    insertionPoint++;
                }
                j++;
            }
        }
        while(i<a.length){
            if(list.size() ==0 || list.get(insertionPoint-1)!=a[i]){
                list.add(insertionPoint,a[i]);
                insertionPoint++;
            }
            i++;
        }

        while(j<b.length){
            if(list.size() ==0 || list.get(insertionPoint-1)!=b[j]){
                list.add(insertionPoint,b[j]);
                insertionPoint++;
            }
            j++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 6};
        int[] b = {2, 3, 5};
        System.out.println(sortedArrayAnotherApproach(a,b));
    }
}
