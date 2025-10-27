package B_OOPFundamental;

public class e_Rectangle_AreaCalculationForBasicOOPLogic {
	
	private d_Length_AreaCalculationForBasicOOPLogic width;
	private d_Length_AreaCalculationForBasicOOPLogic height;
	private String color;
	
	public e_Rectangle_AreaCalculationForBasicOOPLogic(d_Length_AreaCalculationForBasicOOPLogic width,
			d_Length_AreaCalculationForBasicOOPLogic height, String color) {
		super();
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public d_Length_AreaCalculationForBasicOOPLogic getLength() {
		return width;
	}

	public void setLength(d_Length_AreaCalculationForBasicOOPLogic length) {
		this.width = length;
	}

	public d_Length_AreaCalculationForBasicOOPLogic getHeight() {
		return height;
	}

	public void setHeight(d_Length_AreaCalculationForBasicOOPLogic height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void AreaCalculation() {
		width.convertInches();
		int area = width.convertInches() * height.convertInches();
		d_Length_AreaCalculationForBasicOOPLogic length = new d_Length_AreaCalculationForBasicOOPLogic();
		// output မှာ ဘယ်လိုဖြစ်ပြီး 31' 6" ဆိုပြီး ထွက်လာရလဲဆိုရင်တော့ d_Length_AreaCalculationForBasicOOPLogic Class ထဲက
		// convertLength ကို တိုက်ရိုက်ခေါ်တဲ့အခါမှာ area keyword နဲ့ အောက်မှာ Parameter Passing ပေးလိုက်တဲ့ area တန်ဖိုးက
		// တစ်ဖက် Class ထဲက parameter in အထဲကို ဝင်သွားပြီး အဲ့ဒီ int ကို တစ်ဖက် Class ရဲ့ သူ့ Method ထဲမှာပဲ 
		// Object အသစ် ဆောက်ထားသည့် length = new d_Length_AreaCalculationForBasicOOPLogic(in/IN_CONST, in%IN_CONST)
		// ဆိုတဲ့ in/IN_CONST, in%IN_CONST တန်ဖိုးတွေထဲဝင်သွားပြီး သူတို့ဟာ main Class Variables တွေကို ပွားထုတ်ပြီး feet နဲ့ inches နေရာမှာ တန်ဖိုးအသီးသီးဝင်သွားကြကာ
		// အဲ့ Class ရဲ့ return က length ဆိုတဲ့ Object ကြီး return ပြန်တာဆိုတော့ အဲ့တာကို output ထုတ်လိုက်တဲ့အခါ
		// တစ်ဖက် Class ရဲ့ အောက်ဆုံးက toString() Method က အလုပ်လုပ်သွားတာဖြစ်ပါတယ်
		// toString က သူ့ထဲမှာ feet, inches တန်ဖိုးပါနေတော့ parameter ထဲကပါလာတဲ့ ဒီ in/IN_CONST, in%IN_CONST တန်ဖိုး ၂ ခုက
		// feet, inches ထဲ အသီးသီးဝင်သွားပြီး output ထွက်လာတာဖြစ်တယ်
		System.out.println("Area" + length.convertLength(area));
	}
	
	@Override
	public String toString() {
		return "e_Rectangle_AreaCalculationForBasicOOPLogic [length=" + width + ", height=" + height + ", color="
				+ color + "]";
	}
	
	
	

}
