package cSimpleAddition;

public class Practice2Main {
    
    public static void main (String args[]){

        Practice2 Obj = new Practice2();
        double result;

        Obj.practice(5);
        Obj.practice(5,10);

        result = Obj.practice(5.5);
        System.out.println("Result is: " + result);
    }

}
