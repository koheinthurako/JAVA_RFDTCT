package C_Inheritance;

public class b_SavingAcc extends a_BankAcc{

	// Inheritance keyword က extends ဆိုပြီးသုံးရတယ် a_BankAcc ဆိုတဲ့ Parent Class ကို Inheritance(extends) လုပ်ပြီဆိုရင်
	// အရေးကြီးတဲ့အချက်က Parent Class ရဲ့ Constructor ကို Child မှာလည်း ပြန်ခေါ်ပေးရတယ် မခေါ်ရင် Error တက်တယ် 
	// Parent Class ထဲမှာ ဘယ်လို Constructor ရှိနေလဲဆိုတာကို Inheritance Concept မှာ ရေးပေးရတယ်
	// Parent မှာ Default Constructor ပဲရှိရင် Child Class ထဲမှာ ဘာမှရေးစရာမလိုပါ
	
	private boolean book;
	
	public b_SavingAcc(String name, double amount, boolean book) {
		// super ဆိုတာ parent class ကို ကိုယ်စားပြုခြင်းဖြစ်ပြီး သူ့ကို Constructor ရဲ့ ထိပ်ဆုံးလိုင်းမှာ ရေးပေးရတယ် မရေးရင် Error တက်တယ် ဒါက Java မှသတ်မှတ်ထားသည့် Rule
		super(name, amount);
//		System.out.println(super+""); // ဒီလို ရေးရာတွင် super လို့ output ထုတ်တာသည် super.toString() method ကိုခေါ်ခြင်းဖြစ်သည်
		this.book = book;
	}

	@Override
	public String toString() {
		// ဒီ Class ရဲ့ super class က a_BankAcc ဖြစ်တယ်
		return super.toString() + "(Book : " + book + ")";
	}
	
	
	
}
