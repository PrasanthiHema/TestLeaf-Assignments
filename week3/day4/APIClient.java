package week3.day4;

public class APIClient {
	
	public void sendRequest(String endpoint)
	{
		System.out.println("string input for endpoint: "+ endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, Boolean requestStatus)
	{
		System.out.println("string input for endpoint: "+ endpoint);
		System.out.println("string input for requestBody: "+ requestBody);
		System.out.println("Boolean input for requestStatus: "+ requestStatus);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create object
		APIClient objAPI = new APIClient();
		objAPI.sendRequest("https://api.github.com");
		objAPI.sendRequest("https://api.github.com", "username", true);

	}

}
