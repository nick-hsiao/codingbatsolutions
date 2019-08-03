//Array-2 > haveThree
//Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.


public boolean haveThree(int[] nums) {
  boolean flag = false;
  int n = 0;
  int prev = 0;
  
  for (int i=0; i<nums.length; i++){
    if (nums[i] == 3){
      if (nums[i] == prev){
        flag = true;
      }
      n++;
    }
    prev = nums[i];
    
  }
  
  if (flag){
    return false;
  }
  else if(n == 3){
    return true;
  }
  else{
    return false;
  }
}