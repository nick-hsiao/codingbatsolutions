//Array-2 > lucky13
//Given an array of ints, return true if the array contains no 1's and no 3's.
public boolean lucky13(int[] nums) {
  boolean one = true, three = true;
  for (int num: nums){
    if (num == 1){ one = false;}
    if (num == 3){ three = false;}
  }
  return one && three;
}
