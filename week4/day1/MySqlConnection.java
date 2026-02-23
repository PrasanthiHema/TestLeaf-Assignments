package week4.day1;

public abstract class MySqlConnection implements DatabaseConnection{
	public void executeQuery() {
		System.out.println("MySqlConnection is a method in abstract class ");
	}

}
