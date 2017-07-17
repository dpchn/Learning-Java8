 	
public class User {

	private int id;
	private int age;
	private String name, email,gender, password;
	
	public String getName() {
		System.out.println("Inside User");
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setEmail(String email) {
		this.email = email;
		System.out.println("Inside User");
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
