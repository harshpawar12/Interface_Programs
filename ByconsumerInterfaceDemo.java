package interfacee;

import java.util.function.BiConsumer;

public class ByconsumerInterfaceDemo implements BiConsumer<Integer, String>
{
	

	@Override
	public void accept(Integer t, String u) 
	{
		// TODO Auto-generated method stub
		System.out.println(t+" "+u);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByconsumerInterfaceDemo b=new ByconsumerInterfaceDemo();
		b.accept(1, "Java Programming");
		

	}

	
	

}
