package Maps_And_Sets;

import java.util.*;

public class Anagram {
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ele : s1.toCharArray()){
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        for(char ele : s2.toCharArray()){
            if(!map.containsKey(ele) || map.get(ele) == 0){
                return false;
            }
            map.put(ele, map.get(ele) - 1);
        }

        return true;
    }
}
