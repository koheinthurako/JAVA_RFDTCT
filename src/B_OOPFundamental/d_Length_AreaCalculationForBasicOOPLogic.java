package B_OOPFundamental;

public class d_Length_AreaCalculationForBasicOOPLogic {

	private int feet;
	private int inches;
	public static final int IN_CONST = 12;
	
	public d_Length_AreaCalculationForBasicOOPLogic(){};
	
	public d_Length_AreaCalculationForBasicOOPLogic(int feet, int inches) {
		super();
		this.feet = feet;
		this.inches = inches;
	}
	
	public int getFeet() {
		return feet;
	}
	
	public void setFeet(int feet) {
		this.feet = feet;
	}
	
	public int getInches() {
		return inches;
	}
	
	public void setInches(int inches) {
		this.inches = inches;
	}
	
	public int convertInches() {
		return feet*IN_CONST + inches;
	}
	
	// ဒီနေရာမှာ သတိထားပါ သူ့ရဲ့ return ပြန်ပေးရမယ့်ဟာက Object ဖြစ်သည့်အတွက် Object ကို Method Datatype အနေနဲ့သုံးသွားတယ်
	public d_Length_AreaCalculationForBasicOOPLogic convertLength(int in) {
//		int ft = in/IN_CONST;
//		int i = in%IN_CONST;
		d_Length_AreaCalculationForBasicOOPLogic length = new d_Length_AreaCalculationForBasicOOPLogic(in/IN_CONST, in%IN_CONST);
		return length;
	}

	@Override
	public String toString() {
		return feet + "'" + inches + "\"";
	}

}
