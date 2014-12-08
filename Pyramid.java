package pset2;
/**
*Accepts a height parameter to generate an object of a Pyramid. 
*Override the loop to produce a string representation of the object.
*/
class Pyramid 
{
    private int height;

    public Pyramid(int height)
    {
       this.height = height;
    }

    @Override
    public String toString()
    {

        StringBuilder pyramid = new StringBuilder();
        int indx;
        for (int r = height; r > 0; r--)              // loop to generate num of rows for height
        {
           indx = 0;
                    
           for (int s = 1; s < r; s++)               // first print blank spaces on a line
            {
              pyramid.append(" ");
              indx = s;                              // set index holder to index on line where spaces end
            }           
            for (int ht = indx; ht < height; ht++)   // begin printing # to fill in rest of the line
            {
               pyramid.append("#");
            }

          pyramid.append("\n");      // line break
         }
     
      return pyramid.toString();   
     
    } 
} 
   