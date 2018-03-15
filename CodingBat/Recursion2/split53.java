/*

Given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is the same, with these constraints: all the values that are multiple of 5 must be in one group, and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)


split53([1, 1]) → true
split53([1, 1, 1]) → false
split53([2, 4, 2]) → true

*/


public boolean split53(int[] nums) {
  return recursiveHelper(nums, new ArrayList<Integer>(), new ArrayList<Integer>(), 0);
}

public boolean recursiveHelper(int[] nums, ArrayList<Integer> array1, ArrayList<Integer> array2, int index){
      if (findSum(array1) - findSum(array2) == 0 && index == nums.length) return true;
      else if (index == nums.length) return false;
      else if (nums[index]% 5 == 0) {
          int value = nums[index];
          ArrayList<Integer> temp1 = (ArrayList<Integer>)array1.clone();
          ArrayList<Integer> temp2 = (ArrayList<Integer>)array2.clone();
          array1.add(value);
       return recursiveHelper(nums, array1, temp2, index+1);
      }else if (nums[index] % 3 == 0){
        int value = nums[index];
        ArrayList<Integer> temp1 = (ArrayList<Integer>)array1.clone();
        ArrayList<Integer> temp2 = (ArrayList<Integer>)array2.clone();
        array2.add(value);
      return recursiveHelper(nums, temp1, array2, index+1);
      }
      else {
      int value = nums[index];
      ArrayList<Integer> temp1 = (ArrayList<Integer>)array1.clone();
      ArrayList<Integer> temp2 = (ArrayList<Integer>)array2.clone();
      array1.add(value);
      array2.add(value);
      return recursiveHelper(nums, array1, temp2, index+1) || recursiveHelper(nums,temp1, array2, index+1);
    }
}

public int findSum(ArrayList<Integer> nums){

  int sum = 0;
  for (int num : nums){
    sum += num;
  }return sum;
}
