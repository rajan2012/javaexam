package C5E13_Shape_Abstract;

public class ShapeTest {

	public static void main(String[] args) {

		Quadrilateral ql = new Quadrilateral(new Pt(0,0),new Pt(1,0),
										     new Pt(1,1), new Pt(0,1));
		Parallelogram pg = new Parallelogram(new Pt(0,0),new Pt(2,0),
											 new Pt(2,2));
		Rectangle re = new Rectangle(new Pt(0,0),new Pt(3,0),
									 new Pt(3,3));
				
// usual access to methods of each class:
		System.out.println("\n\n" + ql.getName() + " (direct)\n"
		 + "[ " + ql.getA() + " , " + ql.getB()
		 + " , "+ ql.getC() + " , " + ql.getA() + "]");
		
		System.out.println("\n\n" + pg.getName() + " (direct)\n"
		 + "[ " + pg.getA() + " , " + pg.getB()
		 + " , "+ pg.getC() + " , " + pg.getD() + "]");
		
		 System.out.println("\n\n" + re.getName() + " (direct)\n"
		 + "[ " + re.getA() + " , " + re.getB()
		 + " , "+ re.getC() + " , " + re.getD() + "]");
	
		 Shape arrayOfShapes[] = new Shape[ 3 ];
		 arrayOfShapes[ 0 ] = ql; //assignment of subclass references!
		 arrayOfShapes[ 1 ] = pg;
		 arrayOfShapes[ 2 ] = re;
		 // access via concrete methods of Shape/Quadrilateral:
		 for ( int i = 0; i < arrayOfShapes.length; i++ ) {
			 System.out.println("\n\n"
				+ arrayOfShapes[ i ].getName() + " (via Shape)\n");
		 }
		 // use of overwritten methods:
		 for ( int i = 0; i < arrayOfShapes.length; i++ ) {
		 System.out.println("\n\n"
		 + arrayOfShapes[ i ].getName() + " (via Shape)\n"
		 + "\n" + arrayOfShapes[ i ].toString()
		 + "\nperimeter = " + arrayOfShapes[ i ].perimeter());
		 }
	}
	
}
