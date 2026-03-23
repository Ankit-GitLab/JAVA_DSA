package Maps_And_Sets;

import java.util.*;

public class MissingElementInRange {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr) set.add(ele);
        for(int i=low; i<=high; i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}
