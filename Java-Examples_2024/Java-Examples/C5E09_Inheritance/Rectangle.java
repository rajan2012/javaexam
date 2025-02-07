package C5E09_Inheritance;

public class Rectangle extends Parallelogram 
{
	public Rectangle() {}
	
	public Rectangle(Pt p1, Pt p2, Pt p3)
	{
		super(p1,p2,p3);
	}
	
	public double area()
	{
		return Math.abs(getA().getX()-getB().getX())
			  *Math.abs(getA().getY()-getC().getY());
	}
	
	public String toString()
	{
		return "Rect:"+super.toString();
	}
	
	public double diag()
	{
		return Math.sqrt(
				(getA().getX()-getD().getX())*(getA().getX()-getD().getX())
			   +(getA().getY()-getD().getY())*(getA().getY()-getD().getY()));
	}
	
	public static void main( String[] args ) {                         
	     System.out.println("Test method for class hierarchy.\n");
		     
	     Parallelogram rect=new Parallelogram(
				 				new Pt(0,0),
				 				new Pt(2,0),
				 				new Pt(2,2));
		 
		 System.out.println(rect);
		 System.out.println("area:  "+rect.area());
		 System.out.println("perim: "+rect.perimeter());
		}

}
