public class SumDigits {
  public static int sumDigits(int n){
    if(n < 10) return -1;
    int sum = 0;
    while(n > 0){
      int digit = n % 10;
      sum += digit;
      n /= 10;
    }
    return sum;
  }
}
