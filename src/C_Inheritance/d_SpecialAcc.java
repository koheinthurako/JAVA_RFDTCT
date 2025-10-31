package C_Inheritance;

public class d_SpecialAcc extends a_BankAcc{
	
	private int cheque;
	public static final int CONST_AMT = 10;
	
	public d_SpecialAcc(String name, double amount) {
		// super ဆိုတာ parent class ကို ကိုယ်စားပြုခြင်းဖြစ်ပြီး သူ့ကို Constructor ရဲ့ ထိပ်ဆုံးလိုင်းမှာ ရေးပေးရတယ် မရေးရင် Error တက်တယ် ဒါက Java မှသတ်မှတ်ထားသည့် Rule
		super(name, amount);
//		System.out.println(super+""); // ဒီလို ရေးရာတွင် super လို့ output ထုတ်တာသည် super.toString() method ကိုခေါ်ခြင်းဖြစ်သည်
	}
	
	@Override
	// Parent method က method ကို Override ပြန်လုပ်တယ်ဆိုတဲ့သဘောဖြစ်ပြီး method name ပြောင်းသွားတာနဲ့ Override သဘောတရားမဟုတ်တော့ပါ
	public void withdraw(int withdraw_amount) {
		if((super.amount-withdraw_amount)>= CONST_AMT) {
			super.amount-=withdraw_amount;
			System.out.println("Successfully withdraw!");
			System.out.println("Your remaining balance : " + super.amount);
		} else {
			System.out.println("You need to keep at least $10 in your bank account!");
		}
	}

}
