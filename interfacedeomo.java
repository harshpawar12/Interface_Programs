package interfacee;

interface A
{
	
	
	
	default void method()
	{
		System.out.println("hii there..!!");
	}
}
public class interfacedeomo {
	
	public static void main(String[] args) {
		
		A a=new A(){
			
			
		};
		a.method();
		
		
		
		
	}

}
