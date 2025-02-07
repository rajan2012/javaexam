package C5E12_ReferenceCast;

public class Pt {
	private int x, y;
	
	public Pt(int xVal, int yVal){
	x = xVal ; y = yVal ; }
	
	public void setX( int xVal ) {x = xVal;}
	
	public void setY( int yVal ) {y = yVal;}
	
	public int getX() {return x;}
	public int getY() {return y;}
	
	public double dist(Pt p){
	return Math.sqrt((x-p.getX()) * (x-p.getX())
	                +(y-p.getY()) * (y-p.getY()));}
	
	public String toString() {return "("+x+";"+y+")";}
}
