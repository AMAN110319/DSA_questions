import java.util.*;
public class sliding_window_max{
    static class pair implements Comparable<pair> {
        int value;
        int idx;
        public pair(int value, int idx) {
            this.value = value;
            this.idx = idx;
        }
        @Override
        public int compareTo(pair p2){
            // descending
            return p2.value - this.value;
        }
    }


    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int res[]=new int[arr.length-k+1];

        PriorityQueue<pair> pq= new PriorityQueue<pair>();
// yaha se main sliding logic
        // 1st window
        for(int i=0; i<k; i++){
            pq.add(new pair(arr[i], i));
        }
        res[0]=pq.peek().value;
        for(int i=k; i<arr.length; i++){
            // need to check whether the top is within range
            while(pq.size()>0 && pq.peek().idx<=(i-k)){
                pq.remove();  
            }
            pq.add(new pair(arr[i], i));
            res[i-k+1]=pq.peek().value;
        }

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}