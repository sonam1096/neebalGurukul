package com.gurukul.day4;

class t{
	 private int hour;
	 private int min;
	 private int sec;
	
	 
	  public String toString() {
		 return hour+":"+min+":"+sec;
	 }
     t(){}
	public t(int hour, int min, int sec) {
		super();
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
	this.sec = sec;
	}
	public int getInSec() {
		return hour*3600+min*60+sec;
	}

	 

	 
	 public t add(t t) {
		  t z = new t();
		  int inSec = this.getInSec()+t.getInSec();
		  
		  z.setHour((inSec/3600)%24);
		  inSec%=3600;
		  z.setMin(inSec/60);
		  inSec%=60;
		  z.setSec(inSec);
		  
		  return z;
		 }
	  public String convertIn12Hours() {
		  int h = hour;
		  String s;
		  if(hour==12) {
		   h = 12;
		   s = "PM";
		  }
		  else if(hour>12) {
		   h = hour%12;
		   s = "PM";
		  }
		  else {
		   s = "AM";
		  }
		  return (h + ":"+min + ":"+sec + s);
		 }

public class player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		t x=new t(12,30,25);
		t y =new t(19,20,35);
		t z=x.add(y);
//		String timeMessage1=x.convertIn12Hours();
//		String timeMessage2=y.convertIn12Hours();
//		
		System.out.println(x);//12:30:25
		System.out.println(y);//19:20:35
//		System.out.println(z);
//		System.out.println(timeMessage1);//12:30:25am
//		System.out.println(timeMessage2);//7:20:35pm
	}

}
}





