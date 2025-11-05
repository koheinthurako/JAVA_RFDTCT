package C_Inheritance;

import B_OOPFundamental.d_Length_AreaCalculationForBasicOOPLogic;

public class i_Abstract_Child_Circle extends f_Abstract_Circle {

	public i_Abstract_Child_Circle(String color, d_Length_AreaCalculationForBasicOOPLogic radius) {
		super(color, radius);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void area() {
		System.out.println((PI *  radius.convertInches() * radius.convertInches()));
	}

}
