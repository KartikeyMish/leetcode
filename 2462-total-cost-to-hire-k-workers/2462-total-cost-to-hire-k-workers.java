class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        
        int i = -1, j = costs.length;
        long ans = 0;

        while(i < candidates-1) pq1.add(costs[++i]);
        while(j-1 > i && j > costs.length - candidates) pq2.add(costs[--j]);

        while(k > 0 && !pq1.isEmpty() && !pq2.isEmpty()){
            if(pq1.peek() <= pq2.peek()){
                ans += pq1.poll();
                if(i+1 < j) pq1.add(costs[++i]);
            }else{
                ans += pq2.poll();
                if(j-1 > i) pq2.add(costs[--j]);
            }
            k--;
        }
        if(k == 0) return ans;
        
        while(k > 0 && !pq1.isEmpty()){
            ans += pq1.poll();
            k--;
        }
        while(k > 0 && !pq2.isEmpty()){
            ans += pq2.poll();
            k--;
        }
        return ans;
    }
}