class Person
{
	String name="Neha";
	int age=18;
	
	void show()
	{
		System.out.println("Name is "+name+" and age is "+age);
	}
}
class Student extends Person
{
	String name="Prerana";
	int age=19;
	
	void show()
	{
		System.out.println("Name is "+name+" and age is "+age);
	}
	void display()
	{
		show();
		super.show();
	}
	void set()
	{
		super.name="Neha_Prabhu";
	}
}
class Super_pro
{
	public static void main(String arg[])
	{
		Student obj=new Student();
		obj.display();
		obj.set();
		obj.display();
	}
}	