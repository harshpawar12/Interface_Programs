package interfacee;

import java.util.Scanner;

interface resizable
{
	void resizableWidth(int w);
	void resizableHeight(int h);
}
class rectanglee implements resizable
{
	public void resizableWidth(int w)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Width");
		int n=sc.nextInt();
		
			
		System.out.println("the resizable width is:"+w);
		System.out.println("---------------------------");
	}
	public void resizableHeight(int h)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Height");
		int n=sc.nextInt();
	
			
		System.out.println("the resizable height is:"+h);
			
	}
}
public class interfacepro5 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		resizable s=new rectanglee();
		s.resizableHeight(123);
		resizable s1=new rectanglee();
		s1.resizableWidth(12);
		

		
		
		

	}
		

}
