package B_OOPFundamental;

public class a_OOPFlow_Polymorphism {
	
	/* OOP Flow : ဒီ Flow အတိုင်း OOP ကိုရေးလေ့ရှိတယ်
	 	1. Attributes
	 	2. Constructor
	 	3. Access Modifier (Getter, Setter)
	 	4. Method-return, method overloading, method recursive, method propagation
	 	5. To String();
	 */

	// Private ဆိုတာ Polymorphism concept ဖြစ်တယ် private လို့ထားလိုက်ခြင်းဖြင့် Attributes/ Method တစ်ခုခုကို
	// တခြား Class မှ အလွယ်တကူတိုက်ရိုက်တန်ဖိုးတွေ ပြောင်းလို့မရတော့ဘူး သူ့ကိုပြောင်းချင်ရင် အောက်က Getter_Setter ကနေတစ်ဆင့် သုံးပြီးပြောင်းပေးရတယ်
	private int id;
	private String name;
	private final int constant = 3; // Final ဆိုတဲ့ Keyword က အမြဲတမ်း ဒီ Project ထဲမှာ ဒီတိုင်းပဲသုံးချင်တယ်ဆိုရင် Final Keyword ကိုသုံးရတယ်

	
	
	public static void main(String[] args) {
		int num = 5;
		System.out.println(factorial(1, num));
		
		a_OOPFlow_Polymorphism a1 = new a_OOPFlow_Polymorphism();
		a1.setId(7);
		System.out.println(a1.getId());
	}
	
	// ကိုယ့် Method ကို ကိုယ်ပြန်ခေါ်ရင် Method Recursive
	// Method တစ်ခုထဲကနေ တခြား method ကိုခေါ်ရင် Method Propagation
	static int factorial(int result, int time) {
		if(time==1) return result;
		return factorial(result*time, --time);
		// time ကိုသာ Prefix --time ပုံစံမလျှော့သွားဘူးဆိုရင် Stack Over Flow Error တက်လိမ့်မယ်
	};
	
//	Access Modifier : Getter
	public int getId() {
		return id;
	}
	
//	Access Modifier : Setter
	public void setId(int id) {
		if(id == 7) {
			System.out.println("You are lucky");
			this.id = id;
		} else {
			System.out.println("You are unlucky");
		}
		// setter က‌နေတစ်ဆင့် ဖြတ်ဝင်လာတဲ့ Parameter Value တွေကို Condition စစ်ပြီး လိုသလို ပြန်သုံးလို့ရတယ်
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	Auto Getter, Setter ကို IDE ကနေခေါ်ချင်ရင် Source -> Generate Getters and Setters...	
	
}
