package micro.code;

interface InterfaceDemo {
	default public void displayNameDefault(String name) {
		System.out.println("Your name is : " + name);
	}

	public void displayName(String name);

	public void displayNameAndDesignation(String name, String designation);
}

public class InterFace implements InterfaceDemo {

	@Override
	public void displayName(String name) {
		System.out.println("Your name is : "+name);
	}

	@Override
	public void displayNameAndDesignation(String name, String designation) {
		System.out.println("Enter U Name : "+name + "  " + designation);
	}

	public static void main(String[] args) {

		
		//InterFace i = new InterFace();
		InterfaceDemo user;
		user =new InterFace();
		user.displayName("Hello");
		user.displayNameDefault("Java");
		user.displayNameAndDesignation("Tanmay", "Jr Java Developer");
		/*
		 * i.displayName("TT"); i.displayNameAndDesignation("Tanmay",
		 * "Jr Java Developer"); i.displayNameDefault("hello");
		 */
	}

}
