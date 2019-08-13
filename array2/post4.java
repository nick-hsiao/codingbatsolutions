//Array-2 > post4 
//Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.

public int[] post4(int[] nums) {
  int n = 0;
  for (int i=nums.length-1; i >= 0 ; i--){
    if (nums[i] == 4 ){
      n = i+1;
      break;
    }
  }
  int[] ans = Arrays.copyOfRange(nums,n, nums.length);
  return ans;
}
