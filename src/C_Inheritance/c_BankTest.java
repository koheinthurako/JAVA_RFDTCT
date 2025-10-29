package C_Inheritance;

public class c_BankTest {
	
	public static void main(String [] args) {
		
		// ဒါသည် polymorphism သဘောတရားအစဖြစ်သည် a_BankAcc ဆိုပြီး Datatype တူရာတွေစုပေးထားခြင်းဖြစ်သည်
		// Datatype တွေတူတဲ့အခါ Looping ပတ်လို့ရသွားတယ် toString() method တွေအလုပ်လုပ်သွားတာကတော့ သူ့ရဲ့ဆိုင်ရာ class တွေကိုယ်စီကပဲဖြစ်ပါတယ်
		a_BankAcc acc = new a_BankAcc("Thet", 100);
		a_BankAcc s_acc = new b_SavingAcc("Zaw", 200, true);
		a_BankAcc sp_acc = new d_SpecialAcc("Ko Ko", 50);
		
		// acc ကို output ထုတ်တဲ့အခါ သူ့ရဲ့ Object ဖြစ်တဲ့ a_BankAcc ထဲက toString() method က အလုပ်လုပ်သွားလို့ ပြဿနာမရှိပါ 
		System.out.println(acc);
		// s_acc ကို output ထုတ်တဲ့အခါမှတော့ သူ့ရဲ့ Object ဖြစ်တဲ့ b_SavingAcc ထဲက toString() method ထဲမှာက
		// super.toString() ဆိုပြီးထုတ်ထားတာကြောင့် b_SavingAcc ရဲ့ Parent Class ဖြစ်တဲ့ a_BankAcc ထဲက toString() method ကပဲ
		// ထပ်ပြီးအလုပ်လုပ်သွားတာဖြစ်ပါတယ်
		System.out.println(s_acc);
		System.out.println(sp_acc);
		
		
		
	}

}
