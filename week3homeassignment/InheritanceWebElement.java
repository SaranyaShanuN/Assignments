package week3.week3homeassignment;

public class InheritanceWebElement {

	public static void click() {
		System.out.println("Super Class --- Click method");
		
	}

	public static void setText() {
		System.out.println("Super Class --- setText method");
		
	}
	
	public static void main(String[] args) {
		
		InheritanceWebElement superclass = new InheritanceWebElement();
		superclass.click();
		superclass.setText();

}
}