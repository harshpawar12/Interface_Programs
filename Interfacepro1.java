package interfacee;

interface shape
{
	void getArea();
}
class Rect implements shape
{
	public void getArea()
	{
		int L=34,W=12;
		int result=L*W;
		System.out.println("Area of Rectangle:"+result);
	}
}
class circle implements shape
{
	public void getArea()
	{
		int r=5;
		int result=r*r;
		System.out.println("Area of circle:"+result);
	}
}
class Tringle implements shape
{
	public void getArea()
	{
		int b=23,h=5;
		int result=b*h/2;
		System.out.println("Area of Tringle"+result);
	}
}
public class Interfacepro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s=new Rect();
		s.getArea();
		shape s1=new circle();
		s1.getArea();
		shape s2=new Tringle();
		s2.getArea();

	}

}
