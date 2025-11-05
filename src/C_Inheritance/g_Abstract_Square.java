package C_Inheritance;

import B_OOPFundamental.d_Length_AreaCalculationForBasicOOPLogic;

public class g_Abstract_Square extends e_Abstract_Shape {
	
	d_Length_AreaCalculationForBasicOOPLogic width;

	public g_Abstract_Square(String color, d_Length_AreaCalculationForBasicOOPLogic radius) {
		super(color);
	}
	
//	@Override
	public void area() {
		System.out.println(width.convertInches() * width.convertInches());
	}

}
