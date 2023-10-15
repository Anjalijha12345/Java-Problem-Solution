import java.util.HashMap;
import java.util.*;

public class TwoSum {

public static int[] findTwoSum(int[] nums,int target){
    Map<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int complement=target-nums[i];
        if(map.containsKey(complement)){
            return new int[]{map.get(complement),i};
        }
        map.put(nums[i],i);
    }
    return new int[]{-1,-1};
}
public static void main(String[] args) {
    int nums[]={4,5,9,8,6,2,1};
    int target=7;
    int[] result=findTwoSum(nums, target);
    if(result[0] != -1 && result[1]!=-1){
        System.out.println("Two elements are found = "+ nums[result[0]] +" , "+ nums[result[1]]);
    }
    else{
        System.out.println("No such two elements found");
    }
}
}
