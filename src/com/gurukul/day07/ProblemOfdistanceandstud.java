package com.gurukul.day07;

import java.lang.reflect.Method;
interface Show {
   int getId();
}
class distance implements Show {
	int id,meter,centi;

	 
	public distance(int id, int meter, int centi) {
		super();
		this.id = id;
		this.meter = meter;
		this.centi = centi;
	}
	


	public int getId() {//remove getId and write hascode() to everywhere to get sorted array
		return id;
	}



	public void setId(int id) {
		this.id = id;
		
	}



	public int getMeter() {
		return meter;
	}



	public void setMeter(int meter) {
		this.meter = meter;
	}



	public int getCenti() {
		return centi;
	}



	public void setCenti(int centi) {
		this.centi = centi;
	}



	@Override
	public String toString() {
		return "distance [id=" + id + ", meter=" + meter + ", centi=" + centi + "]";
	}
  

	
	
}
class stud implements Show{
	int id;
	String name;
	int age;
	 
	
	public stud(int id, String name, int age) {
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
		return   id + name+ age ;
	}
	 
	 
	
	
}

public class ProblemOfdistanceandstud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
     Show x[]=new Show[5];
     x[0]=new distance(101,10,20);
     x[1]=new distance(102,11,21);
//     x[2]=new distance(103,12,22);
//
//     x[4]=new stud(2,"Sonu",26);
     
   
     for(int i=0;i<x.length;i++) {
    	 for(int j=0;j<x.length-1;j++) {
            if(x[j].getId()>x[j+1].getId())  {
            	Show t=x[j];
            	x[j]=x[j+1];
            	x[j+1]=t;
            }
            System.out.println(x[j]);
    	 }
     }
	}

}
