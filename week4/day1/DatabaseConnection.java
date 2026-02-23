package week4.day1;

public interface DatabaseConnection {

	 void connect();
	 void disconnect();
	 void executeUpdate();
	 default void implementmethod()
	 {
		System.out.println("Implementation method in Interface"); 
	 }
	 }
