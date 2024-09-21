package interfacee;
interface Animal
{
	void bark();
	String speak();
}
class Dog implements Animal
{
	public void bark()
	{
	}
	public String speak()
	{
		return "Dog is barking";
	}
	
}
public class Interfacepro2 {
	
	public static void main(String[] args) {
		Animal A=new Dog();
		String s=A.speak();
		System.out.println(s);
	}


}
