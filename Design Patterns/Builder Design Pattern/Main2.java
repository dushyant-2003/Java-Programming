
public class Main2 {
	public static void main(String[] args)
	{
		User user = new User.UserBuilder().setEmailId("db@outlook.com").setUserId("U123").setUserName("Dushyant").build();
		System.out.println(user);
	}
}
