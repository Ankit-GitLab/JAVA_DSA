package ankitRevise.array;

import java.util.Arrays;

public class ThreeSumSmaller {
    int countTriplets(int sum, int arr[]) {
        Arrays.sort(arr);

        int ans = 0;
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int total = arr[i] + arr[left] + arr[right];

                if (total < sum) {
                    ans += (right - left);
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return ans;
    }
}
