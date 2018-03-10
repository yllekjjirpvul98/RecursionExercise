/*

Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.


countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1

*/

public int countHi(String str) {
 if (str.equals("hi")) return 1;
 else if (str.length() > 2){
   return countHi(str.substring(0,2)) + countHi(str.substring(1));
 }else return 0;
}
