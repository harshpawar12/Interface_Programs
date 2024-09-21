package interfacee;

interface draw
{
	String  draw();
}
class circle1 implements draw
{
	public String draw()
	{
		return "Drawing circle...";
	}
}
class rectan implements draw
{
	public String draw()
	{
		return "Drawing shape rectangle.....";
	}
}
class trii implements draw
{
	public String draw()
	{
		return "shape tringle....";
	}
}
public class Interfacepro6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		draw d=new circle1();
		System.out.println(d.draw());
		draw d1=new rectan();

		System.out.println(d1.draw());
		draw d2=new trii();

		System.out.println(d2.draw());

	}

}
