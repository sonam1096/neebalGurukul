package com.gurukul.day5;



class Person{
	protected String name;
	protected int age;
	
	Person(){}
	
	Person(String n,int a){
		name=n;
		age=a;
	
	
   }
	public String toString() {
		return ("Name:"+ name+  " "+age);
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
	

int id;
	double sal;
	
	Employee(){
		super();
	}
      Employee(String name, int age,int id, double sal) {
		//this.name=name;
		//this.age=age;
		super(name,age);
		this.id=id;
		this.sal=sal;
		//super(name,age);
	}
	public String  toString() {
	//System.out.println("Name:"+ name+  " "+age);
	   // super.print();	
		return super.toString()+ (id+" "+ sal);
	}
}
class Student extends Person{
	
	int roll;
	Student(){
		super();
	}
	Student(String name, int age,int roll){
		super(name,age);
		this.roll=roll;
	}
	public String  toString() {
		//System.out.println("Name:"+ name+  " "+age);
		   // super.print();	
			return super.toString();
		}
	
}
public class studentinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Person x=new Person("Ravi", 20);
		//x.print();
		System.out.println(x);
		Employee y=new Employee("Ram", 20,101,20000);
		//y.set("Ram", 20,10,200000);
		//y.set(101, 20000);
		//y.print();
		System.out.println(y);
		
		Student z=new Student("Zaiba", 30,120);
		
		System.out.println(z);
		if(z.getAge()>y.getAge()) 
			System.out.print(z.getName()+" is elder");
			else
				System.out.println(y.getName()+ "is elder");
		}
		
		

	}

