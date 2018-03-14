/*

Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.


countHi2("ahixhi") → 1
countHi2("ahibhi") → 2
countHi2("xhixhi") → 0

*/

public int countHi2(String str) {
  
  if (str.length() < 2) return 0;
  else if (str.charAt(0) == 'h' && str.charAt(1) == 'i') return 1 + countHi2(str.substring(2));
  else if (str.length() ==2) return 0;
  else if (str.charAt(0) == 'x' && str.charAt(1) == 'h' && str.charAt(2) == 'i') return countHi2(str.substring(2));
  else return countHi2(str.substring(1));
}
