package com.gurukul.day01;
import java.util.*;
public class currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Ammout");
    int amount=sc.nextInt();
    int th=amount/2000;
    amount=amount%2000;
    int fivh=amount/500;
    amount=amount%500;
    int two=amount/200;
    amount=amount%200;
    int hun=amount/100;
    amount=amount%100;
    int fif=amount/50;
    amount=amount%50;
    int wen=amount/20;
    amount=amount%20;
    int ten=amount/10;
    amount=amount%10;
    int fiv=amount/5;
    amount=amount%5;
    
    System.out.println(th+"x2000="+(th*2000));
    System.out.println(fivh+"x500="+(fivh*500));
    System.out.println(two+"x200="+(two*200));
    System.out.println(hun+"x100="+(hun*100));
    System.out.println(fif+"x50="+(fif*50));
    System.out.println(wen+"x20="+(wen*20));
    System.out.println(ten+"x10="+(ten*10));
    System.out.println(fiv+"x5="+(fiv*5));
	}

}
