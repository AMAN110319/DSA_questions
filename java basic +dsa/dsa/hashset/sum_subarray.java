import java.util.*;
public class sum_subarray {
    public static void main(String[] args) {
        int arr[]={10,2,-2,-20,10};
        int k=-10;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,1);
        int sum =0;
        int ans=0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i]; //sum
            if(map.containsKey(sum-k)){
                ans +=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum, 0)+1);  
        }

        System.out.println(ans);
    }
}
