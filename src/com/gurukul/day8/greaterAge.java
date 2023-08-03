package com.gurukul.day8;
import java.util.*;

class Student{
	private int id;
	private String name;
	private int age;
	Student(){}
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
public class greaterAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter number");
		List<Student> arr=new ArrayList<Student>();
	    
	    
		   Student s1=new Student(1,"sonam",26);
		   Student s2=new Student(2,"rajashri",21);
		   Student s3=new Student(3,"vishavjeet",13);
		   Student s4=new Student(4,"ajeet", 25);
		   Student s5=new Student(5,"shrikant",27);
		   Student s6=new Student(6,"prathmesh",14);
		   Student s7=new Student(7,"ishan",6);
		   
		   arr.add(s1);
		   arr.add(s2);
		   arr.add(s3);
		   arr.add(s4);
		   arr.add(s5);
		   arr.add(s6);
		   arr.add(s7);
		 
		   for(int i=0;i<arr.size();i++) {
			   if(arr.get(i).getAge()>15) {
				   
				   System.out.println(arr.get(i));
			   }
		   }
     
	}

}
