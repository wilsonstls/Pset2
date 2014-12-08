package pset2;
import java.io.File;
/**
* this program accepts an object string and prints it to the screen  .
*/

public class ConsolePrint implements PrintStrategy
{
   
    public void print(String Pyramid)
    {
      System.out.println("You selected to have the pyramid printed to the console !!\n");
      System.out.println(Pyramid.toString());    

    }
}

