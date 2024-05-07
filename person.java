package task2;

public class person {
	    
	    public String name;
	    public int age;
	    public double salary;
	    public long phone;

	    
	    public person() {
	        this.age = 18; 
	    }

	    public person(String name, int age, double salary, long phone) {
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	        this.phone = phone;
	    }

	    
	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("salary: " + salary);
	        System.out.println("phone: " + phone);
	    }

	   
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }
	    public double getsal() {
	    	return salary;
	    }
	    public void setsal(double salary) {
	        this.salary = salary;
	    }
	    public long getphone(long phone) {
	        return phone;
	    }
	    public void setphone(long phone) {
	        this.phone = phone;
	    }

	  
	    public static void main(String[] args) {
	        
	        person person1 = new person("prem",35,45000,986654321);
	        person1.displayInfo();

	        System.out.println();

	        person person2 = new person("jack", 25, 30000, 987654321);
	        person2.displayInfo();
	    }
		}
			
		

