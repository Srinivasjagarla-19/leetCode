class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int x = 0;

        for (int num : nums) {
            if (count == 0) {
                x = num;
            }
            count += (num == x) ? 1 : -1;
        }
        return x;
    }
}
