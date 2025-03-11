public class Person {
	String name,role;
	Address address;

	Person (String name, String role , Address address){
		this.name = name;
		this.role=role;
		this.address=new Address (address);
	}

	Person (Person other){
		this.name = name;
		this.role=role;
		this.address=new Address(other.address);
	}
	

	@Override
	public boolean equals(Object obj){
		Person other=(Person) obj;
		return this.name.equals(other.name) && this.role.equals(other.role) && this.address.equals(other.address);
	
	}
}