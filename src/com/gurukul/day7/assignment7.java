package com.gurukul.day7;

import java.util.Scanner;

class Person{
			
		protected String name;
		protected int age;
		Person() {
		}

		public Person(String name,int age) {
			// TODO Auto-generated constructor stub
			this.name = name;
			this.age = age;
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
		}

		class Employee extends Person{
			protected int id;
			protected double salary;
			
			public Employee() {
				// TODO Auto-generated constructor stub
			}
			
			

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "Name: "+name+" Age: "+age+" ID: "+id+" Salary: "+salary;
			}
			
			Employee(String name, int age, int id, double salary){
				super(name,  age );
				this.id = id;
				this.salary=salary;	
			}
			
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public double getSalary() {
				return salary;
			}
			public void setSalary(double salary) {
				this.salary = salary;
			}

			
		}

		class Teacher extends Employee{
			protected String subject;

			public Teacher() {
				// TODO Auto-generated constructor stub
			}
			
			Teacher(String name, int age, int id, double salary, String subject){
			super(name,age,id,salary);
			this.subject = subject;
			}
			
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "Name: "+name+" Age: "+age+" ID: "+id+" Salary: "+salary+" Subject: "+subject;
			}
			
			
			public String getSubject() {
				return subject;
			}

			public void setSubject(String subject) {
				this.subject = subject;
			}
			
			
		}
		class Principal extends Teacher{
			protected int experience;

			public Principal() {
				// TODO Auto-generated constructor stub
			}
			
			
			Principal(String name, int age, int id, double salary, String subject,int experience){
				super(name,age,id,salary,subject);
				this.experience=experience;
			}
			
			public int getExperience() {
				return experience;
			}

			public void setExperience(int experience) {
				this.experience = experience;
			}
			
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "Name: "+name+" Age: "+age+" ID: "+id+" Salary: "+salary+" experience"+experience;
			}
		}

		class Officer extends Employee{
			protected String dept;
			
			public Officer() {
				// TODO Auto-generated constructor stub
			}
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "Name: "+name+" Age: "+age+" ID: "+id+" Salary: "+salary+" department: "+dept;
			}

			Officer(String name, int age, int id, double salary,String dept){
				super(name,age,id,salary);
				this.dept = dept;
			}

			public String getDept() {
				return dept;
			}

			public void setDept(String dept) {
				this.dept = dept;
			}
		}
public class assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Teacher t1 = new Teacher("Alain Prost",5,1985,29000,"Racecraft");
		Teacher t2 = new Teacher("Sebastian Vettel",10,2012,31000,"Theory");
		Teacher t3 = new Teacher("Fernando Alonso",20,1975,19000,"Strategy");
		
		Principal p1 = new Principal("Adrian newey",30, 1999, 55000,"Aerodynamics",15);
		
		Officer o1 = new Officer("Stefano Domenicali",50,2100,90000,"Planning");
		
		Employee [] arr = new Employee[5];
		
		
		arr[0] = t1;
		arr[1] = t2;
		arr[2] =t3;
		arr[3] =p1;
		arr[4] = o1;
		
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j].getAge()>arr[j+1].getAge()) {
					Employee t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		
		//print the array
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the lower range of ages you want Employees for: " );
		int low = sc.nextInt();
		System.out.println("Please enter the high range of ages you want Employees for: " );
		int high = sc.nextInt();
		
		
		System.out.println("These are the Employees with age between your given range: ");
		for(int i=1;i<arr.length;i++) {
			if(arr[i].getAge()>=low && arr[i].getAge()<=high) {
				
				System.out.println(arr[i]);
			}
		}
		
		Employee [] salArr = arr;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<salArr.length-1;j++) {
				if(salArr[j].getSalary()>salArr[j+1].getSalary()) {
					Employee t = salArr[j];
					salArr[j] = salArr[j+1];
					salArr[j+1] = t;
				}
			}
		}

		
		
		

	}

}
