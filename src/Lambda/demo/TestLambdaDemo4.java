package Lambda.demo;

class User {
	private String userName;
	private String userPassword;
	private String userType;

	public User(String userName,String userPassword,String userType)
	{
		this.userName=userName;
		this.userPassword=userPassword;
		this.userType=userType;
		
	}
	public String getUserName()
	{
		return userName;
	}
	public String getUserPassword()
	{
		return userPassword;
	}
	public String getUserType()
	{
		return userType;
	}
}

//FunctionalInterface
interface userService 
{
	String login(User user);
	
}

public class TestLambdaDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// interface
		userService service = null;
		
		service=(input)->{
			String un = input.getUserName();
			String pw = input.getUserPassword();
			String type = input.getUserType();
			
			if(un.equalsIgnoreCase("admin") && pw.equals("cyber@123"))
			{
				return "welcome" + " "+un;
			}
			else
			{
				return "Invalid user";
			}
		};
		
		User userobj = new User("admin","cyber@123","admin");
		System.out.println(service.login(userobj));
		
	}

}
