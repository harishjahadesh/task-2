package task2;

public class Account {
	private int accno ;
	private String name;
	private double salary;
	
	public int getacc() {
		return accno;
	}
	public String getname() {
		return name;
	}
	public double getsal() {
		return salary;
	}
	public void setname(String name) {
		this.name = name;
	}
	Account(int accno,String name,double salary){
	this.accno = accno;
	this.name = name;	
	this.salary = salary;	
	}
	public void deposite(double amount) {
		salary = salary + amount;
		System.out.println(amount + "Is credited" + accno);
	}
	public void withdrawl(double amount) {
		salary = salary - amount;
		System.out.println(amount + "Is debited"+ accno);
	}
}
   