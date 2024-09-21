package interfacee;

interface inte
{
	int a=10;
	void disp();
	
}
interface int4 extends inte
{
	int b=100;
	void print();
}

public class interfaceDemo1 implements int4
{
	public void disp()
	{
		System.out.println("method called..."+a);
	}
	public void print()
	{
		System.out.println("print method called"+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceDemo1 i=new interfaceDemo1();
		i.disp();
		i.print();
		

	}

}
