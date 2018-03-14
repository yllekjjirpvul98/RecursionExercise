/*

Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target with these additional constraints: all multiples of 5 in the array must be included in the group. If the value immediately following a multiple of 5 is 1, it must not be chosen. (No loops needed.)


groupSum5(0, [2, 5, 10, 4], 19) → true
groupSum5(0, [2, 5, 10, 4], 17) → true
groupSum5(0, [2, 5, 10, 4], 12) → false

*/


public boolean groupSum5(int start, int[] nums, int target) {
  if (target == 0 && !contain5(nums)) return true;
  else if (nums.length <= start) return false;
  else if (nums[start]%5 == 0) {
    int result = nums[start];
    if (start+1 < nums.length){
    if (nums[start+1] == 1) {
      nums = Arrays.copyOfRange(nums, start+2, nums.length);
    }else nums = Arrays.copyOfRange(nums, start+1, nums.length);
    }else nums = Arrays.copyOfRange(nums, start+1, nums.length);
    return groupSum5(0, nums, target-result);
  }else{
    int result = nums[start];
    nums = Arrays.copyOfRange(nums, start+1, nums.length);
    return groupSum5(0, nums,target-result) || groupSum5(0, nums, target);
  }
}

public boolean contain5(int[] nums){
  for (int num : nums){
    if (num%5 == 0) return true;
  }return false;
}
