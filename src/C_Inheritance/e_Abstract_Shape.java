package C_Inheritance;

public abstract class e_Abstract_Shape {
	
	protected String color;

	public e_Abstract_Shape(String color) {
		super();
		this.color = color;
	}
	
	// implementation မပါပဲ definition ပဲပါတာက abstract method, abstract ဆိုတဲ့ keyword ပါထည့်
	// abstract keyword ပါတဲ့ class တိုင်းကို abstract class လို့ခေါ်ပြီး abstract keyword class level မှာလည်း ထည့်ပေးရတယ်
	// ဒါကတော့ ပုံမှန်အတိုင်း Inheritance and Polymorphism ကိုသုံးပြီး e_Abstract_Shape class ထဲက area() method ကိုခေါ်ထားတာ
	// ဒါပေမယ့် Parent e_Abstract_Shape Class ထဲမှာ Area ဆိုတဲ့ Method ကို ဖျက်လိုက်မယ်ဆိုရင် အောက်က for loop ထဲမှာ obj.area() တွေက ခေါ်လို့မရတော့ဘူး
	// abstract class/method ကို ဘယ်လိုသုံးလဲဆိုရင် ဒီ Project ကြီးတစ်ခုလုံးမှာ ဘာ method တွေကိုတော့ ဘုံသုံးသင့်တယ်/ရှိသင့်တယ်ဆိုပြီးတော့
	// Frame ချခဲ့တာမျိုးဖြစ်ပြီး Implementation တွေကတော့ သူ့ရဲ့ သက်ဆိုင်ရာ Child class တွေကတစ်ဆင့် ကွဲသွားလိမ့်မယ်
	public abstract void area();

	@Override
	public String toString() {
		return "Color : " + color;
	}

}
