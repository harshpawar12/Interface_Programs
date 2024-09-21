package interfacee;

import java.util.function.BiConsumer;

public class BiconsumerUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<Integer, String>b=(i,u)->System.out.println(i+" "+u);
		b.accept(1, "java");

	}

}
