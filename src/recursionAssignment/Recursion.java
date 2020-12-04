package recursionAssignment;


public class Recursion{
  public static int count7(int n) {
    //Testing For Base Case (No numbers left or given)
    if (n == 0) {
      return 0;
      //Test if right most number is 7 then recursively access method again without rightmost number. Return 1
    } else if (n % 10 == 7) {
      return 1 + Recursion.count7(n / 10);
      //If rightmost number is not 7 recursively access method again without rightmost number. Return 0
    } else {
      return 0 + Recursion.count7(n / 10);
    }
  }
  public static String pairStar(String str) {
    //Testing For Base Case (Only one letter left, program can not do anything with it)
    if (str.length() == 1) {
      return str;
      //Test if first two letters in string are the same, return first letter and *. Recursively access method again minus first letter
    } else if (str.charAt(0) == str.charAt(1)) {
      return str.charAt(0) + "*" + pairStar(str.substring(1));
      // If no pair of letters in first two characters of string return first letter and recursively access method again minus first letter.
    } else {
      return str.charAt(0) + pairStar(str.substring(1));
    }

  }
}
