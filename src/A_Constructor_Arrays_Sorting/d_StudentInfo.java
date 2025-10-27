package A_Constructor_Arrays_Sorting;

public class d_StudentInfo {

	int id;
	String name = "aye aye";
	int luck_no;
	
	public d_StudentInfo(int i, String n, int l) {
		id = i;
		name = n;
		luck_no = l;
	}
	
	// toString() Method ဆိုတာက ဒီ Class ကြီးတစ်ခုလုံးကို ရေးထားမှဖြင့် သူ့အထဲက Attributes တွေကို ထုတ်ပေးဖို့လိုမှာပဲဆိုပြီး Auto ရေးပေးထားတဲ့ method
	// auto return အနေနဲ့ String ကို return ပြန်ပေးရမယ်
	public String toString() {
		// အောက်က return မှာ "+" sign က အပေါင်းမဟုတ်ပဲ String အနေနဲ့ ဆက်ပေးတဲ့ Concatination လို့ခေါ်တယ်
		return id + " : " + name + " (" + luck_no + ")";
	}
	
	
	
}
