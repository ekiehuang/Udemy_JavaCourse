import java.util.Scanner;

public class MaxMinChallenge {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    while(true){
      System.out.println("Enter number:");
      boolean isDigit = scanner.hasNextInt();
      if(isDigit) {
        int num = scanner.nextInt();
        max = Math.max(num, max);
        min = Math.min(num, min);
      }else break;
      scanner.nextLine();
    }
    scanner.close();
    System.out.println("the max is "+ max +", the min is "+ min);
  }
}
