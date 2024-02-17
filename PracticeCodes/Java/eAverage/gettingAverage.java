package eAverage;

public class gettingAverage 
{
    public static void main(String[] args)
    {
        int grade1 = 88;
        int grade2 = 90;
        int grade3 = 96;

        System.out.println("Grade 1 = " + grade1);
        System.out.println("Grade 2 = " + grade2);
        System.out.println("Grade 3 = " + grade3);

        float ave = (grade1 + grade2 + grade3)/3;

        System.out.println("The Average is " + ave);
    }
}