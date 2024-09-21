package interfacee;


class  mothds
{
	
	final public void method()
	{
		System.out.println("we cannot make class\n final because its gives error inherits");
	}
}
class casino extends mothds
{
	final void method1()
	{
		System.out.println("diff method");
	}
}
public class FinalMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		casino c=new casino();
		c.method1();
		c.method();

	}

}
