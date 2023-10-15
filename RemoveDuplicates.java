import java.util.*;
public class RemoveDuplicates {
    public static int[] removeDup(int arr[]){
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int unique[]=new int[set.size()];
        int i=0;
        for(int num:set){
            unique[i++]=num;
        }
        return unique;
    }
    public static void main(String[] args) {
        int arr[]={4,59,6,6,1,4,59};
        int unique[]=removeDup(arr);
        System.out.println(Arrays.toString(unique));

    }
}
