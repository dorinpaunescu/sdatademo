package spring.demo.dnp.xml.beans;

public class UserServiceFactory {
	
	private UserServiceFactory() {
		
	}
	
	public static UserServiceFactory newInstance() {
		return new UserServiceFactory();
	}
	
	public User newUser() {
		return new User();
	}
}
