package person;

public class PersonDemo {

	public static void main(String[] args) {
		Person person = new Person();

		person.setName("Kiran");
		person.setAge(99);
		person.setAddress("10, Downing Street");

		System.out.println("Displaying by getters and setters... ");
		System.out.println(person.getName() + " is " + person.getAge() + " years old and he lives at "
				+ person.getAddress() + ".");

		System.out.println("Displaying by toString()... "); // bonus!! ;-)
		System.out.println(person);
	}

}
