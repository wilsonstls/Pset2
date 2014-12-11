package pset2;
import java.io.*;

/**
* this program accepts an object string and prints it to a txt file.
*/

public class FilePrint implements PrintStrategy
{
    public void print(String pyramid)
    {
      System.out.println("\nYou selected to have your output printed to a text file\n");
      File outfile = new File("c:/Launchcode/Pset2/pyramid.txt");

      try (PrintWriter fP  = new PrintWriter(outfile))
        {
           fP.println(pyramid.replaceAll("\n", "\r\n"));   // to be able to print to a file within the Windows OP system
         //fp.println(pyramid.toString());                // if not in Windows OP use this line
           System.out.println("The file " + outfile + " has successfully been written\n");
        }
         catch (IOException e)
             {
               System.out.println("\n!!! There is a problem with the output file !!!" + e.getMessage());
               e.printStackTrace();
             }
    }
}
