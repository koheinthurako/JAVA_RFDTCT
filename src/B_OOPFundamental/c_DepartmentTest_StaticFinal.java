package B_OOPFundamental;

public class c_DepartmentTest_StaticFinal {
	
	public static void main(String [] args) {
		
		Team_UI obj_ui = new Team_UI("IT Team", 5, "25");
		b_Department dept = new b_Department(obj_ui, new Team_Web("Designer Team", 5));
		// အောက်ကအတိုင်း print ထုတ်ရင် Department Class ထဲက toString() method ကို သွားခေါ်ပါတယ်
		System.out.println(dept);
		
	}

}
