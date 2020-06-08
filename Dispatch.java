class A
{
	void call()
	{
		System.out.println("Inside A's callme method");
	}
}
class B extends A
{
	void call()
	{
		System.out.println("Inside B's callme method");
	}
}
class C extends A
{
	void call()
	{
		System.out.println("Inside C's callme method");
	}
}
class Dispatch
{
	public static void main(String args[])
	{
		A a=new A();
		B b=new B();
		C c=new C();
	
		A r=a;		//creating refrence of type A
		r.call();
		r=b;
		r.call();
		r=c;
		r.call();
	}
}
