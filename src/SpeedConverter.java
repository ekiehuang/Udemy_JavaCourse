public class SpeedConverter {
  public static void main(String[] args){
    System.out.println(toMilesPerHour(1.5));
    printConversion(1.5);
  }
  public static long toMilesPerHour(double kilometersPerHour){
    if(kilometersPerHour < 0){
      return -1;
    }
    long miles = Math.round (kilometersPerHour / 1.609);
    return Math.round(miles);
  }

  public static void printConversion(double kilometerPerHour){
    if(kilometerPerHour < 0){
      System.out.println("Invalid Value");
    }else{
      System.out.println(kilometerPerHour + " km/h = "+ Math.round(kilometerPerHour / 1.609) + " mi/h");
    }
  }
}
