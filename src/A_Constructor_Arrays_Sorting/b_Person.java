package A_Constructor_Arrays_Sorting;

public class b_Person {
	
	String name;
	int age;
	boolean gender;
	
//	public b_Person() { // default constructor or special method
//		age = 20; // constructor ထဲမှာ တန်ဖိုးကို Default ထည့်လိုက်လို့လည်းရတယ်
//	}
	
	public b_Person(String n, int a, boolean g) { // 3 arguments constructor
		name = n;
		age = a;
		gender = g;
	}
	
	public void bornYear() {
		System.out.println(name + " was born in " + (2023 - age));
	}

}
