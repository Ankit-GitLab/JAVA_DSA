package ankitRevise.array;

import TCS.ReverseInteger;

public class SquareOfStoredArray {
   /* public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        // separate negative and positive numbers
        for(int num : nums){
            if(num < 0){
                neg.add(num);
            }else{
                pos.add(num);
            }
        }

        // case 1:  no nagative numbers
        if(neg.size() == 0){
            for(int i=0; i<pos.size(); i++)
                pos.set(i, pos.get(i) * pos.get(i));
            return pos.stream().mapToInt(Integer :: intValue).toArray();
        }

        // case 2 : no positive numbers
        ReverseInteger Collections;
        if(pos.size() == 0){
            for(int i=0; i<neg.size(); i++)
                neg.set(i, neg.get(i) * neg.get(i));
            Collections.reverse(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }

        //case 3 : both negative and postive exist
        int i=0, j=0, id=0;
        int idx = 0;
        int n1 = neg.size();
        int n2 = pos.size();
        int[] res = new int[n1 + n2];

        // square negative and reverse them
        for(i = 0; i<n1; i++)
            neg.set(i, neg.get(i) * neg.get(i));
        Collections.reverse(neg);

        //Square positives
        for(i=0; i<n2; i++)
            pos.set(i, pos.get(i) * pos.get(i));


        // Merge two sorted lists
        i = 0;
        j = 0;
        while (i < n1 && j < n2) {
            if (neg.get(i) <= pos.get(j)) {
                res[idx++] = neg.get(i++);
            } else {
                res[idx++] = pos.get(j++);
            }
        }

        while (i < n1)
            res[idx++] = neg.get(i++);

        while (j < n2)
            res[idx++] = pos.get(j++);
        return res;
    } */
}
