package Prefix_Sum;

public class BestClosingTime {
    public int bestClosingTime(String str) {
        int n = str.length();

        int[] pre = new int[n+1];
        for(int i=1; i<=n; i++){
            pre[i] = pre[i-1];
            if(str.charAt(i-1)=='N') pre[i] += 1;
        }

        int[] suf = new int[n+1];
        for(int i=n-1; i>=0; i--){
            suf[i] = suf[i+1];
            if(str.charAt(i)=='Y') suf[i] += 1;
        }

        int min = Integer.MAX_VALUE;
        for(int i=0; i<=n; i++){
            pre[i] += suf[i];
            min = Math.min(min,pre[i]);
        }
        for(int i=0; i<=n; i++){
            if(pre[i]==min) return i;
        }
        return -1;
    }
}
