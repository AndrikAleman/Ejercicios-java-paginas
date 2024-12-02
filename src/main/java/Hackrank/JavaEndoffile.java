package Hackrank;

import java.util.Scanner;

public class JavaEndoffile {

    public static void main(String[] args) {
        /* Enter your code here.
        Read input from STDIN.
        Print output to STDOUT.
        Your class should be named Solution. */
        int x = 0;
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
        {
            x += 1;
            System.out.println(x + " " + scan.nextLine());
        }


    }

}
