public class LongestStrictlySubArray {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1, dec = 1, maxinc = 1, maxdec = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                inc++;
                maxinc = Math.max(inc, maxinc);
                dec = 1;
            } else if (nums[i] < nums[i - 1]) {
                dec++;
                maxdec = Math.max(dec, maxdec);
                inc = 1;
            } else {
                inc = 1;
                dec = 1;
            }
        }
        return Math.max(maxinc, maxdec);
    }
}
