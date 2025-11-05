package C_Inheritance;
import B_OOPFundamental.d_Length_AreaCalculationForBasicOOPLogic;

public class f_Abstract_Circle extends e_Abstract_Shape {
	
	d_Length_AreaCalculationForBasicOOPLogic radius;
	public static final double PI = 3.14;

	public f_Abstract_Circle(String color, d_Length_AreaCalculationForBasicOOPLogic radius) {
		super(color);
		this.radius = radius;
	}
	
	

}
