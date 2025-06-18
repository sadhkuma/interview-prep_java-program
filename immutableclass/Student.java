package immutableclass;

final public class Student {//
	final private String name;
	final private int id;
	final Address address;

	public Student(String name, int id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public Address getAddress() {
		return new Address(address.getCity(), address.getState());
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
}
