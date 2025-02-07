package C5E11_References;

public class References { 

   public static void main( String[] args ) {

      Pt a=new Pt(0,0), b=new Pt(1,0), c=new Pt(1,1), d=new Pt(0,1);
	   
// Superclass reference to Superclass object:
      Quadrilateral ql = new Quadrilateral(a,b,c,d);                      

// Subclass reference to Subclass object:
      Parallelogram pg = new Parallelogram(a,b,c); 

// Superclass reference to Subclass object:
      Quadrilateral qlRef = pg;       

// Subclass reference to Superclass object:
//     Parallelogram pgRef = ql; // compile error     


     System.out.println( ql.toString() +
         "\n (call toString() of the class Quadrilateral)\n\n");
 
      System.out.println( pg.toString() +
         "\n (call toString() of the class Parallelogram)\n\n");
     
      System.out.println( qlRef.toString() +
         "\n (call toString() of the class Parallelogram)\n\n");
   }
}
