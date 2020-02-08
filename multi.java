interface i1
{
	double area();
}
interface i2
{
	double peri();
}
interface i3//multiple interface
{
	double volume();
}
class Circle implements i1,i2
{
	private double r;
	 public Circle()
	{
		r=0;
	}
	public Circle(double r)
	{
		this.r=r;
	}
	public double area()
	{
		return 3.14*r*r;
	}
	public double peri()
	{
		return 2*3.14*r;
	}
}
class square implements i1,i3
{
	private double r;
	 public square()
	{
		r=0;
	}
	public square(double r)
	{
		this.r=r;
	}
	public double area()
	{
		return 32;
	}
	public double volume()
	{
		return 3;
	}
}

	class Test5
{
	public static void main(String[] args)
	{
	
	square c=new Cylinder(10);
	System.out.println(c.area());
	System.out.println(c.volume());
	Circle c1=new Circle(10);
	System.out.println(c1.area());
	System.out.println(c1.peri());
	}
	
}
