package polymorphism;

public class Institute {
	public void acceptTeacher(Teacher ref) {
		ref.markAttendence();
		ref.teach();
		ref.doLabPractice();
		
	}

}
