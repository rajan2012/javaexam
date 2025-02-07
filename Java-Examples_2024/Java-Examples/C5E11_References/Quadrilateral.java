package C5E11_References;

public class Quadrilateral {

	private Pt a,b,c,d;
	
	public Quadrilateral() { }
	public Quadrilateral
	(Pt p1, Pt p2,
	 Pt p3, Pt p4){
	 a=p1; b=p2; c=p3; d=p4;
	}

	public Pt getA() {return a;}
	public Pt getB() {return b;}
	public Pt getC() {return c;}
	public Pt getD() {return d;}
	
	public double perimeter() {
		return a.dist(b)+b.dist(c)
		 	  +c.dist(d)+d.dist(a);}
		
	public String toString() {
	 return "["+a+","+b+","
		       +c+","+d+"]";}
}
