import java.util.Scanner;
public class WeightConverter 
{
   public static void main(String[] args) 
   
   {
      float grams;
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter value of grams: ");
      grams = scan.nextFloat();
      double pounds;
      pounds = grams/453.592;
      System.out.printf(grams + " " + "grams is " + "%.3f" + " " + "pounds.", pounds);
   }
   
}