/*
Example Output
What is the length of the room in feet? 15
What is the width of the room in feet? 20
You entered dimensions of 15 feet by 20 feet.
The area is
300 square feet
27.871 square meters
The formula for this conversion is m2 = f2 × 0.09290304
 */

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dilly Jacques
 */


package programming1;

import java.util.Scanner;

public class App {
    static double CONV=  0.09290304;
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        int length= in.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int width= in.nextInt();

        int area=length*width;
        double metric=area*CONV;

        String out="The area is" +"\n"+ area + " square feet";

        System.out.println(out);
        System.out.printf("%.3f square meters",metric);

    }
}
