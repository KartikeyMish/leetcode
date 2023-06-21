class Solution {
        public long minCost(int[] nums, int[] cost) {
        long ans = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        int min = Integer.MAX_VALUE, max = 0;
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], cost[i] + hm.getOrDefault(nums[i], 0));
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        long cmin = hm.get(min);
        long cmax = hm.get(max);
        while (min < max) {
            if (cmin <= cmax) {
                ans += cmin;
                min++;
                cmin += hm.getOrDefault(min, 0);
            } else {
                ans += cmax;
                max--;
                cmax += hm.getOrDefault(max, 0);
            }}
        return ans;}
}