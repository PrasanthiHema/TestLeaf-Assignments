package week3.day4;

public class MethodOveridingSubclass extends MethodOveridingBaseclass {

	public void submethod() {
		System.out.println("This is sub method");

	}

	public void basemethod() {
		super.basemethod();
		System.out.println("Base class method is overriden");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating obj for subclass
		MethodOveridingSubclass objsub = new MethodOveridingSubclass();

		objsub.basemethod();
		objsub.submethod();

		// creating object for baseclass
		//MethodOveridingBaseclass objbase = new MethodOveridingBaseclass();
		//objbase.basemethod();

	}

}
