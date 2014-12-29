package pset2;
import java.util.Scanner;
import java.util.Random;
import java.lang.*;

/*Pset2 for Java class
*Date:  12-22-2014
*By:  Kevin Wilson
*program generates 1-half of a pyramid populated with keyboard signs randomly selected.
*It will be printed either to the console or to a text file depending on user input at runtime.
*/

public class Mario
{

    public static void main(String[] varArgs) 
    {
        
        System.out.println("\n  The Pyramid Program !\n"); 
        System.out.println("\n  populated with keyboard signs randomly selected.\n"); 
        Scanner input = new Scanner(System.in);
        int sel;
        System.out.println("\n Pyramid can be printed to either the console screen or to a text file.\n");
               
            do 
             {
                System.out.println(" *** To be printed to the console enter  1 \n");
                System.out.println(" *** To be printed to a text file enter  2 \n");
                System.out.println("     Input your selection now  ");
                sel = input.nextInt();
                 
                if (sel != 1 && sel != 2)
                 {
                    System.out.print("\nInvalid selection!\n");
                 }

              }  
             while (sel != 1 && sel != 2);    //integer is neither 1 or 2


      //Random utility will select which keyboard sign to fill up pyramid
        Random rand = new Random();  
        int randNum = rand.nextInt(2) + 1;

        switch (randNum) 
        {
          case 1:
             System.out.println("\nPercentSigns %%  were randomly selected\n");
               Pyramid percentpyramid = new PercentSign();
               percentpyramid.pyramidCharacter();    // generates extend method
               percentpyramid.pyramidConcrete("%");  // generates object string
             break;
          case 2:
             System.out.println("\nPoundSigns ##  were randomly selected\n");
               Pyramid poundpyramid = new PoundSign();
               poundpyramid.pyramidCharacter();
               poundpyramid.pyramidConcrete("#");  
             break;
          default:
             System.out.println("\n  !! Error - keyboard sign cannot be selected !!");
             System.out.println("  !! The Pyramid program will come to an end !!");     
         }

     // select printing method
                    
        //   if (sel == 1)     //print to the console
        //     {
        //       PrintStrategy printstrategy1 = new ConsolePrint();                
        //       printstrategy1.print(????);
         //    }
         //  if (sel == 2)    //write to a text file
         //    {
        //       PrintStrategy printstrategy2 = new FilePrint();
        //       printstrategy2.print(pyramidCharacter);
         //    }  
     

    }   //closes main
}    //closes class Mario
     