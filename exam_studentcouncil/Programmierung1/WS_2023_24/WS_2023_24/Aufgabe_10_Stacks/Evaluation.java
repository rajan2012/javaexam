import java.util.Scanner;

public class Evaluation {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		if (testCase == 1 ) {
		    Stack st = new Stack();
		    st.push(5);
		    st.push(10);
		    st.push(15);
		    System.out.println("Startwerte: " + st);
		    System.out.println("Resultat: "
				+ st.pop() + " "
				+ st.pop() + " "
				+ st.pop() + " "
				+ st.pop() );
		}
		
		
		if (testCase == 2 ) {
		    Stack st = new Stack();
		    st.push(0);
		    st.push(2);
		    st.push(1);
		    st.push(0);
		    st.push(-3);
		    st.push(-4);
		    System.out.println("Startwerte: " + st);
		    st.invert();
		    System.out.println("Resultat: " + st);
		}
		
		if (testCase == 3 ) {
		    Stack st = new Stack();
		    st.push(0);
		    st.push(0);
		    st.push(2);
		    st.push(0);
		    st.push(1);
		    st.push(0);
		    st.push(0);
		    System.out.println("Startwerte: " + st);
		    st.removeZeroes();
		    System.out.println("Resultat: " + st);
		}
		
		if (testCase == 4 ) {
		    Stack st = new Stack();
		    st.push(0);
		    st.push(0);
		    st.push(0);
		    System.out.println("Startwerte: " + st);
		    st.removeZeroes();
		    System.out.println("Resultat: " + st);
		}
		
		
		
	}

}
