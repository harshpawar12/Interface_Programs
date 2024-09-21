package interfacee;

import java.util.function.Consumer;

public class consumerInterfaceDemo implements Consumer<String>
{
	
	public void accept(String t)
	{
		System.out.println(t);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		consumerInterfaceDemo c=new consumerInterfaceDemo();
		c.accept("HARSH");

	}

}
