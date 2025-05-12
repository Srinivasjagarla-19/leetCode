class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false; // Powers of 3 are positive integers
        
        // Keep dividing the number by 3 until it's no longer divisible
        while (n % 3 == 0) {
            n /= 3;
        }
        
        // If the final value of n is 1, then it was a power of 3
        return n == 1;
    }
}
