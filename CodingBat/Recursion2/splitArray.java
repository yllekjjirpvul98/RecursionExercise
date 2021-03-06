/*

Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.)


splitArray([2, 2]) → true
splitArray([2, 3]) → false
splitArray([5, 2, 3]) → true

*/

public boolean splitArray(int[] nums) {
  return recursiveHelper(nums, new ArrayList<Integer>(), new ArrayList<Integer>(), 0);
}

public boolean recursiveHelper(int[] nums, ArrayList<Integer> array1, ArrayList<Integer> array2, int index){
    if (findSum(array1) - findSum(array2) == 0 && nums.length == index) return true;
    else if (index == nums.length || findSum(array1) - findSum(array2) < 0 ) return false;
    else{
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
