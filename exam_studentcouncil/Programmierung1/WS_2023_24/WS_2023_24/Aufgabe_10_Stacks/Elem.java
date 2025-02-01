public class Elem
{
	public Integer value; // Wert
	public Elem next; // Referenz auf naechstes Element
	
	// Konstruktor
	Elem(Integer newValue){ 
		value = newValue; 
		next = null; 
	}
}
