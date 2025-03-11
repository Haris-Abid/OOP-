public class Address{

	String city , street;
	
	public Address(String street,String City){
		this.street=street;
		this.city=city;
	
	}	

	public Address(Address other){
		this.street=other.street;
		this.city=other.city;
	}

	@Override
	public boolean equals(Object obj){
		Address other =  (Address) obj;
		return this.street.equals(other.street) && this.city.equals(other.city);
		
	} 
}