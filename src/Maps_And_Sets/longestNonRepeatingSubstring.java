package Maps_And_Sets;

import java.util.HashSet;

public class longestNonRepeatingSubstring {
    public int longestUniqueSubstr(String s) {
        HashSet<Character> set = new HashSet<>();
        int i = 0, j = 0, maxLength = 1;
        while(j<s.length()){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                j++;
            }
            else{
                int len = j-i;
                maxLength = Math.max(maxLength,len);
                while(s.charAt(i)!=s.charAt(j)){
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
                j++;
            }
        }
        int len = j-i;
        maxLength = Math.max(maxLength,len);
        return maxLength;
    }
}
