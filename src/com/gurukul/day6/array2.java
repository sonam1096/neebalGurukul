package com.gurukul.day6;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		int a[]= {8,15,7,2,11	};
		int x=0,y=0;
		for(int i=0;i<a.length;i++) {
			if(i%2!=0) {
				x +=a[i];
			}
			if(a[i]%2!=0) {
				y +=a[i];
			}
		}
		System.out.println(x);
		System.out.println(y);
		
}
}