package C_Inheritance;

public class d_SpecialAcc extends a_BankAcc{
	
	private int cheque;
	
	public d_SpecialAcc(String name, double amount) {
		// super ဆိုတာ parent class ကို ကိုယ်စားပြုခြင်းဖြစ်ပြီး သူ့ကို Constructor ရဲ့ ထိပ်ဆုံးလိုင်းမှာ ရေးပေးရတယ် မရေးရင် Error တက်တယ် ဒါက Java မှသတ်မှတ်ထားသည့် Rule
		super(name, amount);
//		System.out.println(super+""); // ဒီလို ရေးရာတွင် super လို့ output ထုတ်တာသည် super.toString() method ကိုခေါ်ခြင်းဖြစ်သည်
	}

}
