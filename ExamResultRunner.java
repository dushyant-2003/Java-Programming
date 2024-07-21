package introductionOOPS;

public class ExamResultRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamResult obj = new ExamResult();
		boolean isPass = obj.isPass(49);
		
		if(isPass == true)
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
	}

}
