public class rectangle 
{
    private double width;
    private double length;



public rectangle(double width, double length)
{
this.width = width ;
this. length = length ;
}

public rectangle (rectangle rectangle)
{
    this.width = rectangle.length;
    this.length = rectangle.width;
}

public static void main(String[] args)
{
    rectangle r1 = new rectangle(12.5,5);
    
        System.out.println("r1 width:" +r1.width);
        System.out.println("r1 length:" +r1.length);

        rectangle r2 = new rectangle (r1);

        System.out.println("r2 width:" +r2.width);
        System.out.println("r2 length:" +r2.length);

    
}
}
