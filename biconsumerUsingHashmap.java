package interfacee;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class biconsumerUsingHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<Integer, String>b=(i,u)->System.out.println(i+" "+u);
		
		HashMap<Integer, String>hp=new HashMap();
		hp.put(1, "java");
		hp.put(2, "Programming");
		
		hp.forEach(b);
		
		HashMap<Integer, String>h=new HashMap();
		h.put(1, "Python");
		h.put(2, "Programming");
		h.forEach((k,v)->System.out.println(k+" "+v));
		
		
	}

}
