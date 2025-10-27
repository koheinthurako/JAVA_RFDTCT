package B_OOPFundamental;

public class f_RectangleTest_AreaCalculationForBasicOOPLogic {
	
	public static void main (String [] args) {
		
		e_Rectangle_AreaCalculationForBasicOOPLogic rect = new e_Rectangle_AreaCalculationForBasicOOPLogic(new d_Length_AreaCalculationForBasicOOPLogic(1, 2), 
															new d_Length_AreaCalculationForBasicOOPLogic(2, 3), "Black");
		System.out.println(rect);
		rect.AreaCalculation();
		
	}

}
