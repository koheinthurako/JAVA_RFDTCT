package B_OOPFundamental;

public class c_DepartmentTest_StaticFinal {
	
	public static void main(String [] args) {
		
		Team_UI obj_ui = new Team_UI("UI Team", 5, "25");
		b_Department dept = new b_Department(obj_ui, new Team_Web("Web Team", 5));
		// အောက်ကအတိုင်း print ထုတ်ရင် Department Class ထဲက toString() method ကို သွားခေါ်ပါတယ်
		System.out.println(dept);
		// UI Team ထဲကို Member အသစ်ထပ်ထည့်ချင်တယ်ဆိုရင်
		dept.getUi().setMember(dept.getUi().getMember()+1);
		System.out.println(dept); // ဒီ output မှာ UI Team ထဲက Member တစ်ယောက်တိုးသွားပြီ
		dept.giveFund(20000);
		// fund variable ကို static keyword နဲ့ သုံးထားလို့ သူ့ကိုခေါ်မယ်ဆိုရင် Class ကနေခေါ်တာပိုသင့်တော်ပါတယ်
		System.out.println(b_Department.getFund());
	}

}
