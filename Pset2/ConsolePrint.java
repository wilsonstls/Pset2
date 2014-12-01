package pset2;
import java.io.File;
/**
* this program prints output to the screen
*/
public class ConsolePrint implements PrintStrategy
{
   public void selection(int high)
   {
      System.out.println("You selected to have the pyramid printed to the console !!\n");
      int indx;
      StringBuilder sb = new StringBuilder();
      
      for (int r = high; r > 0; r--)              // loop to generate num of rows for height
       {
         indx = 0;
                    
           for (int s = 1; s < r; s++)               // first print blank spaces on a line
            {
               System.out.print(" ");
               indx = s;                              // set index holder to index on line where spaces end

            }           
               for (int ht = indx; ht < high; ht++)   // begin printing # to fill in rest of the line
                {
                   System.out.print("#");

                }

          System.out.println(sb.toString());    
 
        }                                          // ends for loop that generates height 



   }
}

