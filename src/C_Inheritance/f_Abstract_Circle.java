package C_Inheritance;
import B_OOPFundamental.d_Length_AreaCalculationForBasicOOPLogic;

public abstract class f_Abstract_Circle extends e_Abstract_Shape {
	
	d_Length_AreaCalculationForBasicOOPLogic radius;
	public static final double PI = 3.14;

	public f_Abstract_Circle(String color, d_Length_AreaCalculationForBasicOOPLogic radius) {
		super(color);
		this.radius = radius;
	}
	
//	@Override
	// Parent class ထဲမှာ abstract method ပါနေရင် implementation ရေးရင်ရေး မရေးရင် Child class ကိုပါ abstract ပြောင်း
	public double area1() {
		return (PI *  radius.convertInches() * radius.convertInches());
	}

	@Override
	public String toString() {
		return super.toString() + "";
	}
	
	
}
