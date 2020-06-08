class Student
{
	public int rollno;
	String name;
	static int code=1234;

	Student()
	{
		System.out.println("Hey!");
	}
	Student(int rollno)
	{
		this.rollno=rollno;
	}

	Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;		
	}

}

public class TestStudent
{
	public static void main(String[] args) {
		Student s1;
		s1=new Student(11,"Neha");
		Student s2=new Student(13);
		Student s3=new Student();
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(Student.code);
	}
}