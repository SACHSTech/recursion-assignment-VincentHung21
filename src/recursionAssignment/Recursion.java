package recursionAssignment;

public class Recursion{
  public static int count7(int n) {
    if (n == 0) {
      return 0;
    } else if (n % 10 == 7) {
      return 1 + Recursion.count7(n / 10);
    } else {
      return 0 + Recursion.count7(n / 10);
    }
  }
}
