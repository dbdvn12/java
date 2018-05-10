
public class Calculator {
	double a,b;
	String oper;
	String calculation;
	public void setOperands(double a, double b) {
		this.a=a;
		this.b=b;
	}

	public void setOperator(String oper) {
		this.oper=oper;		
	}

	public void doCalculation() {
		switch(oper) {
			case "+": {
				calculation=a+oper+b+"="+(a+b);
				break;
			}
			case "-": {
				calculation=a+oper+b+"="+(a-b);
				break;
			}
			case "*": {
				calculation=a+oper+b+"="+(a*b);
				break;
			}
			case "/": {
				calculation=a+oper+b+"="+(a/b)*1.0;
				break;
			}
		}
	}
	@Override
	public String toString() {	
		return calculation;
	}
	
}
