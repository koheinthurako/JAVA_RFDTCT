package A_Constructor_Arrays_Sorting;

public class c_PersonTest {

	public static void main(String[] args) {
		
		// Object ဆောက်လို့ရှိရင် Java မှ Auto ရေးထားသည့် Constructor ကို ခေါ်သည်
		// အကယ်လို့ Constructor ကို ကိုယ့်ဘာသာ တန်ဖိုးတွေ သတ်မှတ်ပြီး Customize ထပ်ရေးချင်လည်းရတယ်
		// သို့သော် Class ထဲမှာ Default Constructor ရေးထားတာမရှိပဲ Modify Customize Arguments Constructor တွေရှိပြီဆိုရင် အဲ့အတိုင်း
		// Object ကိုလိုက်ဆောက်ပေးရတယ် (parameters) တွေကို Constructor Arguments တွေအတိုင်းလိုက်ထည့်ပေးရတယ်
		
		// အဲ့လို Class တစ်ခုတည်းမှာ Customize Constructor တွေအများကြီးဆောက်ထားရင် Constructor Overloading လို့ခေါ်တယ် 
		
//		b_Person p1 = new b_Person(); // default constructor
//		b_Person p2 = new b_Person();
//		p1.name = "aye aye";
//		p1.age = 23;
//		p1.gender = true;
//		p2.age = 20;
//		p1.bornYear();
//		p2.bornYear();
		
		
		// b_Person ထဲက 3 Arguments Customize Constructor အတွက် Object ဆောက်ခြင်း
		b_Person p1 = new b_Person("Ko Ko", 26, true);
		b_Person p2 = new b_Person("Mg Mg", 23, true);
		p1.bornYear();
		p2.bornYear();
		
	}

}
