package week4.day1;

public class JavaConnection implements DatabaseConnection {
// implementing the abstract methods from interface in concrete class

	public void connect() {
		System.out.println("connect is an abstract method in Interface ");
	}

	public void disconnect() {
		System.out.println("disconnect is an abstract method in Interface ");
	}

	public void executeUpdate() {
		System.out.println("executeUpdate is an abstract method in Interface ");
	}

	public void implementmethod() {
		System.out.println("Implementation method is being overidden");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating object for concrete class

		JavaConnection obj = new JavaConnection();

		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
		obj.implementmethod();

	}

}
