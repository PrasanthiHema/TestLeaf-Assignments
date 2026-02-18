package week3.day3;

public class ExecutionClass extends Button {
	private void elements()
	{
		System.out.println("All classes Executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating object for ExecutionClass
		System.out.println("ExecutionClass");
		ExecutionClass objExe = new ExecutionClass();
		objExe.click();
		objExe.setText(null);
		objExe.submit();
		objExe.elements();
		
		// creating obj for TextField
		TextField objText = new TextField();
        System.out.println("TextField");
        objText.click();
		objText.setText(null);
		objText.getText();
		
		//Checkbox button
		CheckBoxButton objCheck = new CheckBoxButton();
		System.out.println("Checkbox");
		objCheck.click();
		objCheck.setText(null);
		objCheck.submit();
		objCheck.clickCheckButton();
		
		//RadioButton
	
	    RadioButton objRadio= new RadioButton();
	    System.out.println("RadioButton");
		objRadio.click();
		objRadio.setText(null);
		objRadio.submit();
		objRadio.selectRadioButton();

		

	}

}
