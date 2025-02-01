public class Stack
{
	private Elem top = null;
	
	public void push(Integer value){
		Elem newElem = new Elem(value);
		newElem.next = top;
		top = newElem;
	}
	
	@Override public String toString(){
		Elem current = top;
		String result = "";
		while (current != null ){
		    result += " " + current.value;
		    current = current.next;
		}
		return "[" + result + " ]";
	}


	public Integer pop(){
	}
	

	public void invert(){
	
	}

   	public void removeZeroes(){
	
	}

 
}
