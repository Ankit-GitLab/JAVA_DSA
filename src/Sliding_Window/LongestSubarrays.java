package Sliding_Window;

public class LongestSubarrays {
    public int longestSubarray(int[] arr) {
        int i = 0, zeroes = 0, maxLen = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0) zeroes++;

            while (zeroes > 1) {
                if (arr[i] == 0) zeroes--;
                i++;
            }

            maxLen = Math.max(maxLen, j - i);
        }
        return maxLen;
    }
}
