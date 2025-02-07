package C5E12_ReferenceCast;

public class ReferenceCast { 

   public static void main( String[] args ) {

      Pt a=new Pt(0,0), b=new Pt(1,0), c=new Pt(1,1), d=new Pt(0,1);

      Quadrilateral  qlRef  = new Parallelogram(a,b,c);
      
      Parallelogram pgRef = new Parallelogram();

      if ( qlRef instanceof Parallelogram ) 
         pgRef = (Parallelogram) qlRef;
 
      System.out.println( qlRef.toString()
         + "\n  call toString() of the class Parallelogram" 
         + "\n  superclass reference to subclass object\n\n");
 
      System.out.println( pgRef.toString()
         + "\n  call toString() of the class Parallelogram" 
         + "\n  superclass reference to subclass object "
         + "cast to Parallelogram\n");   
   }
}

