package fConditionalIfElse;

import java.util.*;


public class Input 
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name to Print: ");

        String name = sc.nextLine();
        System.out.println("Number of times to print: ");

        int number = sc.nextInt();

        if(number <= 4)
        {
            System.out.println(name);
        }

        else if(number > 4) 
        {
            int i = 0;
            while (i<number)
            {
                System.out.println(name);
                i++;
            }
        }


    }
}
