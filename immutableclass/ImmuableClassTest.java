package immutableclass;

public class ImmuableClassTest {
	public static void main(String[] args) {
		Address ad = new Address("Bangalore", "Karnataka");
		Student s = new Student("Sadhna", 1, ad);
		System.out.println(s);

		Address address = s.getAddress();
		address.setCity("Patna");
		address.setState("Bihar");
		System.out.println(s);

	}
}
