package baInstantiation;


public class Rectangle 
{    
    double length;
    double width;

    public void computeArea()
    {
        double area = length * width;
        System.out.println("The Area of the rectangle is: " + area);
    }

    public void computePerimeter()
    {
        double perimeter = (2*length) + (2*width);
        System.out.println("The Perimeter of the rectangle is: " + perimeter);
    }
}

