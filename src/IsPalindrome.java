public class IsPalindrome {
  public static boolean isPalindrome(int num){
    if(num < 10 && num > -10){
      return true;
    }
    int reverse = 0;
    int original = num;
    while(num != 0){
      int digit = num % 10;
      reverse = reverse * 10 + digit;
      num /= 10;
    }
    return reverse == original;
  }
}
