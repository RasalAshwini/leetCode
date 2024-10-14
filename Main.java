import java.util.*;

class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        for (int num : nums) {
            pq.add(num);
        }
        while (k-- > 0) {
            int maxEl = pq.poll();
            sum += maxEl;
            maxEl = (int) Math.ceil(maxEl / 3.0);
            pq.add(maxEl);
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example test case
        int[] nums = {10, 20, 7};
        int k = 3;
        
        long result = solution.maxKelements(nums, k);
        System.out.println("Maximum sum of k elements: " + result);
    }
}
