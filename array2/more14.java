//Array-2 > more14 
// Given an array of ints, return true if the number of 1's is greater than the number of 4's

public boolean more14(int[] nums) {
  int one = 0;
  int four = 0;
  for (int i=0 ; i < nums.length; i++){
    if (nums[i] == 1){
      one++;
    }
    if (nums[i] == 4){
      four++;
    }
  }
  return one>four;
}
