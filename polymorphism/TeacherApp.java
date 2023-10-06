package polymorphism;

public class TeacherApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Institute i=new Institute();
		i.acceptTeacher(new CTeacher());
		System.out.println("=================");
		i.acceptTeacher(new JavaTeacher());
		System.out.println("======================");
		i.acceptTeacher(new PythonTeacher());
		

	}

}
