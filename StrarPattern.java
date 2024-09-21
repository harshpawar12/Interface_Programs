package interfacee;

public class StrarPattern {
	
	public static void main(String[] args) 
	{
		int n=7;	int ascii=64;
		for(int i=1;i<=n;i++)
		{
		
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=2;j<=i;j++)
			{
				if(j==1)
				{
				System.out.print("*");
				}
				else if(j==2)
				{
					System.out.print((char)ascii+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			ascii++;
		}
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print("");
				}
			}
			System.out.println();

		}
		
		
		
		
		
	}

}
