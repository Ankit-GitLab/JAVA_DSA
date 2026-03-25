package Maps_And_Sets;

import java.util.*;

public class ArraySubset {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer,Integer> aMap = new HashMap<>();
        for(int ele : a){
            aMap.put(ele, aMap.getOrDefault(ele, 0) + 1);
        }
        for(int ele : b){
            if(!aMap.containsKey(ele)) return false;
            int freq = aMap.get(ele);
            if(freq==0) return false;
            aMap.put(ele,freq-1);
        }

        return true;
    }
}
