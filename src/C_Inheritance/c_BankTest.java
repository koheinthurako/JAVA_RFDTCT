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
		
		// အပေါ်မှာရေးထားတဲ့အတိုင်း acc တွေကို output ထုတ်ချင်တော့ တစ်ကြောင်းချင်းစီရေးရတယ် Polymorphism ကိုသုံးလိုက်တော့ Datatype တူသွားလို့
		// အလွယ် Loop ပတ်လို့ရသွားပါတယ်
		s_acc.deposit(100);
		
		a_BankAcc [] accs = {acc, s_acc, sp_acc};
		for(a_BankAcc ac : accs) {
			System.out.println(ac);
		}
		
		// Special Account မှာ အနည်းဆုံး ၁၀ ချန်ထားမှရမယ်ဆိုတဲ့ Method ကိုရေးချင်တဲ့အခါ
		s_acc.withdraw(300);
		System.out.println(s_acc);
		
	}

}
