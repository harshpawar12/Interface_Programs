package interfacee;
interface payble
{
	String  draw();
}
class football implements payble
{
	public String draw()
	{
		return "Playing football";
	}
}
class holleyball implements payble
{
	public String draw()
	{
		return "playing holleyball";
	}
}
class basketBall implements payble
{
	public String draw()
	{
		return "playing basketball...";
	}
}
public class Interfacepro7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		payble d=new football();
		System.out.println(d.draw());
		payble d1=new holleyball();

		System.out.println(d1.draw());
		payble d2=new basketBall();

		System.out.println(d2.draw());

	}

}
