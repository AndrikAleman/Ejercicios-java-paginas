package Hackrank;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int breadth = scan.nextInt();

        scan.nextLine();

        int height = scan.nextInt();

        scan.close();

        if (breadth > 0 && height > 0)
        {
            int area = breadth * height;
            System.out.print(area);

        }
        else if (breadth <= 0 || height <= 0)
        {

            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }


    }
}
