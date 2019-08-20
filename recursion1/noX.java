//Recursion-1 > noX 

//Given a string, compute recursively a new string where all the 'x' chars have been removed.

public String noX(String str) {
  if (str.equals("x")){
    return "";
  }
  if (str.length() < 2){
    return str;
  }
  if (str.substring(0,1).equals("x")){
    return noX(str.substring(1));
  }
  return str.substring(0,1) + noX(str.substring(1));
}
