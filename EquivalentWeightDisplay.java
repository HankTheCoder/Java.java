import java.util.Scanner;
public class EquivalentWeightDisplay
{
   public static void main(String[] args)
   
  {
      double milligrams;
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter value of milligrams: ");
      milligrams = scan.nextDouble();
      int milli = (int)milligrams;
      
      double kilograms = milligrams/1000000;
      int kilos = (int)kilograms;
      
      double milligram_remainder = milligrams%1000000;
      int milligramo_remainder = (int)milligram_remainder;
      
      
      double grams = milligram_remainder/1000;
      int gramos = (int)grams;
      
      double milligramo = milligramo_remainder - gramos*1000;
      int milligramos = (int)milligramo; 
      
      
      System.out.println(milli + " " + "milligrams is equivalent to " + kilos + " " + "kilograms, " + gramos + " " + "grams, and " + milligramos + " " + "milligrams.");
  }
   
}