public class ChechPowerOFThree {
    public static void main(String[] args) {
        
    }
    public boolean checkPowersOfThree(int n) {
    while (n > 1) {
      int r = n % 3;
      if (r == 2)
        return false;
      n /= 3;
    }

    return true;
  }
}
