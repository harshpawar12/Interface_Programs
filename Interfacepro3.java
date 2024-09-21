package interfacee;

interface Flayable
{
	void fly_obj();
}
class SpaceCraft implements Flayable
{
	public void fly_obj()
	{
		System.out.println("its Spacecraft class");
	}
}
class Airoplane implements Flayable
{
	public void fly_obj()
	{
		System.out.println("its Airoplane class");
	
	}
}
class Helicopter implements Flayable
{
	public void fly_obj()
	{
		System.out.println("its Helicopter class");
	
	}
}
public class Interfacepro3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flayable f=new SpaceCraft();
		f.fly_obj();
		Flayable f1=new Airoplane();
		f1.fly_obj();
		Flayable f2=new Helicopter();
		f2.fly_obj();


	}

}
