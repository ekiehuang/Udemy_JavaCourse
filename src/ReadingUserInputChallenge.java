import java.util.Scanner;

public class ReadingUserInputChallenge {
  public static void main(String[] args){
    int count = 1;
    int sum = 0;
    Scanner scanner = new Scanner(System.in);;
    while(count <= 10){
       System.out.println("Enter number #"+ count);
       boolean isDigit = scanner.hasNextInt();
      if(isDigit){
        int digit = scanner.nextInt();
        sum += digit;
        count++;
      }else {
        System.out.println("Invalid number");
      }
      scanner.nextLine();
    }
    scanner.close();
    System.out.println("The sum is "+ sum);
  }
}
