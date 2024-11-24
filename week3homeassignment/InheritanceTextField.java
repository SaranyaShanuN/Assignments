package week3.week3homeassignment;

public class InheritanceTextField extends InheritanceWebElement {

	public static void main(String[] args) {
		
		InheritanceTextField subclass2 = new InheritanceTextField();
		subclass2.gettext();
		subclass2.click();
		subclass2.setText();
			
	}
	public void gettext() {
		System.out.println("SubClasss 2 --- Get text method");
		
	}
}
