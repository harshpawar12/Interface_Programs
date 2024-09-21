package interfacee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class consumerInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> ob=(t)->{
		System.out.println("By using the consumer Interface");
		System.out.println(t);
		};
		
		
		ArrayList<Integer>al=new ArrayList(Arrays.asList(1,2,3,4,5,6));
		al.forEach(ob);

	}

}
