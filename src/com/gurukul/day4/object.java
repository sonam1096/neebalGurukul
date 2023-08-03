package com.gurukul.day4;


class Employee{
	private String name;
	private int Id;
	private double Salary;
	private String Department;
	
	Employee(String Name, int ID, double Salary, String Department){
		name= Name;
		Id= ID;
		this.Salary= Salary;
		this.Department=Department;
	}
	
	// using getter and setter for getting output for private 
	public String getName() {
		return this.name;
	}
	int getID() {
		return this.Id;
	}
	double getSalary() {
		return this.Salary;
	}
	void setSalary(double uSalary) {
		Salary = uSalary;
	}
	public String Department() {
		return this.Department;
	}
	
	// to display output
	public String toString() {
		//return "Name:" + name+ " ID: "+ Id+ " Salary: "+Salary+" Department: "+Department;
		return ("The employee with highest salary is " + name +", his salary is " + Salary + " and his department is " + Department);

	}
	
}
public class object {
	public static void main(String args[]) {
		Employee a= new Employee("Ajeet", 1, 25000, "IT");
		Employee b= new Employee("Pratham", 2, 26005, "IT");
		Employee c= new Employee("Srikant", 3, 26008, "Developer");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// for getting the highest salary among employee
		System.out.println("\n\nFor getting high salary");
		Employee highsa = a;
		Employee highsb = b;
		Employee highsc = c;
		a.setSalary(a.getSalary()*1.2);
		b.setSalary(b.getSalary()*1.2);
		c.setSalary(c.getSalary()*1.2);
		if(a.getSalary() > highsb.getSalary()) {
			if(highsa.getSalary() > highsc.getSalary() ) 
				System.out.println("Salary of \n"+highsa);
			else
				System.out.println("Salary of \n"+highsc);
		}
		
		else  {
			if(highsb.getSalary() > highsc.getSalary() ) 
				System.out.println("Salary of \n"+highsb);
			else
				System.out.println("Salary of "+highsc);
		}
		
		a.setSalary(a.getSalary()*1.2);
		b.setSalary(b.getSalary()*1.2);
		c.setSalary(c.getSalary()*1.2);

		}
	}