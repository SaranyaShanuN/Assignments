package week3.week3homeassignment;

public class InheritanceCheckbox extends InheritanceButton {

	public static void main(String[] args) {
		
		InheritanceCheckbox subclass3 = new InheritanceCheckbox();
		subclass3.clickCheckButton();
		subclass3.Submit();
			
	}
	public void clickCheckButton() {
		System.out.println("SubClasss 3 --- Click Checkbox button method");
		
	}
}
