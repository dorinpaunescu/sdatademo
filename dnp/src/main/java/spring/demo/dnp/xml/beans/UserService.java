package spring.demo.dnp.xml.beans;

import java.util.List;

import org.springframework.beans.factory.BeanNameAware;

public class UserService implements BeanNameAware{
	
	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		
	}
		
	private UserDao userDao;
	
	private String aPrimitive;
	private List<String> aCollection;
	
	public UserService() {
		
	}
	
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void addUser(User user) {
		
	}
	
	public void removeUser(User user) {
		
	}
	
	public List<User> listAllUsers(){
		return null;
	}

}
