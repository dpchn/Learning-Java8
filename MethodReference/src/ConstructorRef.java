import java.util.function.*;
import java.util.*;
public class ConstructorRef {

	public static void main(String[] args) {
		/*
		 * Using Anonymous class
		 */
		Userfactory user = new Userfactory() {
			@Override
			public User CreateUser(int id, String name) {
				return new User(id, name);
			}
		};
		User u = user.CreateUser(102, "Michle");
		System.out.println(u.id+" "+u.name);
		System.out.println("---------Now Using Lambda-------------");
		/*
		 * Using Lambda Expression
		 */
		
		Userfactory u1 = (int id, String name)->new User(id, name);
		User u2 = u1.CreateUser(105, "Jhon");
		System.out.println(u2.id+" "+u2.name);
		
		System.out.println("---------Now Using Constructor Reference-------------");
		/*
		 * Using Constructor Reference
		 */
		
		Userfactory u3 = User::new ;
		User u4 = u3.CreateUser(54, "Apostek");
		
	}
}


class User{
	int id;
	String name;
	public User(int id, String name){
		this.id = id;
		this.name = name;
	}
}
interface Userfactory{
	public User CreateUser(int id, String name);
}
