public class Main {
  public static void main(String[] args) {
    int nums[] = {2,7,11,15}, target = 9;
    long startTime = System.currentTimeMillis();
    int result[] = twoSum(nums, target);
    long endTime = System.currentTimeMillis();

    System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    System.out.println("Code execution time: " + (endTime - startTime) + " ms");
  }

  public static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i; j < nums.length; j++) {
        if (nums[j] + nums[j - i] == target) {
          return new int[] {j, j - i};
        }
      }
    }
    return null;
  }
}