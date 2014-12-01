package pset2;
import java.io.*;
/**
* this program generates output to a txt file
*/
public class FilePrint implements PrintStrategy
{
   public void selection(int high)
   {
      System.out.println("\nYou selected to have your output printed to a text file\n");
      File outfile = new File("c:/Launchcode/Pset2/pyramid.txt");
      int indx;
      StringBuilder sb = new StringBuilder();

      try 
        {
          PrintWriter pw  = new PrintWriter(outfile); 

            for (int r = high; r > 0; r--)             // loop to generate num of rows for height
              {
                 indx = 0;
                    
                     for (int s = 1; s < r; s++)              // first print blank spaces on a line
                       {
                          pw.print(" ");
                          indx = s;                            // set index holder to index on line where spaces end
                       }           
 
                         for (int ht = indx; ht < high; ht++)   // begin printing # to fill in rest of the line
                           {
                              pw.print("#");
                           }

                  pw.println(sb.toString());   
               }   
                       
            pw.close();
            System.out.println("The file " + outfile + " has successfully been written\n");
          }

        catch (FileNotFoundException e)
          {
             System.out.println("\n!!! There is a problem finding the file !!!" + e.getMessage());
          }
                   
   }
}