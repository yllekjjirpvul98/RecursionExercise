/*

Count recursively the total number of "abc" and "aba" substrings that appear in the given string.


countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2

*/

public int countAbc(String str) {
  if (str.equals("abc")) return 1;
  else if (str.equals("aba")) return 1;
  else if (str.length() <= 3) return 0;
  else return countAbc(str.substring(0,3)) + countAbc(str.substring(1));
}
