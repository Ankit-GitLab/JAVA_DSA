package ankitRevise.sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKUnique {
    public int longestKSubstr(String s, int k) {
        // code here
        int n = s.length();
        int low = 0, res = -1;
        Map<Character, Integer> freq = new HashMap<>();


        for(int high=0; high<n; high++){
            char c = s.charAt(high);
            freq.put(c, freq.getOrDefault(c,0)+1);

            // shrink window if more than k unqiue
            while(freq.size() > k){
                char leftChar = s.charAt(low);
                freq.put(leftChar, freq.get(leftChar)-1);
                if(freq.get(leftChar) == 0)
                    freq.remove(leftChar);
                low++;
            }

            // if exactly k unique, update answer
            if (freq.size() == k)
                res = Math.max(res, high - low + 1);

        }
        return res;
    }
}
