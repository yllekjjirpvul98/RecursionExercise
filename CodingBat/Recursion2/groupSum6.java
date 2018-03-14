/*

Given an array of ints, is it possible to choose a group of some of the ints, beginning at the start index, such that the group sums to the given target? However, with the additional constraint that all 6's must be chosen. (No loops needed.)


groupSum6(0, [5, 6, 2], 8) → true
groupSum6(0, [5, 6, 2], 9) → false
groupSum6(0, [5, 6, 2], 7) → false

*/


public boolean groupSum6(int start, int[] nums, int target) {
  
  if (target == 0 && !contain6(nums)) return true;
  else if(nums.length == start) return false;
  else if (nums[start] == 6){
    nums = Arrays.copyOfRange(nums, start+1, nums.length);
    return groupSum6(0, nums, target - 6); 
  }else{
    int result = nums[start];
    nums = Arrays.copyOfRange(nums,start+1, nums.length);
    return groupSum6(0, nums, target - result) || groupSum6(0, nums, target); 
  }
}

public boolean contain6(int[] nums){
  for (int i = 0; i < nums.length; i++){
    if (nums[i] == 6) return true;
  }return false;
}
