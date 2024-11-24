package week3.week3homeassignment;

public class InheritanceButton extends InheritanceWebElement{
	
	public void Submit() {
		System.out.println("SubClasss 1 --- Submit button method");
		
	}

	public static void main(String[] args) {
		
		InheritanceButton subclass1 = new InheritanceButton();
		subclass1.Submit();
		subclass1.click();
		subclass1.setText();
			
	}


}
