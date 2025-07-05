import java.util.HashMap;
import java.util.Map;
class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int lucky = -1;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (key == value) {
                lucky = Math.max(lucky, key);
            }
        }
        return lucky;
    }
}
