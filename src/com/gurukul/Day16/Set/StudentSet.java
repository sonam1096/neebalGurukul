package com.gurukul.Day16.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

class Student implements Comparable <Student>{
	 int RollNo;
	private String  Name;
	int Math,Physics,Chemistry;
	Student(){}
	
	
	 public Student(int rollNo, String name, int math, int physics, int chemistry) {
		super();
		RollNo = rollNo;
		Name = name;
		Math = math;
		Physics = physics;
		Chemistry = chemistry;
	}
	 


	public int getRollNo() {
		return RollNo;
	}


	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getMath() {
		return Math;
	}


	public void setMath(int math) {
		Math = math;
	}


	public int getPhysics() {
		return Physics;
	}


	public void setPhysics(int physics) {
		Physics = physics;
	}


	public int getChemistry() {
		return Chemistry;
	}


	public void setChemistry(int chemistry) {
		Chemistry = chemistry;
	}
	


	@Override
	public String toString() {
		return  this.getName() ;
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return Name.compareTo(o.Name);
	}


	public boolean isFail(int sub) {
		// TODO Auto-generated method stub
		return sub<35;
	}
}




public class StudentSet {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student x=new Student(3,"Sonam",80,60,55);
     Student y=new Student(5,"Vishavjeet",42,67,45);
     Student z=new Student(1,"Rajashri",35,55,55);
     
     Student[]Array= {x,y,z};
     
     List<Student> MathFail=new ArrayList<>();
     List<Student>PhyFail=new ArrayList<>();
     List<Student>ChemFail=new ArrayList<>();
     
     
     
     
     
     for(Student s:Array)
    	 if(s.isFail(s.getMath()))
    		 MathFail.add(s);
      
   //  List<Student>PhyFail=new ArrayList<>();
     
     for(Student s:Array)
    	if( s.isFail(s.getPhysics()))
    			PhyFail.add(s);
  //   List<Student>s3=new ArrayList<>()

     for(Student s:Array)
    	 if(s.isFail(s.getChemistry()))
    		 ChemFail.add(s);
     
     
    
     HashSet<Student> s1=new HashSet<>();
     HashSet<Student> s2=new HashSet<>();
     HashSet<Student> s3=new HashSet<>();
     
     
     
	}

}
