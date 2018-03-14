/*

Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.


countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0

*/

public int countX(String str) {
  if (str.equals("x")) return 1;
  else if (str.length() > 1){
    return countX(str.substring(0,1)) + countX(str.substring(1));
  }else return 0;
/*

}
