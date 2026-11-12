package ankitRevise.sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, maxLen = 0;
        Map<Character,Integer> lastIndex = new HashMap<>();

        for(int right=0; right<n; right++){
            char c = s.charAt(right);

            if (lastIndex.containsKey(c))
                left = Math.max(left, lastIndex.get(c)+1);

            lastIndex.put(c,right);
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
