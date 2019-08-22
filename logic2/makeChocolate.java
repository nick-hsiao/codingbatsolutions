//Logic-2 > makeChocolate 

//We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.

public int makeChocolate(int small, int big, int goal) {
  int max = 0;
  if (big*5 > goal){
    max = goal/5;
  }
  if (max != 0){
    goal -= max*5;
  }
  else if (goal >= big*5){
  goal -= big*5;
  }
  if (small>=goal){
    return goal;
  }
  return -1;
}
