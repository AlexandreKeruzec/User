package user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList();
		// creating and adding users
		User u1 = new User("John", 20, true);
		users.add(u1);
		User u2 = new User("Pierre", 34, true);
		users.add(u2);
		User u3 = new User("Jeanne", 22, false);
		users.add(u3);
		User u4 = new User("Pierrette", 55, false);
		users.add(u4);
		User u5 = new User("Auguste", 82, true);
		users.add(u5);
		User u6 = new User("Germain", 93, true);
		users.add(u6);
		User u7 = new User("Thomas", 12, true);
		users.add(u7);
		User u8 = new User("Micheline", 78, false);
		users.add(u8);
		User u9 = new User("Chloe", 14, false);
		users.add(u9);
		User u10 = new User("Nathalie", 38, false);
		users.add(u10);
		
		// displaying the users
		for(User user : users) {
			System.out.println(user.toString() + "\n");
		}
		
		// sorting the users by name
		Collections.sort(users, new Comparator<User>() {
		    public int compare(User u1, User u2) {
		        return u1.getName().compareTo(u2.getName());
		    }
		});
		
		System.out.println("\nsorted alphabeticaly\n\n");
		
		// displaying the users sorted by names
		for(User user : users) {
			System.out.println(user.toString() + "\n");
		}
		
		// removing some users
		users.remove(8);
		users.remove(7);
		
		System.out.println("\nafter removal of Pierre and Pierrette\n\n");
		
		for(User user : users) {
			System.out.println(user.toString() + "\n");
		}
		
	}

}
