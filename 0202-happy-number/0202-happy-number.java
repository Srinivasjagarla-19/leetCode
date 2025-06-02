import java.util.HashSet;
public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (seen.contains(n)) {
                return false;
            }
            seen.add(n);
            n = sumOfSquares(n);
        }

        return true; 
    }

    private int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;        
            sum += digit * digit;      
            n = n / 10;                
        }
        return sum;
    }
}
