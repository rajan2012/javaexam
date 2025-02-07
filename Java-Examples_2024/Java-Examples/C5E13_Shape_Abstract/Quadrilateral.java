package C5E13_Shape_Abstract;

public class Quadrilateral extends Shape {

	private Pt a,b,c,d;
	
	public Quadrilateral() { }
	public Quadrilateral
	(Pt p1, Pt p2,
	 Pt p3, Pt p4){
	 a=p1; b=p2; c=p3; d=p4;
	}

	// overwrite abstract methods with concrete methods
	@Override
	public double perimeter() {
		return a.dist(b)+b.dist(c)
		 	  +c.dist(d)+d.dist(a);}
	
	// additional methods:
	
	public Pt getA() {return a;}
	public Pt getB() {return b;}
	public Pt getC() {return c;}
	public Pt getD() {return d;}
	
	@Override
	public String toString() {
	 return "["+a+","+b+","
		       +c+","+d+"]";}
}
