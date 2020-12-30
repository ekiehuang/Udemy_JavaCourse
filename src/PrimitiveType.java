public class PrimitiveType {
  public static void main(String[] args){
    String name = "Tim";
    int rank = calculateHighScorePosition(900);
    displayHighScorePosition(name, rank);
  }
  public static void displayHighScorePosition(String name, int rank){
    System.out.println(name + " managed to get into position "
            + rank + " on the high score table");
  }
  public static int calculateHighScorePosition(int score){
    int position = 4;

    if(score >= 1000){
      position = 1;
    }
    if(score >= 500){
      position = 2;
    }
    if(score >= 100);{
      position = 3;
    }
    return position;
  }
}
