package week3.week3homeassignment;

public class PolymorphismAPIClient {

	public static void sendRequest(String Endpoint) {
		System.out.println(Endpoint);
		
	}

	public static void sendRequest(String Endpoint, String requestBody, Boolean Status) {
		System.out.print(Endpoint+"     ");
		System.out.print(requestBody+"     ");
		System.out.print(Status+"     ");
	}
	
	public static void main(String[] args) {
		
		PolymorphismAPIClient poly = new PolymorphismAPIClient();
		poly.sendRequest("Endpoint");
		poly.sendRequest("Endpoint","request body",false);

}
}