package Prefix_Sum;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    public int subarraySum(int[] arr, int k) {
        int count = 0 , n = arr.length;
        // make arr prefix sum array
        for(int i=0; i<n; i++){
            arr[i] += arr[i-1];
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int ele = arr[i];
            if(ele==k) count++;
            int rem = ele - k;
            if(map.containsKey(rem)) count += map.get(rem);
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
            else map.put(ele,1);
        }
        return count;
    }
}
