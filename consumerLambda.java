package interfacee;

import java.util.function.Consumer;

public class consumerLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> ob=(h)->
		{
			System.out.println(h);
		};
		ob.accept("Java");
		
		Consumer<String>ob1=(b)->System.out.println(b); //less the code
		ob1.accept("Java Programming");

	}

}
