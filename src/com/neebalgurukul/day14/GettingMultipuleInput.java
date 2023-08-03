package com.neebalgurukul.day14;

import java.io.BufferedInputStream;

public class GettingMultipuleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			BufferedInputStream bis= new BufferedInputStream(System.in);
			try{
				System.out.println("enter an input");
				
				
				byte []a =new byte[5];
				StringBuilder sb=new StringBuilder();
				String s="";
				int pos;
				while(true) {
					pos=bis.read(a);
					if(pos==-1)
						break;
					s+=new String(a,0,pos);
					if(a[pos-1]=='\n')
					break;
					a=new byte[5];
					
				}
				System.out.println(s);
			}
				catch(Exception e) {
					System.err.println("enter an input");
					
				}
		}
	}


