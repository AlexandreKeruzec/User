package user;

public class User {
	String name;
	int age;
	boolean isMale;
	
	public User(String name, int age, boolean isMale) {
		super();
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	public String toString() {
		return "User name : " + name + "\n     age : " + age + "\n     isMale : " + isMale;
	}

}
