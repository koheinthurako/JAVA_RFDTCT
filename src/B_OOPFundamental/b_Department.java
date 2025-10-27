package B_OOPFundamental;

class Team_UI {
	
	private String name;
	private int member;
	private String Infracture;
	public Team_UI(String name, int member, String infracture) {
		super();
		this.name = name;
		this.member = member;
		Infracture = infracture;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMember() {
		return member;
	}
	
	public void setMember(int member) {
		this.member = member;
	}
	
	public String getInfracture() {
		return Infracture;
	}
	
	public void setInfracture(String infracture) {
		Infracture = infracture;
	}
	
	@Override
	public String toString() {
		return "Team_UI [name=" + name + ", member=" + member + ", Infracture=" + Infracture + "]";
	}
	
}

class Team_Web {
	
	private String name;
	private int member;
	public Team_Web(String name, int member) {
		super();
		this.name = name;
		this.member = member;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMember() {
		return member;
	}
	
	public void setMember(int member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "Team_Web [name=" + name + ", member=" + member + "]";
	}
	
}

public class b_Department {
	
	// အပေါ်က Team UI နဲ့ Team Web class ကို b_Department ထဲမှာ ထည့်ချိတ်လိုက်ခြင်း
	private Team_UI ui;
	private Team_Web web;
	
	// ui ရဲ့ Object က Team_UI ဖြစ်သည့်အတွက် Paramter ထဲက Datatype မှာလည်း Team_UI Object ဖြစ်ပေးရမယ်
	// ဒီ b_Department ဆိုတဲ့ Class ကို တခြား Class က Object ဆောက်မယ်ဆိုရင် Constructor ခေါ်ရမှာမို့ Team_UI နဲ့ Team_Web ဆိုတဲ့ Object 2 ခုလုံးပါသည့်
	// Constructor ကိုသုံးရမှာဖြစ်သည့်အတွက် c_DepartmentTest_StaticFinal ထဲမှာ Object အကုန်လုံးကို ပြန်ချိတ်ပေးရတယ်
	public b_Department(Team_UI ui, Team_Web web) {
		super();
		this.ui = ui;
		this.web = web;
	}
	
	// getter and setter for Team_UI
	public Team_UI getUi() {
		return ui;
	}
	
	public void setUi(Team_UI ui) {
		this.ui = ui;
	}
	
	// getter and setter and Team_Web
	public Team_Web getWeb() {
		return web;
	}
	
	public void setWeb(Team_Web web) {
		this.web = web;
	}
	
	@Override
	public String toString() {
		// c_DepartmentTest_StaticFinal ထဲမှာ ထုတ်ထားတဲ့ toString() method ကနေတစ်ဆင့် ဒီထဲမှာရှိတဲ့ ui, web ရဲ့ toString() method တွေအထိ ဆင်းခေါ်သွားပါတယ်
		return "b_Department [ui=" + ui + ", web=" + web + "]";
	}
	
	

}
