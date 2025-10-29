package C_Inheritance;

public class c_BankTest {
	
	public static void main(String [] args) {
		
		a_BankAcc acc = new a_BankAcc("Thet", 100);
		b_SavingAcc s_acc = new b_SavingAcc("Zaw", 200, false);
		
		System.out.println(acc);
		System.out.println(s_acc);
		
		
		
	}

}
