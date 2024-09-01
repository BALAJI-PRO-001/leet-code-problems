import java.util.HashMap;
import java.util.Map;

public class Solution_2 {
  public static void main(String[] args) {
    int nums[] = {2,7,11,15}, target = 26;
    long startTime = System.currentTimeMillis();
    int result[] = twoSum(nums, target);
    long endTime = System.currentTimeMillis();

    System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    System.out.println("Code execution time: " + (endTime - startTime) + " ms");
  }

  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[] {i, map.get(complement)};
      }
    }
    return null;
  }
}
