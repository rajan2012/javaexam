package C5E11_References;

public class Parallelogram extends Quadrilateral
{
		public Parallelogram() { }
		public Parallelogram
		(Pt p1, Pt p2, Pt p3){
		super(p1,p2,p3,
			  new Pt(p1.getX()+p3.getX()-p2.getX(),
			  p1.getY()+p3.getY()-p2.getY()));
		}
		
		public double area() {
			return getA().getX() * getB().getY()
			      +getA().getY() * getC().getX()
			      +getB().getX() * getC().getY()
			      -getB().getY() * getC().getX()
			      -getA().getY() * getB().getX()
			      -getA().getX() * getC().getY();}
			
		public String toString(){
			return "PG"+super.toString();}
}
