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
        System.out.println("\nHalf of a pyramid, made out of hastag symbols, will be generated.");
        System.out.println("The user will input the height.");
        System.out.println("It will be printed right justified either to the console or to a text file.");
        System.out.println("The user will input the printing method.\n");
        Scanner input = new Scanner(System.in);
        int high;

      //loop that ask for height of the pyramid
          
        do
         {
           System.out.println("\nFor the height, enter a whole number that is greater than 0 and less than 24  " ); 
           high = input.nextInt();
           if (high > 23)
             {
               System.out.print("\nInvalid number!\n");
             }
           if (high < 1)
             {
               System.out.print("\nInvalid number!\n");
             }

         }  while (high > 23 || high < 1);     //integer is either > 23 or < 1
     
        System.out.println("\nYou entered  " + high + " for the height\n");

      //select printing method
        int sel;
        System.out.println("Do you want the pyramid to be printed to the console or to a text file?\n");
               
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
           

       //generate the pyramid object
       
         Pyramid pyramid = new Pyramid(high); 

       //generate the pyramid output
             
         if (sel == 1)     //print to the console
          {
             PrintStrategy printstrategy1 = new ConsolePrint();                
             printstrategy1.print(pyramid.toString());
          }
         if (sel == 2)    //write to a text file
          {
             PrintStrategy printstrategy2 = new FilePrint();
             printstrategy2.print(pyramid.toString());
          }  
    
           
    }   //closes main
}    //closes class Mario
     