public class Sample{
	int a=1;
	long b=10;

	void display()
	{
		System.out.print(a+" "+b);
	}

	public static void main(String[] args) {
		Sample obj=new Sample();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.display();
	}
}