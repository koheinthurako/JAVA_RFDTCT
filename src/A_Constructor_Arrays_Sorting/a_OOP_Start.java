package A_Constructor_Arrays_Sorting;

public class a_OOP_Start {

	public static void main(String[] args) {
		
		// Class ဆိုတာက Project တစ်ခုရဲ့ Plan တစ်ခုပဲ Object ကတော့ ထို Plan ကို အသုံးချပြီး Project ကိုရအောင်လုပ်တဲ့ Prototype တစ်ခုပါ
		
		int num = 5;
		// int က Primitive Data Types ထဲပါတဲ့အတွက် Variable လို့ခေါ်လို့ရတယ်
		String st = "hello";
		// String ကတော့ System Class သပ်သပ်ရှိတာမို့လို့ ဒီနေရာမှာသူ့ကို Object လို့ခေါ်တယ်
		// နောက်ပိုင်းမှာ ကိုယ်ရဲ့ Custom Data Types တွေကိုလည်း Class နဲ့ Object Concept ကနေ ဖန်တီးလို့ရတာမို့လို့ Class ဟာ Data Types ပါပဲ
		
		int std1_id = 1;
		int std1_age = 20;
		float std1_height = 5.6F;
		
		int std2_id = 2;
		int std2_age = 25;
		float std2_height = 5.9F;
		
		// ဉပမာ ကိုယ်က ကျောင်းသားအယောက် ၃၀ စာအတွက် Variables တွေ ပေးရတော့မယ်ဆိုရင် Line အများကြီးတန်းစီရေးရတော့မယ်
		// ပါတဲ့ ကျောင်းသားတွေရဲ့ information တွေက အတူတူတွေပဲကို အဲ့တာတွေကို ထပ်ခါထပ်ခါ ကျောင်းသားပေါ်လိုက်ပြီးပြောင်းနေရတာက ပင်ပန်းတယ်
		// ဒါကြောင့် အောက်က Student Class တစ်ခုသီးသန့်ဆောက်လိုက်ပြီး သူ့ကို Datatype အနေနဲ့အသုံးပြုကာ ဒီ Class ထဲမှာ Object ကနေတစ်ဆင့်
		// Student class ထဲက Variables တွေကို ယူသုံးလိုက်တယ်
		
		Student std1 = new Student();
		std1.id = 3;
		std1.age = 23;
		std1.height = 6.2F;
		
		// ဒါကြောင့်မို့ ကိုယ်ပိုင် Datatype std1 ဆောက်ပြီးသုံးလိုက်ခြင်းသည် Codeline လည်းလျော့ကျသွားပြီး ပိုအဆင်ပြေတယ်
		// မဟုတ်ရင် Codeline တွေအများကြီးနဲ့ Datatype အများကြီး ပြန့်ကျဲနေလိမ့်မယ်
		
		Student std2;
		BareClass class1;
		
	}
	
}

// Main class Scope အပြင်က တခြား Class တွေရဲ့ အရှေ့မှာ public keyword ထည့်မရတာကို သတိထားပါ ဘာလို့လဲဆိုတော့ ဒီ a_OOP_Start ဆိုတဲ့ java file ကို 
// public ထုတ်ပြီး Object အနေနဲ့ ခေါ်သုံးဖို့က သီးသန့်တစ်ခုတည်းဖြစ်မှရမှာပါ တစ်နေရာထဲမှာ public class တွေအများကြီးဖြစ်နေရင် ဘယ် class ကိုပြောမှန်းမသိပါ
class Student {
	int id;
	int age;
	float height;
	
	// void method သည် Return မပြန်ပါ
	void methodOne() {
		
	}
	
	// class တစ်ခုရဲ့ အတွင်းမှာ public class ထပ်ရေးရင်တော့ ရပါတယ်
	public class it1 {
		
	};
	
}

class BareClass {
	
}

