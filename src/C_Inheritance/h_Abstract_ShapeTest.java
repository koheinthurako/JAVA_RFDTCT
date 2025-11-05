package C_Inheritance;

import B_OOPFundamental.d_Length_AreaCalculationForBasicOOPLogic;

public class h_Abstract_ShapeTest {

	public static void main(String[] args) {
		e_Abstract_Shape obj1 = new e_Abstract_Shape("White");
		f_Abstract_Circle obj2 = new f_Abstract_Circle("Red", 
									new d_Length_AreaCalculationForBasicOOPLogic(2, 3)
								);
		g_Abstract_Square obj3 = new g_Abstract_Square("Black", 
									new d_Length_AreaCalculationForBasicOOPLogic(2, 3)
								);
		
	}

}
