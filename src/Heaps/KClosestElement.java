//package Heaps;
//import java.util.*;
//
//class Pair implements Comparable<Pair>{
//    int dist;
//    int val;
//
//    Pair(int dist, int val){
//        this.dist = dist;
//        this.val = val;
//    }
//
//    public int compareTo(Pair p){
//        if(this.dist == p.dist) return p.val - this.val; // reverse
//        return this.dist - p.dist;
//    }
//}
//public class KClosestElement {
//    int[] printKClosest(int[] arr, int k, int x) {
//        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
//
//        for(int val : arr){
//            if(val == x) continue;
//
//            int dist = Math.abs(val - x);
//            pq.add(new Pair(dist, val));
//
//            if(pq.size() > k) pq.remove();
//        }
//
//        int[] res = new int[k];
//        int i = k - 1;
//
//        while(pq.size()!=0){
//            res[i--] = pq.remove().val;
//        }
//
//        return res;
//    }
//}
