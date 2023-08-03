
package com.gurukul.day5;
 import java.util.*; 
class Bank{
	private String name;double accNo;String city; double balance;
	
	static int count=1000;
	
	Bank(){
		count++;
	}
	public Bank(String name, double accNo, String city, double balance) {
		super();
		this.name = name;
		this.accNo = accNo;
		this.city = city;
		this.balance = balance;
		count++;
	}
	 

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getAccNo() {
		return accNo;
	}



	public void setAccNo(double accNo) {
		this.accNo = accNo;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getdeposit(double am) {
		return balance;
	}
 
	public void deposit(double amount) {
		balance +=amount;
	}
	
	public void withdraw(double amount) {
        balance -= amount;
	}
    public double currentBalance() {
    	return balance-1000;
    }
    public double bankTotal() {
		return balance;
    	
    }
	 
  public String toString(){
	  return  name+" Account NO: "+accNo+" Branch "+city+" Rs. "+balance;
  }
	
	
}


public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Your Details");
//		 System.out.print("Name: ");
//	        String name = sc.nextLine();
//	        System.out.print("Account Number: ");
//	        double accNo = sc.nextDouble();
//	        sc.nextLine(); // Consume the newline character left by nextDouble()
//	        System.out.print("City: ");
//	        String city = sc.nextLine();
	        
		
		Bank acc1=new Bank("Ram",123456,"Bandra",2308);
		acc1.deposit(2550);
		
		double bal=acc1.currentBalance();
		System.out.println(acc1.getName()+"has available"+bal+"ammount"+bal);
		
		
		System.out.println("Enter the ammount to withdraw");
		double am=sc.nextDouble();
		
		
		if(acc1.currentBalance()>am)
		acc1.withdraw(am);
		
		else
			System.out.println("Insufficient Fund");
		
		    System.out.println("Details of account holder"+acc1);//Ram Account   number 12345  rs.5050   branch bandra
		    
		    Bank  acc2=new Bank("Sita",32373,"kane",2000);
		    acc2.deposit(2000);
		     bal=acc2.currentBalance();
			System.out.println(acc2.getName()+"has available"+bal+"ammount");
			
//			
			System.out.println("Enter the ammount to withdraw");
			System.out.println();
			
			
			double am1=sc.nextDouble();
			
			
			if(acc2.getBalance()>am1)
			acc2.withdraw(am1);
			
			else
				System.out.println("Insufficient Fund");
			
			    System.out.println("Details of account holder"+acc2);//Ram Account   number 12345  rs.5050   branch bandra
			    
		    

	}

}
