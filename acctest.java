package task2;

public class acctest {
	public static void main(String[] args) {
		Account a1 = new Account(432,"prem",40000);
		System.out.println("Balance: " + a1.getsal());
		System.out.println("name: " + a1.getname());
		a1.withdrawl(40000);
		System.out.println("Balance: " + a1.getsal());
		a1.setname("kumar");
		System.out.println("name: " + a1.getname());
	}
}	