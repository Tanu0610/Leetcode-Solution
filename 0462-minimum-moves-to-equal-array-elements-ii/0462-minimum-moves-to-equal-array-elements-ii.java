class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);  // sort first

        int n = nums.length;
        int median = nums[n / 2];  // best target is the median
        int moves = 0;

        for (int num : nums) {
            moves += Math.abs(num - median);
        }

        return moves;
    }
}