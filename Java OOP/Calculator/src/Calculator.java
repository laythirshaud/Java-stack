
public class Calculator {
	private double num1;
	private double num2;
	private double Oprator;
	private double result;
	
	
	public Calculator() {}


	
	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	
	public void setOprator(double Oprator) {
		this.Oprator = Oprator;
	}
	public void performOperation  () {
		if(this.Oprator=='+') {
		result=(num1)+(num2);}
		
	}
	public void getResult() {
		System.out.println(this.result);
		
	}


	
	
	

}
	
