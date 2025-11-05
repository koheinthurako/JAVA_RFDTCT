package C_Inheritance;

import B_OOPFundamental.d_Length_AreaCalculationForBasicOOPLogic;

public class h_Abstract_ShapeTest {

	public static void main(String[] args) {
		
		// e_Abstract_Shape က Abstract class ဖြစ်သွားတဲ့အတွက် 
		// Abstract class ရဲ့ constructor ကနေတစ်ဆင့် Object ဆောက်လို့မရဘူး
		// Object ဆောက်လို့ရခဲ့မယ်ဆိုရင် သူကနေ အဲ့ထဲက method တွေကို ယူသုံးလို့ရသွားတာကြောင့် abstract class ရဲ့ method တွေသည်
		// implementation မပါဝင်တာကြောင့် အဲ့လို ယူသုံးလို့ရသွားတာက အဓိပ္ပာယ်မရှိဘူး
		// ဒါကြောင့် Parent class ထဲမှာ abstract method ပါနေရင် implementation ရေးရင်ရေး မရေးရင် Child class ကိုပါ abstract ပြောင်း
		// အဲ့လိုမှမဟုတ်ရင်တော့ Child class ကို inheritance ဆက်ခံတဲ့ Child class ထပ်ရေးပြီး အဲ့ထဲမှာ Parent Level Class
		// ထဲမှာ ရှိတဲ့ method ကို Override လုပ်ရေးပြီး implementation ထည့်
		
//		e_Abstract_Shape obj1 = new e_Abstract_Shape("White");
		// ဒါကြောင် အပေါ်လိုင်းလို Abstract class ရဲ့ constructor ကနေ Object ဆောက်လို့မရပါ
		
		e_Abstract_Shape obj2 = new i_Abstract_Child_Circle("Red", 
									new d_Length_AreaCalculationForBasicOOPLogic(2, 3)
								);
		e_Abstract_Shape obj3 = new g_Abstract_Square("Black", 
									new d_Length_AreaCalculationForBasicOOPLogic(2, 3)
								);
		
		e_Abstract_Shape [] objs = {obj2, obj3};
		
		for(e_Abstract_Shape obj : objs) {
			obj.area();
		}
		
	}

}
