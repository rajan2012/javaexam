package C5E09_Inheritance;

public class Parallelogram_Standalone {

		private Pt a,b,c,d;
		
		public Parallelogram_Standalone() { }
		public Parallelogram_Standalone
		(Pt p1, Pt p2, Pt p3){
		a=p1; b=p2; c=p3;
		int dx=c.getX()-b.getX();
		int dy=c.getY()-b.getY();
		d=new Pt(a.getX()+dx,
		a.getY()+dy);
		}
		
		public Pt getA() {return a;}
		public Pt getB() {return b;}
		public Pt getC() {return c;}
		public Pt getD() {return d;}
		
		public double area() {
			return a.getX() * b.getY()
			      +a.getY() * c.getX()
			      +b.getX() * c.getY()
			      -b.getY() * c.getX()
			      -a.getY() * b.getX()
			      -a.getX() * c.getY();}
			
		public double perimeter() {
			 return a.dist(b)+b.dist(c)
			       +c.dist(d)+d.dist(a);}
			
		public String toString(){
			return "PG["+a+","+b+","
			            +c+","+d+"]";}
}
