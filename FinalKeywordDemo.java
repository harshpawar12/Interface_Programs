package interfacee;

class demo //final keyword are not use in interfce
{
	final double PI=3.14;
				
	int b=67;
	static int c=5;

}

public class FinalKeywordDemo extends demo
{
	public void disp()
	{
	
		System.out.println("Final keyword"+(PI));
		b++;
		System.out.println("instance veriable"+b);
		c++;
		System.out.println("static keyword"+c);

		
	}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		FinalKeywordDemo F=new FinalKeywordDemo();
		F.disp();

	}

}
