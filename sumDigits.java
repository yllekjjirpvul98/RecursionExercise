/*

Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).


sumDigits(126) → 9
sumDigits(49) → 13
sumDigits(12) → 3

*/

public int sumDigits(int n) {
  if (n < 10) return n;
  else if (n == 0) return 0;
  else return sumDigits(n/10) + n%10; 
}
