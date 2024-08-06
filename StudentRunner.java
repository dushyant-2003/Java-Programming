
public class StudentRunner {
	public static void main(String[] args)
	{
		Student s1 = new Student(80);
		
		char grade = s1.assignGrade();
		
		System.out.println("Grade = " + grade);
	}
	
	
	
}
