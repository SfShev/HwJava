public class task1 {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[6];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

