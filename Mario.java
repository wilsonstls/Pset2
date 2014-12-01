package pset2;
import java.util.Scanner;
/**
*Pset2 for Java class
*Date:  11-5-2014
*By:  Kevin Wilson
*program generates 1-half of a pyramid filled with hashtag systems (#) alined right justified.
*It will be printed either to the console or to a text file depending on user input at runtime.
*/

public class Mario
{
    public static void main(String[] varArgs) 
    {
        System.out.println("\nHalf of a pyramid, made out of hastag symbols, will be generated as a ");
        System.out.println("result of user input for height.");
        System.out.println("It will be printed right justified either to the console or to a text file,");
        System.out.println("depending on what the user decides.\n");
        Scanner input = new Scanner(System.in);
        int high;    // row height

           do
            {
              System.out.println("\nFor the height, enter a positive whole number that is less than 24  " ); 
              high = input.nextInt();
                   if (high > 23)
                    {
                       System.out.print("\nInvalid number!\n");
                    }
                   if (high < 0)
                    {
                       System.out.print("\nInvalid number!\n");
                    }

            }  while (high > 23 || high < 0);     //integer is either > 23 or < 0
     
        System.out.println("\nYou entered  " + high);


        if (!(high == 0))    //when height set to 0 is NOT true, continue    
         {
            int sel;    //integer for user input selection
            System.out.println("\nYour pyramid is now ready to be generated!\n");
            System.out.println("Do you want it to be printed to the console or to a text file?\n");
               
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

                }  while (sel != 1 && sel != 2);    //integer is neither 1 or 2

/*   the selection for output is either 1 or 2; output can now be generated */

               if (sel == 1)     //print to the console
                {
                   PrintStrategy printstrategy1 = new ConsolePrint();                
                   printstrategy1.selection(high);
                }

               if (sel == 2)    //write to a text file
                {
                   PrintStrategy printstrategy2 = new FilePrint();
                   printstrategy2.selection(high);

                }  

         }         //end if height Not 0
        
            if (high == 0 )    //when height set to 0 is true 
             { 
               System.out.println("\n!! A pyramid cannot be generated for " + high + " rows high!!");
             }   //end if height is 0

    }   //closes main
}    //closes class Mario
     