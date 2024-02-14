package baInstantiation;

public class Instantiation {
    
    public static void main(String[] args)
    {
        Rectangle rec = new Rectangle();

        rec.length = 20;
        rec.width = 10;

        rec.computeArea();
        rec.computePerimeter();
    }
}
