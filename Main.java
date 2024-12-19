/**
   This program demonstrates the for loop.
*/

public class Main
{
   public static void main(String [] args)
   {

      System.out.println("Number   Number Squared");
      System.out.println("-----------------------");
      
      for (int number = 1; number <= 10; number++)
      {
         System.out.println(number + "\t\t" +
                            number * number);
      }
   }
}
