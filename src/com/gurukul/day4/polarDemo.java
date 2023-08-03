package com.gurukul.day4;

class polar{
	private double r,th;
	polar(){
		
	}
	 
	public polar(double r, double th) {
		//super();
		this.r = r;
		this.th = th;
	}
	public double getX() {
		return r*Math.cos(Math.toRadians(th));
	}
	public double getY() {
		return r*Math.sin(Math.toRadians(th));
	}
	public void setPolar(double x,double y) {
		r=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		th=Math.atan2(y, x);
		th=Math.toDegrees(th);
		}
//	public String toString() {
//		return "The radius"+r+" the th is "+th;
//		
//	}
	void display() {
		System.out.println(r+" "+th);
	}
}

public class polarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      polar a=new polar(5,50);
      polar b=new polar(6,50);
      polar c=new polar();
      
      a.display();
      double x=a.getX()+b.getX();
      double y=a.getY()+b.getY();
      c.setPolar(x,y);
      
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
	}

}
