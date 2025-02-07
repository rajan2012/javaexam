package C5E14_Shape_Interface;

public class Rectangle extends Parallelogram 
{
// new:
	public Rectangle() {}
	
	public Rectangle(Pt p1, Pt p2, Pt p3)
	{
		super(p1,p2,p3);
	}

	public double diag()
	{
		return Math.sqrt(
				(getA().getX()-getD().getX())*(getA().getX()-getD().getX())
			   +(getA().getY()-getD().getY())*(getA().getY()-getD().getY()));
	}

// overwritten (from Parallelogram):
	@Override
	public double area()
	{
		return Math.abs(getA().getX()-getB().getX())
			  *Math.abs(getA().getY()-getC().getY());
	}
	
	@Override
	public String toString()
	{
		return "Rect:"+super.toString();
	}
	
// inherited (from Quadrilateral): perimeter
// inherited (from Shape): getName

}
