class data
{
	int l = 5;
	int b = 4;
	int h = 3;
	int bs = 5;
	void values()
	{
	System.out.println("values of lenghth,breadth and height");
	System.out.println("values of lenghth = " + l);
	System.out.println("values of Breadth = " + b);
	System.out.println("values of Height = " + h);
	System.out.println("*******");
	System.out.println();
	
	}
}

class Square extends values
{   
	
	void square()
	{
    System.out.println("Lenght of a side = " + l);
	System.out.println("Area of Square = " + (l*l));
	}
}
class Rect extends values
{   
	
	void rect()
	{
    System.out.println("Lenght = " + l);
	System.out.println("breadth = " + b);
	System.out.println("Area of Rectangle = " + (l*b));
	}
}
class Triangle extends values
{   
	
	void tri()
	{
    System.out.println("Height of a triangle = " + h);
	System.out.println("Base of a triangle = " + bs);
	System.out.println("Area of Trianagle = " + (0.5*bs*h));
	}
}

	
	
	class Inherit_shapes 
{
	public static void main(String[] args) 
	{
		Square s = new Square();
		s.values();
		s.square();
		System.out.println("*******");

		Rect r = new Rect();
		r.values();
		r.rect();
		System.out.println("*******");

		Triangle t = new Triangle();
		t.values();
		t.tri();


	}
}
