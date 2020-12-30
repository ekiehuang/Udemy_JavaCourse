public class SumFirstAndLastDigit {
  public static int sumFirstLast(int num){
    String str = String.valueOf(num);
    char first = str.charAt(0);
    char last = str.charAt(str.length()-1);
    if(first == '-'){
      return -1;
    }
    int firstDig = first - '0';
    int lastDig = last - '0';
    return firstDig + lastDig;
  }
}
