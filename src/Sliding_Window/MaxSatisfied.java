package Sliding_Window;

public class MaxSatisfied {
    public int maxSatisfied(int[] arr, int[] grumpy, int k) {
        int n = arr.length, i = 0, j = k - 1;

        int unSatisfied = 0, maxUnsatisfied = 0;

        for (int x = i; x <= j; x++) {
            if (grumpy[x] == 1) unSatisfied += arr[x];
        }

        maxUnsatisfied = unSatisfied;

        while (j < n - 1) {
            j++;
            i++;

            if (grumpy[j] == 1) unSatisfied += arr[j];       // add new
            if (grumpy[i - 1] == 1) unSatisfied -= arr[i - 1]; // remove old

            maxUnsatisfied = Math.max(maxUnsatisfied, unSatisfied);
        }

        int satisfied = 0;
        for (int x = 0; x < n; x++) {
            if (grumpy[x] == 0) satisfied += arr[x];
        }

        return satisfied + maxUnsatisfied;
    }
}
