package pset2;
/**
*12/22/14
*Accepts a randomlly selected keyboard sign to generate an object of a Pyramid shape. 
*/

public abstract class Pyramid 
{  

    protected String keysign;

      
     public void pyramidConcrete(String keysign)
      {
         this.keysign = keysign;
      //   StringBuilder pyramidConcrete = new StringBuilder();
         int high =10;       // hard coded for height of 10 rows
         int ht, indx, r, s; 
         for (r = high; r > 0; r--)                // loop to generate num of rows for height
         {indx = 0;        
            for (s = 1; s < r; s++)               // first print blank spaces on a line
             {
                System.out.println("&");
             // pyramidConcrete.append("&");
              indx = s;                           // set index holder where spaces on line end
             }
             for (ht = indx; ht < high; ht++)    // begin printing (sign) to fill in rest of the line
              {              
                 System.out.println(keysign);
             //  pyramidConcrete.append(String keysigh);
              }       
                 System.out.println("/n");
          } 
       //     System.out.println(pyramidConcrete.toString());
         //    return PyramidConcrete();

      }

    public abstract void pyramidCharacter();
}

 

class PercentSign extends Pyramid 
{

   @Override 
   public void pyramidCharacter()
   {
   }

}


class PoundSign extends Pyramid
{
   @Override 
   public void pyramidCharacter()
   {
   }

}  
  

