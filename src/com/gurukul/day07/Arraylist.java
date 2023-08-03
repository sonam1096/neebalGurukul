package com.gurukul.day07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class student{
	int id;
	int age;
	String name;
	public student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
}

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<student> arr=new ArrayList<student>();
    
    
   student s1=new student(10,20,"s");
   student s2=new student(11,21,"so");
   student s3=new student(12,22,"son");
   student s4=new student(13,23,"sona");
   student s5=new student(14,24,"sonam");
   student s6=new student(15,25,"sp");
   student s7=new student(16,26,"sv");
   
   arr.add(0,s1);
   arr.add(s2);
   arr.add(s3);
   arr.add(s4);
   arr.add(s5);
   arr.add(s6);
   arr.add(s7);
   
   ((student)arr.get(0)).setName("Vishwa");
   
   for(student arr1:arr)
  //  System.out.println(arr1);
   
	   for(int i=0;i<arr.size();i++)
	   {
	    	for (int j=0;j<arr.size()-1;j++) {
            if(arr.get(j).getAge()>arr.get(j+1).getAge())  {
	            	student t=arr.get(j);
	            	arr.set(j,arr.get(j+1));
	            }
           // System.out.println(arr);
	    	 }
	   }
   List<student>s=new ArrayList<student>();
   //Collection.reverse=s;
   
	    	 
//	  	    	for (int j=arr.size()-1;j>0;j--) {
//  
//	  	    		System.out.println(arr.get(j));
//	  	            }
	  	    	 }
	  	    	
   
 }

