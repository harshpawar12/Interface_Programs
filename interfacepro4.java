package interfacee;

import java.util.Scanner;

interface banking
{
	void deposite(int choice,Scanner sc);
	void withdrawl(int choice,Scanner sc);
	void calIntrest(int choice,Scanner sc);
	void viewBalance(int choice,Scanner sc);
	
}
class bankAccount implements banking
{
	int de;
	int w;
	public void deposite(int choice,Scanner sc)
	{
		
		System.out.println("Enter the deposited amount");
		int de=sc.nextInt();
		this.de=de;
		System.out.println("deposited succesfully:"+de);
		
		System.out.println("Current balance : "+de);
		System.out.println("-------------------------------");

	}
	public void withdrawl(int choice,Scanner sc)
	{
	int d=12;
		System.out.println("Enter the withdrawl amount");
		int w=sc.nextInt();
		this.w=w;
		System.out.println("Bank Withdrawl succesfully.."+w);
		System.out.println("-------------------------------");

		
		this.viewBalance(choice, sc);
	}
	
	public void viewBalance(int choice,Scanner sc)
	{
		int c=this.de-=this.w;
		System.out.println("Remaining  balance is:"+c);
		System.out.println("-------------------------------");

		this.calIntreast(choice, sc);
	}
	public void calIntreast(int choice,Scanner sc)
	{
		System.out.println("Enter you are investing amount:");
		int a=sc.nextInt();
		System.out.println("Rate of intrest");
		double d=sc.nextDouble();
		System.out.println("Enter time period");
		int year=sc.nextInt();
		double k=(int)a*d*year/100;
		System.out.println("Your simple intrest is:\n"+k);
		
		
	}
	@Override
	public void calIntrest(int choice,Scanner sc) {
		// TODO Auto-generated method stub
		
	}
	
}
class savingAccount implements banking
{
	int de;
	int w;
	public void deposite(int choice,Scanner sc)
	{
		System.out.println("-------------------------------");

		System.out.println("Enter the deposited amount");
		int de=sc.nextInt();
		this.de=de;
		System.out.println("deposited succesfully:"+de);
		
		System.out.println("Current balance : "+de);
		System.out.println("-------------------------------");


	}
	public void withdrawl(int choice,Scanner sc)
	{
	int d=12;
		System.out.println("Enter the withdrawl amount");
		int w=sc.nextInt();
		this.w=w;
		System.out.println("Bank Withdrawl succesfully.."+w);
		System.out.println("-------------------------------");

		
		this.viewBalance(choice, sc);
	}
	
	public void viewBalance(int choice,Scanner sc)
	{
		int c=this.de-=this.w;
		System.out.println("Remaining  balance is:"+c);
		System.out.println("-------------------------------");

		this.calIntreast(choice, sc);
	}
	public void calIntreast(int choice,Scanner sc)
	{
		System.out.println("-------------------------------");

		System.out.println("Enter you are investing amount:");
		int a=sc.nextInt();
		System.out.println("Rate of intrest");
		double d=sc.nextDouble();
		System.out.println("Enter time period");
		int year=sc.nextInt();
		double k=(int)a*d*year/100;
		System.out.println("Your simple intrest is:\n"+k);
		System.out.println("-------------------------------");

		
		
	}
	@Override
	public void calIntrest(int choice,Scanner sc) {
		// TODO Auto-generated method stub
		
	}
	
}
class currentAccount implements banking
{
	int de;
	int w;
	public void deposite(int choice,Scanner sc)
	{
		
		System.out.println("Enter the deposited amount");
		int de=sc.nextInt();
		this.de=de;
		System.out.println("deposited succesfully:"+de);
		
		System.out.println("Current balance : "+de);
		System.out.println("-------------------------------");


	}
	public void withdrawl(int choice,Scanner sc)
	{
	int d=12;
		System.out.println("Enter the withdrawl amount");
		int w=sc.nextInt();
		this.w=w;
		System.out.println("Bank Withdrawl succesfully.."+w);
		System.out.println("-------------------------------");

		
		this.viewBalance(choice, sc);
	}
	
	public void viewBalance(int choice,Scanner sc)
	{
		int c=this.de-=this.w;
		System.out.println("Remaining  balance is:"+c);
		System.out.println("-------------------------------");

		this.calIntreast(choice, sc);
	}
	public void calIntreast(int choice,Scanner sc)
	{
		System.out.println("-------------------------------");

		System.out.println("Enter you are investing amount:");
		int a=sc.nextInt();
		System.out.println("Rate of intrest");
		double d=sc.nextDouble();
		System.out.println("Enter time period");
		int year=sc.nextInt();
		double k=(int)a*d*year/100;
		System.out.println("Your simple intrest is:\n"+k);
		System.out.println("-------------------------------");

		
		
	}
	@Override
	public void calIntrest(int choice,Scanner sc) {
		// TODO Auto-generated method stub
		
	}
	
	
}
public class interfacepro4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(1+"check Saving Bank Details\n"+2+"check currentAccount detail\n"+3+"check currentAccount Detail:\n");
		System.out.println("-------------------------------");

		System.out.println("Enter the your choice");
		System.out.println("-------------------------------");

		int choice=sc.nextInt();
		System.out.println("-------------------------------");

		switch(choice)
		{
		case 1:
			banking b=new bankAccount();
			b.deposite(choice,sc);
			b.withdrawl(choice,sc);
		b.calIntrest(choice, sc);
			
			break;
		case 2:
			banking b1=new savingAccount();
			b1.deposite(choice,sc);
			b1.withdrawl(choice,sc);
		b1.calIntrest(choice, sc);
			break;
		case 3:
			banking b2=new currentAccount();
			b2.deposite(choice,sc);
			b2.withdrawl(choice,sc);
		b2.calIntrest(choice, sc);
	
			break;
			default:
				System.out.println("sorry Enter valid number"); 
		
		}
		

	}

}
