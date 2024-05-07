package task2;
class Person2{
    
    public String name;
    public int age;
        public Person2(String name, int age ) {
        this.name = name;
        this.age = age;
        
    }

    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
     
    }
}


class Employee extends Person2 {
    
    public int employeeID;
    public double salary;

    
    public Employee(String name, int age, int employeeID, double salary) 
    {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
        
    }

    
    public void displayEmployeeDetails() {
        System.out.println("--- Employee Details ---");
        super.displayDetails(); 
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: $" + salary);
    }
}

