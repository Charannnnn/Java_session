import java.util.*;

abstract class Figure
{
	int dim1;
	int dim2;
	Figure()
	{
		Scanner sc= new Scanner(System.in);
		dim1=sc.nextInt();
		dim2=sc.nextInt();
	}
	abstract double area();
}
class Rectangle extends Figure
{
	double area()
	{
		return dim1*dim2;
	}
}
class Triangle extends Figure
{
	double area()
	{
		return (dim1*dim2)/2;
	}
}
class Abstract
{
	public static void main(String args[])
	{
	Rectangle r=new Rectangle();
	Triangle t=new Triangle();
	
	System.out.println("Area of Rectangle is " + r.area() + " and Area of Triangle is " 
	+t.area());
	}
}		