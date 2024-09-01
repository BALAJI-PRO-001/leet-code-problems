#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int* twoSum(int *, int, int, int *);

int main() {
  clock_t start, end;
  double cpu_time_used;
  int nums[] = {2,7,11,15}, target = 9, numsSize = 4, returnSize;

  start = clock();
  int *result = twoSum(nums, numsSize, target, &returnSize);
  end = clock();

  cpu_time_used = (double) (end - start);
  printf("\nCode execution time: %f", cpu_time_used);

  if (result != NULL) {
    printf("\nOutput: [%d][%d]\n", result[0], result[1]);
    free(result);
  } else {
    printf("\nNo output ....\n");
  }
    
  return 0;
}

int* twoSum(int *nums, int numsSize, int target, int *returnSize) {
  for (int i = 0; i < numsSize; i++) {
    for (int j = i + 1; j < numsSize; j++) {
      if (nums[i] + nums[j] == target) {
        int *result = (int *) malloc(2 * sizeof(int)); 
        if (result == NULL) {
          return NULL;
        }
        result[0] = i;
        result[1] = j;
        *returnSize = 2;
        return result;
      }
    }
  }
  *returnSize = 0;
  return NULL;
}