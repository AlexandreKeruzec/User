package user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<User> users1 = new ArrayList();
		ArrayList<User> users2 = new ArrayList();
		// creating and adding users
		User u1 = new User("John", 20, true);
		users1.add(u1);
		User u2 = new User("Pierre", 34, true);
		users1.add(u2);
		User u3 = new User("Jeanne", 22, false);
		users1.add(u3);
		User u4 = new User("Pierrette", 55, false);
		users1.add(u4);
		User u5 = new User("Auguste", 82, true);
		users1.add(u5);
		User u6 = new User("Germain", 93, true);
		users2.add(u6);
		User u7 = new User("Thomas", 12, true);
		users2.add(u7);
		User u8 = new User("Micheline", 78, false);
		users2.add(u8);
		User u9 = new User("Chloe", 14, false);
		users2.add(u9);
		User u10 = new User("Nathalie", 38, false);
		users2.add(u10);
		
		// displaying the users
		for(User user : users1) {
			System.out.println(user.toString() + "\n");
		}
		
		// sorting the users by name
		Collections.sort(users1, new Comparator<User>() {
		    public int compare(User u1, User u2) {
		        return u1.getName().compareTo(u2.getName());
		    }
		});
		
		System.out.println("\nsorted alphabetically\n\n");
		
		// displaying the users sorted by names
		for(User user : users1) {
			System.out.println(user.toString() + "\n");
		}
		
		// removing some users
		users1.remove(u2);
		users1.remove(u4);
		
		System.out.println("\nafter removal of Pierre and Pierrette\n\n");
		
		// displaying the users with an iterator
		ListIterator<User> iterator = users1.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString() + "\n");
		}
		
		System.out.println("\nmerging with another list\n\n");
		
		// merging both arraylist in a new one
		ArrayList<User> users = new ArrayList();
		users.addAll(users1);
		users.addAll(users2);
		
		// display the new list
		for(User user : users) {
			System.out.println(user.toString() + "\n");
		}
		
	}

}
