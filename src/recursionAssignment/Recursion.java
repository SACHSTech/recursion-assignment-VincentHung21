package recursionAssignment;

public class Recursion{
  public static int count7(int n) {
    //Testing For Base Case (No numbers left or given)
    if (n == 0) {
      return 0;
      //Test if right most number is 7 then recursively access method again. Return 1
    } else if (n % 10 == 7) {
      return 1 + Recursion.count7(n / 10);
      //If rightmost number is not 7 recursively access method again. Return 0
    } else {
      return 0 + Recursion.count7(n / 10);
    }
  }
  public static String pairStar(String str) {
    return "a*a";
  }
}
