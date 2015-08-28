
/**
 * 
 */

/**
 * @author Neha
 *
 */

public class Calculator 
{
	private double operand1;
	private int operation;
	private double operand2;
	String userChoice;
	
	public Calculator(){
		this.operand1=0.0;
		this.operation=0;
		this.operand2=0.0;
		this.userChoice="y";
	}

	public String getUserChoice() {
		return userChoice;
	}

	public void setUserChoice(String userChoice) {
		this.userChoice = userChoice;
	}
	
	public double getOperand1() {
		return operand1;
	}

	public void setOperand1(double operand1) {
		this.operand1 = operand1;
	}

	public int getOperation() {
		return operation;
	}

	public void setOperation(int operation) {
		this.operation = operation;
	}

	public double getOperand2() {
		return operand2;
	}

	public void setOperand2(double operand2) {
		this.operand2 = operand2;
	}

	public double addition(double num1, double num2){
		return num1 + num2;
	}
	
	public double subtraction(double num1, double num2){
		return num1 - num2;
	}
	
	public double multiplication(double num1, double num2){
		return num1 * num2;
	}
	
	public double division(double num1, double num2){
		if (num2==0){
			System.out.println("Division by Zero error");
			return 0;
		} else
			return num1 / num2;
	}
	
	public double modulus(double num1, double num2){
			return num1 % num2;
	}

}
