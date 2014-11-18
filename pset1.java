package pyramidbuilder;

import java.util.Scanner;
import java.io.*;

/**
 * Pset1 for Java class
 * Date:  11-5-2014
 * By:  Kevin Wilson
 * program generates 1-half of a pyramid filled in with hashtag systems (#).
 * It is to be printed right justified either to the console or to a text file.
 */

public class Pset1 {
    public static void main(String[] varArgs) {
        System.out.println("\nHalf of a pyramid, made out of hastag symbols, will be generated as a ");
        System.out.println("result of user input for height.");
        System.out.println("It will be printed right justified either to the console or to a text file,");
        System.out.println("depending on what the user decides.\n");

        StringBuilder sb = new StringBuilder();
        File outfile = new File("pyramid.txt");
        Scanner input = new Scanner(System.in);
        int high;    // row height
        int indx;    // index holder

        do {
            System.out.println("\nFor the height, enter a positive whole number that is less than 24  ");
            high = input.nextInt();
            if (high > 23) {
                System.out.print("\nInvalid number!\n");
            }
            if (high < 0) {
                System.out.print("\nInvalid number!\n");
            }

        } while (high > 23 || high < 0);     //integer is either > 23 or < 0

        System.out.println("\nYou entered  " + high);


        if (!(high == 0))    //when height set to 0 is NOT true, continue    
        {
            int sel;    //integer for user input selection
            System.out.println("\nYour pyramid is now ready to be generated!\n");
            System.out.println("Do you want it to be printed to the console or to a text file?\n");

            do {
                System.out.println(" *** To be printed to the console enter  1 \n");
                System.out.println(" *** To be printed to a text file enter  2 \n");
                System.out.println("     Input your selection now  ");
                sel = input.nextInt();

                if (sel != 1 && sel != 2) {
                    System.out.print("\nInvalid selection!\n");
                }

            } while (sel != 1 && sel != 2);    //integer is neither 1 or 2

            if (sel == 1)     //print to the console
            {
                System.out.println("\nYou selected to have your output printed to the console");
                System.out.println("\nHere is a half pyramid that is " + high + " rows high and is right justified\n");

                for (int r = high; r > 0; r--)             // loop to generate num of rows for height
                {
                    indx = 0;

                    for (int s = 1; s < r; s++)              // first print blank spaces on a line
                    {
                        System.out.print(" ");
                        indx = s;                            // set index holder to index on line where spaces end
                    }

                    for (int ht = indx; ht < high; ht++)   // begin printing # to fill in rest of the line
                    {
                        System.out.print("#");
                    }

                    System.out.println(sb.toString());    // outputs to the console

                }   //ends for loop that generates height

            }     //end if sel = 1


            if (sel == 2)   //write to a text file
            {
                System.out.println("\nYou selected to have your output printed to a text file\n");

                try {
                    PrintWriter pw = new PrintWriter(outfile);

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

                        pw.println(sb.toString());    // outputs to a txt file

                    }   //ends for loop that generates height

                    pw.close();
                    System.out.println("The file " + outfile + " has successfully been written\n");
                } catch (FileNotFoundException e) {
                    System.out.println("\n!!! There is a problem finding the file !!!" + e.getMessage());
                }


            }      //end if sel = 2

        }         //end if height Not 0


        if (high == 0)    //when height set to 0 is true
        {
            System.out.println("\n!! A pyramid cannot be generated for " + high + " rows high!!");
        }   //end if height is 0

    }   //closes main
}    //closes class Pset1
     