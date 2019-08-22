//Logic-2 > closeFar 

//Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.

public boolean closeFar(int a, int b, int c) {
  int ab = Math.abs(b-a);
  int ac = Math.abs(c-a);
  int bc = Math.abs(b-c);
  if (ab < 2 && ac > 1 && bc > 1|| ab > 1 && ac < 2 && bc > 1){
    return true;
  }
  return false;
}