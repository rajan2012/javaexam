package C5E14_Shape_Interface;

public class Quadrilateral implements Shape {

	private Pt a,b,c,d;
	
	public Quadrilateral() { }
	public Quadrilateral
	(Pt p1, Pt p2,
	 Pt p3, Pt p4){
	 a=p1; b=p2; c=p3; d=p4;
	}

	// implementation as before:
	
	public Pt getA() {return a;}
	public Pt getB() {return b;}
	public Pt getC() {return c;}
	public Pt getD() {return d;}
	
	// implementation of abstract methods:
	@Override
	public double perimeter() {
		return a.dist(b)+b.dist(c)
		 	  +c.dist(d)+d.dist(a);}
	
	@Override public String getName() { return this.getClass().toString(); }

	// overwrite the method inherited from Object :
	@Override
	public String toString() {
	 return "["+a+","+b+","
		       +c+","+d+"]";}
}
