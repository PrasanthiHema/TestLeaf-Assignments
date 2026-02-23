package week4.day1;

public class NewJavaConnection extends MySqlConnection
//Implementations for the abstract methods created in Interface 
{
	public void connect() {
		System.out.println("connect is an abstract method in Interface ");
	}

	public void disconnect() {
		System.out.println("disconnect is an abstract method in Interface ");
	}

	public void executeUpdate() {
		System.out.println("executeUpdate is an abstract method in Interface ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating the objects in concrete class
		NewJavaConnection obj = new NewJavaConnection();
		obj.connect();
		obj.disconnect();
		obj.executeQuery();
		obj.executeUpdate();

	}

}
