package C5E13_Shape_Abstract;

public abstract class Shape {

	// concrete constructor:
	// for (usually implicit) calls by subclass constructors
	protected Shape() { }
	
	// abstract methods:
	
	public abstract double perimeter();
	
	// concrete methods:
	
	public String getName() 
	{
		return this.getClass().toString();
		// name of the class of an object, as String
	}
}
