public class Lab{
	private String name;
	private Employee labStaff;
	private SystemUnit[] systemUnit=new SystemUnit[50];
	private boolean hasMultimedia; 

	public Lab(String name, String employeeName,String designation,SystemUnit[] systemUnit,boolean hasMultimedia){
		this.name=name;
		labStaff= new Employee (employeeName,designation);
		
		this.hasMultimedia=hasMultimedia;
	}

//setters

	public void setName(String name){this.name=name;}
	public void setHasMultimedia(boolean hasMultimedia){this.hasMultimedia=hasMultimedia;}

	public String getName(){return name;}
	public boolean getHasMultimedia(){return hasMultimedia;}
}