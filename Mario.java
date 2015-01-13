package pset2;
import java.util.Scanner;
import java.util.Random;

/*Pset2 for Java launchCode class
*Date:  1-11-2015
*By:  Kevin Wilson
*program generates 1-half of a pyramid populated with a keyboard sign that will be randomly selected at run time.
*It will be printed to either the console or to a text file depending on user input also at runtime.
*
*/

public class Mario
{

    public static void main(String[] varArgs) 
    {   
        System.out.println("\n  ! The Pyramid Program !\n"); 
        System.out.println("\n  populated with a keyboard sign selected randomly.\n"); 
        Scanner input = new Scanner(System.in);
        int selprint;

        System.out.println("\n Pyramid can be printed to either this console screen or to a text file.\n");
               
            do 
             {
                System.out.println(" *** To be printed to the console enter  1 \n");
                System.out.println(" *** To be printed to a text file enter  2 \n");
                System.out.println("     Input your selection now  ");
                selprint = input.nextInt();
                 
                if (selprint != 1 && selprint != 2)
                 {
                    System.out.print("\nInvalid selection!\n");
                 }
              }  
             while (selprint != 1 && selprint != 2);    //integer is neither 1 or 2

             PrintStrategy printstrategy1 = new ConsolePrint();   
             PrintStrategy printstrategy2 = new FilePrint();


      //Random utility will select which keyboard sign to fill up pyramid
      // 1 = %
      // 2 = #
        Random rand = new Random();  
        int randNum = rand.nextInt(2) + 1;

        switch (randNum) 
        {
          case 1:
             System.out.println("\nPercentSigns %%  were randomly selected\n");
             Pyramid percentpyramid = new PercentSignPyramid(); 
                     percentpyramid.pyramidCharacter();    
                if (selprint == 2)  
                { printstrategy2.print(percentpyramid);         
                }  else
                  printstrategy1.print(percentpyramid); 
             break;
          case 2:
             System.out.println("\nPoundSigns ##  were randomly selected\n");
             Pyramid poundpyramid = new PoundSignPyramid();
                     poundpyramid.pyramidCharacter(); 
               if (selprint == 2)   
                { printstrategy2.print(poundpyramid);
                }  else
                  printstrategy1.print(poundpyramid);
             break;
          default:
             System.out.println("\n  !! Error - keyboard sign cannot be selected !!");
             System.out.println("  !! The Pyramid program will come to an end !!");     
         }

    }   //closes main
}    //closes class Mario
     