package C_Inheritance;

public class a_BankAcc {
	
	// Inheritance အစ (အမွေဆက်ခံခြင်း)
	// Class တစ်ခုကနေ နောက် Class တစ်ခုကို အမွေဆက်ခံထားတယ်ဆိုရင် Single Inheritance
	// Parent တစ်ခုကနေ Child တစ်ခု၊ အဲ့ Child တစ်ခုကနေ နောက် Child တစ်ခုကထပ်ပြီး အမွေဆက်ခံထားရင် Multiple Inheritance
	// Parent တစ်ခုကို Child တွေအများကြီးက အမွေဆက်ခံထားရင် Hierarchical Inheritance
	
	private String name;
	private int acc_no;
	// ဒီနေရာမှာ protected ဆိုတဲ့ Keyword ကလည်း Inheritance သဘောတရားနဲ့ တွဲပြီးအလုပ်လုပ်သည်
	// private ကိုသုံးတဲ့အခါမှာ အောက်က amount တန်ဖိုးကို တခြား class တွေကယူသုံးချင်တဲ့အခါ ပုံမှန်အတိုင်း Object ဆောက်ပြီးသုံးရတယ်
	// ဒီ protected ကိုသုံးလိုက်တဲ့အခါမှာ သူ့ရဲ့ Child class ဖြစ်တဲ့ class တွေက Inheritance သဘောတရားနဲ့ ယူသုံးလို့ရသွားတယ်
	protected double amount;
	
	public a_BankAcc(String name, double amount) {
		super();
		this.name = name;
		this.acc_no = acc_no;
		this.amount = amount;
	}
	
	public void withdraw(int withdraw_amount) {
		amount-=withdraw_amount;
	}
	
	public void deposit(int add_amount) {
		amount += add_amount;
	}

	@Override
	public String toString() {
		// ဒီ Acc ရဲ့ super class က Java ရဲ့ Object ဖြစ်တယ်
//		return super.toString();
		return name + " " + amount;
	}
	
	

}
