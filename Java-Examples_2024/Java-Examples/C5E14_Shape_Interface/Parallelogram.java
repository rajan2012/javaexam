package C5E14_Shape_Interface;

public class Parallelogram extends Quadrilateral
{
	// new constructors
	public Parallelogram() { }
	public Parallelogram
	(Pt p1, Pt p2, Pt p3){
	super(p1,p2,p3,
		  new Pt(p1.getX()+p3.getX()-p2.getX(),
		  p1.getY()+p3.getY()-p2.getY()));
	}
		
// new methods
	public double area() {
		return getA().getX() * getB().getY()
		      +getA().getY() * getC().getX()
		      +getB().getX() * getC().getY()
		      -getB().getY() * getC().getX()
		      -getA().getY() * getB().getX()
		      -getA().getX() * getC().getY();}
			
// inherited (from Shape): getName
		
// inherited (from Quadrilateral): perimeter
		
// overwritten (from Quadrilateral):
		
	public String toString(){
		return "PG"+super.toString();}
}
