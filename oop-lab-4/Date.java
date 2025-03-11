public class Date{
	int day,month,year;


	public Date(int day,int month , int year){
		this.day=day;
		this.year=year;
		this.month=month;
	}

	public Date(Date other){
		this.day=other.day;
		this.year=other.year;
		this.month=other.month;
	}
	

	@Override
	public boolean equals(Object obj){
		Date other= (Date) obj;
		return this.day==other.day && this.month==other.month && this.year==other.year;
	}

	
}