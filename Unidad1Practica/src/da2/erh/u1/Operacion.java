package da2.erh.u1;

import java.io.Serializable;

public class Operacion implements Serializable{
	private double value1;
	private double result;

	
	public void setResult() {
		return result;
	}

	public double getValue1() {
		return value1;
	}

	public void setValue1(double value1) {
		this.value1 = value1;
	}
	
	public double getResult() {
		 return ((7*(value1*value1))+(6*value1)-1)-((3*value1)-5*(value1*value1)+4-(value1*value1*value1));
		}
	
}
