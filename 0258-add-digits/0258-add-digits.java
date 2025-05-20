class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            String str = Integer.toString(num);
            for (int i = 0; i < str.length(); i++) {
                sum += str.charAt(i) - '0';
            }
            num = sum;
        }
        return num;
    }
}
