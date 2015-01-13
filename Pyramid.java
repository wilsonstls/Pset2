package pset2;
import java.io.*;
/**
*1/11/15
*generates an object string of a Pyramid shape. 
*/

public abstract class Pyramid 
{  
      public abstract Pyramid pyramidCharacter();       // Abstract method
  
      protected String keysign;

      public String pyramid(String keysign)     // Concrete method
       {
         this.keysign = keysign;
         int high =10;       // hard coded for height of 10 rows
         int ht, indx, r, s; 
         StringBuilder sb = new StringBuilder();
         for (r = high; r > 0; r--)                // loop to generate num of rows for height
         {indx = 0;        
            for (s = 1; s < r; s++)               // first print blank spaces on a line
             {
               sb.append(" ");
               indx = s;                           // set index holder where spaces on line end
             }
              for (ht = indx; ht < high; ht++)    // begin printing (sign) to fill in rest of the line
              {              
                 sb.append(keysign);
              }       
            sb.append("\n");        // line break
          }  
         return sb.toString();
       }  

      @Override
      public abstract String toString();     // Abstract method

}   // close abstract class
 

class PercentSignPyramid extends Pyramid 
{ 
   @Override 
   public Pyramid pyramidCharacter()
   {  
      return this;
   }

   @Override 
   public String toString()
   {
      return pyramid("%");
   }
}


class PoundSignPyramid extends Pyramid
{  
   @Override 
   public Pyramid pyramidCharacter()
   {
      return this;
   }

   @Override 
   public String toString()
   {
      return pyramid("#");
   }
}  
  

