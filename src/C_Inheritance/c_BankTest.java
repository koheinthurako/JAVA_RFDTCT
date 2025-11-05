package C_Inheritance;

public class c_BankTest {
	
	public static void main(String [] args) {
		
		// ဒါသည် polymorphism သဘောတရားအစဖြစ်သည် a_BankAcc ဆိုပြီး Datatype တူရာတွေစုပေးထားခြင်းဖြစ်သည်
		// Datatype တွေတူတဲ့အခါ Looping ပတ်လို့ရသွားတယ် toString() method တွေအလုပ်လုပ်သွားတာကတော့ သူ့ရဲ့ဆိုင်ရာ class တွေကိုယ်စီကပဲဖြစ်ပါတယ်
		a_BankAcc acc = new a_BankAcc("Thet", 100);
		a_BankAcc s_acc = new b_SavingAcc("Zaw", 200, true);
		a_BankAcc sp_acc = new d_SpecialAcc("Ko Ko", 50);
		
		// acc ကို output ထုတ်တဲ့အခါ သူ့ရဲ့ Object ဖြစ်တဲ့ a_BankAcc ထဲက toString() method က အလုပ်လုပ်သွားလို့ ပြဿနာမရှိပါ 
//		System.out.println(acc);
		// s_acc ကို output ထုတ်တဲ့အခါမှတော့ သူ့ရဲ့ Object ဖြစ်တဲ့ b_SavingAcc ထဲက toString() method ထဲမှာက
		// super.toString() ဆိုပြီးထုတ်ထားတာကြောင့် b_SavingAcc ရဲ့ Parent Class ဖြစ်တဲ့ a_BankAcc ထဲက toString() method ကပဲ
		// ထပ်ပြီးအလုပ်လုပ်သွားတာဖြစ်ပါတယ်
//		System.out.println(s_acc);
//		System.out.println(sp_acc);
		
		// Polymorphism သဘောတရားနဲ့ Datatypes တွေ တူသွားပြီဆိုရင် သူတို့ကို Loop ပတ်ပြီး output ထုတ်လို့ရသွားပြီ
		// တကယ်တမ်းက class တွေမတူကြတော့ Object တွေလည်းမတူ Datatypes တွေလည်း မတူပေမယ့် Inheritance လုပ်ထားတာကြောင့်
		// Polymorphism သဘောတရားကို သုံးပြီး Datatypes တွေ တူသွားကြပါတယ် အဲ့အခါမှာ Data တွေကို Manage လုပ်ရတာလွယ်သွားပါတယ်
		// အဲ့ဒါကို "Up Casting" လို့ခေါ်တယ် Parent Datatype ကို ချိန်းထားလို့
		
		// အပေါ်မှာရေးထားတဲ့အတိုင်း acc တွေကို output ထုတ်ချင်တော့ တစ်ကြောင်းချင်းစီရေးရတယ် Polymorphism ကိုသုံးလိုက်တော့ Datatype တူသွားလို့
		// အလွယ် Loop ပတ်လို့ရသွားပါတယ်
		// အောက်က deposit method က ကျတော့ b_SavingAcc ထဲမှာမရှိဘူး Parent a_BankAcc ထဲက method ကို Inheritance နဲ့ ခေါ်သုံးလိုက်တာ
		
		// သူ့ရဲ့ အားနည်းချက်ကတော့ Parent Class ထဲက Override လုပ်ထားတဲ့ဟာတွေကိုပဲ သုံးလို့ရမယ် အသစ်ရေးတဲ့ Method တွေကိုတော့ ယူသုံးလို့မရပြန်ဘူး
		// ယူသုံးချင်ရင်တော့ "Down Casting" ပြန်လုပ်ပေးရတယ် Child Dataype ကို ပြန်ချိန်းသွားလို့
		
//		b_SavingAcc sv_acc = (b_SavingAcc) s_acc;
//		sv_acc.calculate_interest();
		
		
		
		s_acc.deposit(100);
		
		a_BankAcc [] accs = {acc, s_acc, sp_acc};
		for(a_BankAcc ac : accs) {
			// instanceof ဆိုတာကတော့ ဘယ် Object ရဲ့ Constructor ကိုသုံးထားတာလဲဆိုတာကို စစ်တာ
			if(ac instanceof b_SavingAcc) {
				b_SavingAcc sv_acc = (b_SavingAcc) s_acc;
				sv_acc.calculate_interest();
			}
			System.out.println(ac);
		}
		
		s_acc.withdraw(200);
		System.out.println("Saving Account : " + s_acc);
		
		sp_acc.withdraw(100);
		System.out.println("Special Account : " + sp_acc);
		
		a_BankAcc.generate_Account_No(accs);
		
		for(a_BankAcc ac : accs ) {
			System.out.println(ac);
		}
		
	}

}
