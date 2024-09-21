package interfacee;

import java.util.function.Consumer;

public class consumer1 implements Consumer<String>
{
	@Override
	public void accept(String t) {
		System.out.println("hii there...!!");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		consumer1 v=new consumer1();
		v.accept("");

	}

	
}