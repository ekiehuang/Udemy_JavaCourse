public class SwitchChallenge {
  public static void main(String[] args){
    /*char ch = 'C';
    switch (ch){
      case 'A':
        System.out.println("Value was A");
        break;
      case 'B':
        System.out.println("Value was B");
        break;
      case 'C':
        System.out.println("Value was C");
        break;
      default:
        System.out.println("not A, or B, or C");
    }*/

  }
  public static void countPrime(int[] arr){
    int count = 0;
    for(int a: arr){
      if(isPrime(a)){
          count++;
          System.out.println(a);
        }
        if(count == 3){
          break;
        }
      }
    }

  private static boolean isPrime(int a) {
    if(a == 1){
      return false;
  }
    for(int i = 2;i <= a/2; i++){
      if(a % i == 0){
        return false;
      }
    }
    return true;
}
}
