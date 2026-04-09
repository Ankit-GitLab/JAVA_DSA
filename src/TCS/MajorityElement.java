package TCS;
import java.util.*;
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;

        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele, 0) + 1);
            if(map.get(ele) > n/2) return ele;
        }
        return -1;
    }
}
